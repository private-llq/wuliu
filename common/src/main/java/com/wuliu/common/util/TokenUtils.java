package com.wuliu.common.util;

import com.wuliu.common.constant.CommonConstant;
import com.wuliu.common.system.api.ISysBaseAPI;
import com.wuliu.common.system.util.JwtUtil;
import com.wuliu.common.system.vo.LoginUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.AuthenticationException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author scott
 * @Date 2019/9/23 14:12
 * @Description: 编程校验token有效性
 */
@Slf4j
public class TokenUtils {

    /**
     * 获取 request 里传递的 token
     *
     * @param request
     * @return
     */
    public static String getTokenByRequest(HttpServletRequest request) {
        String token = request.getParameter("token");
        if (token == null) {
            token = request.getHeader("X-Access-Token");
        }
        return token;
    }

    /**
     * 验证Token
     */
    public static boolean verifyToken(HttpServletRequest request, ISysBaseAPI sysBaseAPI, RedisUtil redisUtil) {
        log.info(" -- url --" + request.getRequestURL());
        String token = getTokenByRequest(request);

        if (StringUtils.isBlank(token)) {
            throw new AuthenticationException("token不能为空!");
        }

        // 解密获得username，用于和数据库进行对比
        String username = JwtUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token非法无效!");
        }

        // 查询用户信息
        LoginUser user = sysBaseAPI.getUserByName(username);
        if (user == null) {
            throw new AuthenticationException("用户不存在!");
        }
        // 判断用户状态
        if (user.getStatus() != 1) {
            throw new AuthenticationException("账号已被锁定,请联系管理员!");
        }
        // 校验token是否超时失效 & 或者账号密码是否错误
        if (!jwtTokenRefresh(token, username, user.getPassword(), redisUtil)) {
            throw new AuthenticationException("Token失效，请重新登录!");
        }
        return true;
    }

    /**
     * 刷新token（保证用户在线操作不掉线）
     *
     * @param token     token 码
     * @param userName  用户名
     * @param passWord  密码
     * @param redisUtil redis
     * @return boolean
     */
    private static boolean jwtTokenRefresh(String token, String userName, String passWord, RedisUtil redisUtil) {
        String cacheToken = String.valueOf(redisUtil.get(CommonConstant.PREFIX_USER_TOKEN + token));
        if (oConvertUtils.isNotEmpty(cacheToken)) {
            // 校验token有效性
            if (!JwtUtil.verify(cacheToken, userName, passWord)) {
                String newAuthorization = JwtUtil.sign(userName, passWord);
                // 设置Token缓存有效时间
                redisUtil.set(CommonConstant.PREFIX_USER_TOKEN + token, newAuthorization);
                redisUtil.expire(CommonConstant.PREFIX_USER_TOKEN + token, JwtUtil.EXPIRE_TIME * 2 / 1000);
            }
            return true;
        }
        return false;
    }

}

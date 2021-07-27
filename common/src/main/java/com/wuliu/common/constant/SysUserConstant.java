package com.wuliu.common.constant;

import com.wuliu.common.system.vo.LoginUser;
import org.apache.shiro.SecurityUtils;

public interface SysUserConstant {
    /**
     * 当前登录用户
     */
    public static final LoginUser SYS_USER = (LoginUser) SecurityUtils.getSubject().getPrincipal();
}

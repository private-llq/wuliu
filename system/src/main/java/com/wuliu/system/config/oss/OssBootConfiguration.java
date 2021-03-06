package com.wuliu.system.config.oss;
import com.wuliu.common.util.oss.OssBootUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云oss存储配置类
 * @author bai
 * @date 2021/3/4
 */
@Configuration
public class OssBootConfiguration {
    @Value("${jeecg.oss.endpoint}")
    private String endpoint;
    @Value("${jeecg.oss.accessKey}")
    private String accessKeyId;
    @Value("${jeecg.oss.secretKey}")
    private String accessKeySecret;
    @Value("${jeecg.oss.bucketName}")
    private String bucketName;
    @Value("${jeecg.oss.staticDomain}")
    private String staticDomain;

    /**
     * 初始化
     */
    @Bean
    public void initOssBootConfiguration() {
        OssBootUtil.setEndPoint(endpoint);
        OssBootUtil.setAccessKeyId(accessKeyId);
        OssBootUtil.setAccessKeySecret(accessKeySecret);
        OssBootUtil.setBucketName(bucketName);
        OssBootUtil.setStaticDomain(staticDomain);
    }
}

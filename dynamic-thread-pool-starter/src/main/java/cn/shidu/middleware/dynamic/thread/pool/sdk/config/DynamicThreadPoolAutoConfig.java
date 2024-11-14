package cn.shidu.middleware.dynamic.thread.pool.sdk.config;

/*
 *@title DynamicThreadPoolAutoConfig
 *@description  动态位置配置入口
 *@author 孙悟饭
 *@version 1.0
 *@create 2024/11/14 10:06
 */
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class DynamicThreadPoolAutoConfig {

    private final Logger logger = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    @Bean("dynamicThreadPoolService")
    public String dynamicThreadPoolService(ApplicationContext applicationContext, Map<String,ThreadPoolExecutor> threadPoolExecutorMap){
        String applicationName = applicationContext.getEnvironment().getProperty("spring.application.name");

        if (StringUtils.isBlank(applicationName)) {
            applicationName = "缺省的";
            logger.warn("动态线程池，启动提示。SpringBoot 应用未配置 spring.application.name 无法获取到应用名称！");
        }

//        logger.info("线程池信息：{}", JSON.toJSONString(threadPoolExecutorMap.keySet()));
        Set<String> threadPoolExecutorMapKeys = threadPoolExecutorMap.keySet();
        return new String();
    }
}

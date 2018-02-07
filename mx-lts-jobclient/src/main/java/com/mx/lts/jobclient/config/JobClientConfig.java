/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)JobClientConfig.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.jobclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.ltsopensource.jobclient.JobClient;
import com.github.ltsopensource.spring.JobClientFactoryBean;
import com.mx.lts.jobclient.handler.JobCompletedHandlerImpl;
import com.mx.lts.jobclient.listener.MasterChangeListenerImpl;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="JobClientConfig.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:16:51
 */
@Configuration
public class JobClientConfig {
    //private static final Logger LOGGER = LoggerFactory.getLogger(JobClientConfig.class);

    @SuppressWarnings("rawtypes")
    @Bean(name = "jobClient")
    public JobClient getJobClient() throws Exception {
        JobClientFactoryBean factoryBean = new JobClientFactoryBean();
        factoryBean.setJobCompletedHandler(new JobCompletedHandlerImpl());
        factoryBean.setLocations("lts-jobclient.properties");
        factoryBean.setMasterChangeListeners(new MasterChangeListenerImpl());
        factoryBean.afterPropertiesSet();
        factoryBean.start();
        return factoryBean.getObject();
    }
}

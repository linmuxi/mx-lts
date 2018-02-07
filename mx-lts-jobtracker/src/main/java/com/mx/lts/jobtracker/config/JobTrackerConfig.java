/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)JobTrackerConfig.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.jobtracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.ltsopensource.jobtracker.JobTracker;
import com.github.ltsopensource.spring.JobTrackerFactoryBean;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="JobTrackerConfig.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:26:30
 */
@Configuration
public class JobTrackerConfig {

    @Bean(name = "jobTracker")
    public JobTracker getJobTracker() throws Exception {
        JobTrackerFactoryBean factoryBean = new JobTrackerFactoryBean();
        factoryBean.setLocations("lts-jobtracker.properties");
        factoryBean.afterPropertiesSet();
        factoryBean.start();
        return factoryBean.getObject();
    }

}
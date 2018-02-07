/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)TaskTrackerConfig.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.tasktracker.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.ltsopensource.spring.TaskTrackerAnnotationFactoryBean;
import com.github.ltsopensource.tasktracker.TaskTracker;
import com.mx.lts.tasktracker.job.ReceiveJobRunner;
import com.mx.lts.tasktracker.listener.MasterChangeListenerImpl;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="TaskTrackerConfig.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:31:03
 */
@Configuration
public class TaskTrackerConfig implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Bean(name = "taskTracker")
    public TaskTracker getTaskTracker() throws Exception {
        TaskTrackerAnnotationFactoryBean factoryBean = new TaskTrackerAnnotationFactoryBean();
        factoryBean.setApplicationContext(applicationContext);
        factoryBean.setJobRunnerClass(ReceiveJobRunner.class);
        factoryBean.setLocations("lts-tasktracker.properties");
        factoryBean.setMasterChangeListeners(new MasterChangeListenerImpl());
        factoryBean.afterPropertiesSet();
        factoryBean.start();
        return factoryBean.getObject();
    }

}
/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)Startup.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.jobtracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * 
 * <p>
 * <a href="Startup.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0
 * @date 2018年2月7日 上午10:24:24
 */
public class Startup {
    private static final Logger LOGGER = LoggerFactory.getLogger(Startup.class);

    public static void main(String[] args) {
        LOGGER.info("-----------------开始启动jobtracker-----------------");
        try {
            new ClassPathXmlApplicationContext("applicationContext.xml");
            LOGGER.info("-----------------启动jobtracker完成-----------------");
            //System.out.println("-----------------jobtracker启动成功 Server startup--------------------");
        } catch (Exception e) {
            //System.out.println("-----------------jobtracker启动异常--------------------");
            LOGGER.error("-----------------启动jobtracker发生异常-----------------", e);
        }
    }

}

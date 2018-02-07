/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)SpringBean.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.tasktracker.service;

import org.springframework.stereotype.Service;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="SpringBean.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:32:18
 */
@Service
public class SpringBean {

    public void hello(){
        System.out.println("我是SpringBean，我执行了");
    }
}

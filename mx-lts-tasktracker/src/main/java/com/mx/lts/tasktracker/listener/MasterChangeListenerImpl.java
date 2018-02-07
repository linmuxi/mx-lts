/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)MasterChangeListenerImpl.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.tasktracker.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.ltsopensource.core.cluster.Node;
import com.github.ltsopensource.core.listener.MasterChangeListener;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="MasterChangeListenerImpl.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:31:53
 */

public class MasterChangeListenerImpl implements MasterChangeListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(MasterChangeListenerImpl.class);
    
    /**
     * 节点变化 监听
     * @param master master节点
     * @param isMaster 表示当前节点是不是master节点
     */
    public void change(Node master, boolean isMaster) {
        LOGGER.info("监听到节点变化,Node:{},isMaster:",master,isMaster);
    }

}

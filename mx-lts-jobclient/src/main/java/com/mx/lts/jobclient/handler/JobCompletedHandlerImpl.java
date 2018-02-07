/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)JobCompletedHandlerImpl.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.jobclient.handler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.ltsopensource.core.commons.utils.CollectionUtils;
import com.github.ltsopensource.core.domain.JobResult;
import com.github.ltsopensource.jobclient.support.JobCompletedHandler;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="JobCompletedHandlerImpl.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:18:12
 */

public class JobCompletedHandlerImpl implements JobCompletedHandler {
     private static final Logger LOGGER = LoggerFactory.getLogger(JobCompletedHandlerImpl.class);


    /**
     * {@inheritDoc}
     */
    public void onComplete(List<JobResult> jobResults) {
        // 任务执行反馈结果处理
        if (CollectionUtils.isNotEmpty(jobResults)) {
            for (JobResult jobResult : jobResults) {
                LOGGER.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 任务执行完成：" + jobResult);
            }
        }
    }
}

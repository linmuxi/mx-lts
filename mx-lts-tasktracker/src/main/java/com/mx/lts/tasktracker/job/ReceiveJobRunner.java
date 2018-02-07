/* 
 * Copyright (C), 2015-2018
 * File Name: @(#)ReceiveJobRunner.java
 * Encoding UTF-8
 * Author: hunter@linmuxi.com
 * Version: 1.0
 * Date: 2018年2月7日
 */
package com.mx.lts.tasktracker.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.runner.JobContext;
import com.github.ltsopensource.tasktracker.runner.JobRunner;
import com.mx.lts.tasktracker.service.SpringBean;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="ReceiveJobRunner.java"><i>View Source</i></a>
 * 
 * @author hunter@linmuxi.com
 * @version 1.0
 * @since 1.0 
 * @date 2018年2月7日 上午10:31:24
 */
public class ReceiveJobRunner implements JobRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReceiveJobRunner.class);

    @Autowired
    private SpringBean springBean;
    
    /**
     * {@inheritDoc}
     */
    public Result run(JobContext jobContext) throws Throwable {
        LOGGER.info("接受到任务了,{}",jobContext);
        try {
            //Thread.sleep(1000L);
            //springBean.hello();

            // TODO 业务逻辑
            LOGGER.info("任务执行完毕：" + jobContext);
        } catch (Exception e) {
            LOGGER.info("Run job failed!", e);
            return new Result(Action.EXECUTE_LATER, e.getMessage());
        }
        return new Result(Action.EXECUTE_SUCCESS, "执行成功了，哈哈");
    }

}

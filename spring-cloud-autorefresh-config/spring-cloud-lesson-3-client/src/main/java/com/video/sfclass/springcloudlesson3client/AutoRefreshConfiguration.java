package com.video.sfclass.springcloudlesson3client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 类描述: 实现自动刷新客户端配置
 *
 * @author wallfacers
 * @date 2018/9/12 22:04
 * @email <a href="wallfacerswu@gamil.com">wallfacers</a>
 * @sine 1.8
 */
@Configuration
public class AutoRefreshConfiguration {

    @Autowired
    private ContextRefresher contextRefresher;

    /**
     * 定时去执行某个方法，refresh方法可以让客户端去拉取配置文件
     */
    @Scheduled(fixedRate = 2000L)
    public void autoRefreshConfig() {
        contextRefresher.refresh();
    }

}

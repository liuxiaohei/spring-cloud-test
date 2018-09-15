package com.video.sfclass.springcloudlesson3.configuration;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

/**
 * 类描述：自定义health
 *
 * @author wallfacers
 * @date 2018/9/12 23:06
 * @email <a href="wallfacerswu@gamil.com">wallfacers</a>
 * @sine 1.8
 */
@Configuration
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        Health.Builder builder = Health.status(Status.UP);
        builder.withDetail("myName", "wallfacers");
        builder.withDetail("timeStamp", Instant.now());
        return builder.build();
    }
}


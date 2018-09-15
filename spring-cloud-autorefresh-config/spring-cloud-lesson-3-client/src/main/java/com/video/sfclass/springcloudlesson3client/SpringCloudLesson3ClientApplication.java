package com.video.sfclass.springcloudlesson3client;

import com.video.sfclass.springcloudlesson3client.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Person.class)
public class SpringCloudLesson3ClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCloudLesson3ClientApplication.class, args);
	}
}

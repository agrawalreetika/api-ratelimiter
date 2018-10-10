package com.service.ratelimiter.limiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.service.ratelimiter.beans")
public class LimiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimiterApplication.class, args);
	}
}

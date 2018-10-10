package com.service.ratelimiter.beans;

import org.springframework.context.annotation.*;
import com.service.ratelimiter.model.ApiLimits;
import com.service.ratelimiter.model.Requests;

@Configuration
public class AppConfig {
	

    @Bean
    public ApiLimits limitsBean() {
        return new ApiLimits();
    }
    
    @Bean
    public Requests requestsBean() {
        return new Requests();
    }
    
}

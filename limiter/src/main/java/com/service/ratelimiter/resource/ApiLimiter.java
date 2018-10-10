package com.service.ratelimiter.resource;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.ratelimiter.model.ApiLimits;
import com.service.ratelimiter.model.Identity;
import com.service.ratelimiter.model.Requests;

@RestController
@RequestMapping("/limit")
public class ApiLimiter {
	
//	@Autowired
//	RestTemplate restTemplate;
	
	@Autowired
	Requests requests;
	
	@GetMapping("/{limitUrl}/{userId}")
	public Boolean GetFullUrl(@PathVariable("limitUrl") final String limitUrl,@PathVariable("userId") final String userId) {

//		String dbfetchUrl = "http://db-service/apilimiterdb/" + limitUrl + "/" + userId;
//		ResponseEntity<String> quoteResponse = restTemplate.getForEntity(dbfetchUrl, String.class);
		
		long currentTimestamp = System.currentTimeMillis();
		if(requests.IsValid(new Identity(userId, limitUrl), currentTimestamp)) {
			return true;
		}
		return false;
	}
}

package com.service.ratelimiter.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/limit")
public class ApiLimiter {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{limitUrl}/{userId}")
	public String GetFullUrl(@PathVariable("limitUrl") final String limitUrl,@PathVariable("userId") final String userId) {

		String dbfetchUrl = "http://db-service/apilimiterdb/" + limitUrl + "/" + userId;
		ResponseEntity<String> quoteResponse = restTemplate.getForEntity(dbfetchUrl, String.class);

		return quoteResponse.getBody();
	}
}

package com.service.ratelimiter.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ApiLimits {
	Map<String, Integer> requests;
	
	//fetch from DB and update map
	public ApiLimits(){
		requests = new HashMap<String,Integer>();
		update();
	}
	
	private void update() {
		// TODO Auto-generated method stub
		
	}

	public int GetLimit(String url) {
		if(requests.containsKey(url))
			return requests.get(url);
		
		return -1;
	}
}

package com.service.dbservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.dbservice.repositories.AllUrlRepository;
import com.service.dbservice.tables.UrlsList;

@RestController
@RequestMapping("/apilimiterdb")
public class DbServices {
	@Autowired
	private AllUrlRepository allurls;
	
//	@GetMapping("/{id}")
//	public UrlsList getUrlFromDb1(@PathVariable("id") final String id) {
//
//		System.out.println("######################");
//		System.out.println(id + "::" + id);
//		System.out.println("######################");
//		return allurls.findOne(id);
//	}
	 
	 @GetMapping("/{limitUrl:.+}") 
		public UrlsList getUrlFromDb(@PathVariable("limitUrl")final String limitUrl){
			
//			System.out.println("######################");
//			System.out.println(limitUrl + "::" + limitUrl);
//			System.out.println("######################");
			//UrlsList row = allurls.getUrlRow(limitUrl);
			return allurls.findUrlRow(limitUrl);	
		}
}

package com.geekster.urlhitcounter.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.urlhitcounter.model.MyAccount;
import com.geekster.urlhitcounter.services.UrlHitService;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
	
	
	@Autowired
	public UrlHitService urlHitService;
	
	@GetMapping("count")
	public HashMap<String,Integer> getHitCount() {
		
		
	return	urlHitService.getHitCount();}
	
	@GetMapping("username/{username}/count")
	
	public MyAccount getHitByUsername(@PathVariable("username") String username) {
		
		return urlHitService.getHitByUsername(username);
	}
	
	
	
	
		
		
		
		
		
		
		
	
	
	
	

}

package com.geekster.urlhitcounter.model;

import org.springframework.stereotype.Component;

@Component
public class MyAccount {
	
	private String username;
	private int hitcount;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	
	
	
	

}

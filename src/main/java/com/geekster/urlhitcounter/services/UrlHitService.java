package com.geekster.urlhitcounter.services;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.urlhitcounter.model.MyAccount;
import com.geekster.urlhitcounter.repositary.UrlHitDao;

@Service
public class UrlHitService {
	
	
	@Autowired
	private UrlHitDao counterDao;
	@Autowired
	private MyAccount myaccount;

	public HashMap<String,Integer> getHitCount() {
		
		HashMap<String,Integer>map=counterDao.getMap1();
		map.put("visitors",map.getOrDefault("visitors",0)+1);
		
		counterDao.setMap1(map);
		
		return map;
		
		
	}
	

	public MyAccount getHitByUsername(String username) {
		
		
		HashMap<String,Integer>map=counterDao.getMap2();
		map.put(username,map.getOrDefault(username,0)+1);
		myaccount.setUsername(username);
		myaccount.setHitcount(map.get(username));
		ArrayList<MyAccount>myaccountList=counterDao.getMyaccount();
		myaccountList.add(myaccount);
		counterDao.setMyaccount(myaccountList);
		
		
		return  myaccount;
	}
	
	
	
	
	

}

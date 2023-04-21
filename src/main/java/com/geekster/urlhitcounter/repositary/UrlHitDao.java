package com.geekster.urlhitcounter.repositary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.geekster.urlhitcounter.model.MyAccount;


@Repository
public class UrlHitDao {
	
	
	private HashMap<String,Integer>map1=new HashMap<>();
	private HashMap<String,Integer>map2=new HashMap<>();
	
	private ArrayList<MyAccount>myaccount=new ArrayList<>();
	
	
	

	public ArrayList<MyAccount> getMyaccount() {
		return myaccount;
	}



	public void setMyaccount(ArrayList<MyAccount> myaccount) {
		this.myaccount = myaccount;
		
	}



	public HashMap<String, Integer> getMap1() {
		return map1;
	}



	public void setMap1(HashMap<String, Integer> map1) {
		this.map1 = map1;
	}



	public HashMap<String, Integer> getMap2() {
		return map2;
	}



	public void setMap2(HashMap<String, Integer> map2) {
		this.map2 = map2;
	}



	



//	public HashMap<String,Integer> getHitCount() {
//		
//		 map.put("visitors",map.getOrDefault("visitor",0)+1);
//		 
//		 return map;
//		
//	}
	
	

}

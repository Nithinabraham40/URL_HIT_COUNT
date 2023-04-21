# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - Eclipse >=4.55.0
 - Postman >=10.13


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - Framework :  SpringBoot
 - Language :  Java

# DataFlow

<b><span style="color: white;">Controller</span></b>

1. *@GetMapping("count")*
```
public HashMap<String,Integer> getHitCount() {
		
		
	return	urlHitService.getHitCount();}
```
2. *@GetMapping("username/{username}/count")*
```
	public MyAccount getHitByUsername(@PathVariable("username") String username) {
		
		return urlHitService.getHitByUsername(username);
	}
```

<b><span style="color: white;">Services</span></b>

1.*urlHitService.getHitCount()*

```
    public HashMap<String,Integer> getHitCount() {
		
		HashMap<String,Integer>map=counterDao.getMap1();
		map.put("visitors",map.getOrDefault("visitors",0)+1);
		
		counterDao.setMap1(map);
		
		return map;
		
		
	}
```
2.*urlHitService.getHitByUsername(username)*
```
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
```

<b><span style="color: white;">Repository</span></b>
  
  1. *getMap1()*
  ```
  public HashMap<String, Integer> getMap1() {
		return map1;
	}
  ```
  2. *setMap1(HashMap<String, Integer> map1)*
  ```
  public void setMap1(HashMap<String, Integer> map1) {
		this.map1 = map1;
	}
  ```
  3. *getMap2()*
   
   ```
  public HashMap<String, Integer> getMap2() {
		return map2;
	}
   ```
   4. *setMap2(HashMap<String, Integer> map2)*

```
	
	public void setMap2(HashMap<String, Integer> map2) {
		this.map2 = map2;
	}
		
	
```
5. *getMyaccount()*

```
	
	public ArrayList<MyAccount> getMyaccount() {
		return myaccount;
	}
		
	
```
6. *setMyaccount(ArrayList<MyAccount> myaccount)*

```
	
	
	public void setMyaccount(ArrayList<MyAccount> myaccount) {
		this.myaccount = myaccount;
		
	}
		
	
```

 






# Datastructure Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

   *ARRAYLIST*

*HASHMAP*

</details>




# Summary

 Build a Simple url-hit-counter feature using spring boot


Endpoint provided are **api/v1/visitor-count-app/count**, 
**api/v1/visitor-count-appusername/{yourusername}/count**


# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  


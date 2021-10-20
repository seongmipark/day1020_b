package com.sist.exam06;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // Map 선언
		
		map.put("A", 65); //key값과 value
		map.put("B", 66); 
		map.put("C", 67);
		
		System.out.println("Map Value : " + map.get("A")); 
		System.out.println("Map Value : " + map.get("B")); 
		System.out.println("Map Value : " + map.get("C")); 
	}

}

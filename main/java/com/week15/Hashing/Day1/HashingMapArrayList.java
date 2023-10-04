package com.week15.Hashing.Day1;

import java.util.HashMap;

import org.junit.Test;

public class HashingMapArrayList {
//Map is an Interface and two dimensional collection
	//<Key,Value> pair
	private static final String Abstract = null;
    @Test
	public void main() {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		HashMap<String,Integer> Stringmap = new HashMap();
		Stringmap.put("Balaji Saravanan", 9976);
		Stringmap.put("Murali Saravanan", 87789);
		System.out.println(Stringmap);
		Stringmap.remove("Murali Saravanan");
		System.out.println(Stringmap);
		map.put(4, 14);
		map.put(1, 13);
	
		if(map.get(4)==14) {
			System.out.println(map.get(1));
		}
		map.put(2, 12);
		System.out.println(map.get(2));
		map.put(1, 14);
		map.clear();
		System.out.println(map);
		System.out.println(Stringmap);
		
		
		//Creating a map with Key and value pair
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		
		//Adding some values to Hashmap using put method
		hashmap.put("Balaji S", 10411);
		hashmap.put("Murali S", 12345);
		
		//printing the added elements in hashmap
		System.out.println(hashmap);
		
		//retriving the value using get method by key value
		System.out.println(hashmap.get("Balaji S"));
		System.out.println(hashmap.get("Murali S"));
		System.out.println(hashmap);
		
		//removing some value from hashmap using remove method and print the hashmap using key
		System.out.println(hashmap.remove("Murali S"));
		System.out.println(hashmap);
		
		//retrive the data from the hashmap using containKey method
		System.out.println(hashmap.containsKey("Balaji S"));
		//getorDefault method to set the default value if the key is not present in hashmap else return the key value
		System.out.println(hashmap.getOrDefault("Balaji S", 23));
		System.out.println(hashmap.getOrDefault("Balaji", 23));
		System.out.println(hashmap);
		hashmap.put("Murali S", 12345);
		hashmap.put("Vignesh", 12345);
		
		//entryset method 
		System.out.println(hashmap.entrySet());
		
		//Clone method 
		System.out.println(hashmap.clone());
		
		//clear method
		//System.out.print(hashmap.clear());
	}

}

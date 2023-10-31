package com.week18.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class SingleLinkedList {

	
/*	Consider you are having an array of strings ["a","b","c","a","b","c","a","e"] in
	which the strings will have duplicate values. You have to find each string's duplicate count.
	1. If the count of a particular string is odd, then print that string and its count
	2. If the count of a string is even, dont print
	 * */
	@Test
	public void validtestcase() {
		isduplicate(new String[] {"a","b","c","a","b","c","a","e"});
	}
	
	public List<String> isduplicate(String[] stringarray){
		
		
		List<String> stringList = new ArrayList<>();
		HashMap<String,Integer> hashmap = new HashMap<>();
		
		for (String each_Stringarray_String : stringarray) {
		hashmap.put(each_Stringarray_String, hashmap.getOrDefault(each_Stringarray_String, 0)+1);	
		}
		System.out.println(hashmap);
		for (int each_count : hashmap.values()) {
			if(each_count%2!=0) {
			//	stringList.add(hashmap.containsKey(each_count));
			}
			
		}
		return stringList;
	}
}

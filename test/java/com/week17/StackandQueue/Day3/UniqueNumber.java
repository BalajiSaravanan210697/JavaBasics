package com.week17.StackandQueue.Day3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumber {

	
	
	/*
	 * I/P - int[] , O/P - boolean
	 * 
	 * TC - O(N)   SC - O(N)
	 * 
	 * 
	 * Initialize the hashmap with Integer,Integer
	 * foreach to iterate all elements and store the count
	 * foreach to iterate all elements in and check that value not equal else return false
	 * return true
	 * */
	@Test
	public void test() {
		Assert.assertEquals(true, isUnique(new int[] {1,2,2,1,1,3}));
	}
	@Test
	public void test1() {
		Assert.assertEquals(false, isUnique(new int[] {1,1,2,2}));
	}
	public boolean isUnique(int[] arr) {
		
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for (int each_element : arr) {
			hashmap.put(each_element, hashmap.getOrDefault(each_element,0)+1);
		}
		
		for (Integer each_map_elment : hashmap.values()) {
			if(hashset.add(each_map_elment)==false) return false;
		}	
		return true;
		
	}
}

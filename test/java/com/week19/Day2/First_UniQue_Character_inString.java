package com.week19.Day2;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;


public class First_UniQue_Character_inString {

	/*
	
	I/P  - String  O/P - int
	
	TC - O(2N) --> O(N)   SC - O(N)
	
	Approaches - HashMap 
	
	Pesudo Code : 
	
	Initialise the HashMap with Character and Integer pair 
	
	foreach to iterate the characters from String 
	Add the Characters and count of character to the map 
	
	for loop to iterate the String 
	if the String Character is present in the map and that having count of one than 
	return the index
	
	return minus one otherwise
	
	
	Approaches - HashSet
	
	
	 */
	@Test
	public void testcase() {
		Assert.assertEquals(0, firstUniqChar("leetcode"));
	}
	@Test
	public void testcase1() {
		Assert.assertEquals(2, firstUniqChar("loveleetcode"));
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(-1, firstUniqChar("aabb"));
	}
	
	
	public int firstUniqChar(String s) {
		// Initialise the HashMap with Character and Integer pair
		HashMap<Character, Integer> map = new HashMap<>();

		// foreach to iterate the characters from String

		for (char each_Char : s.toCharArray()) {
			// Add the Characters and count of character to the map
			map.put(each_Char, map.getOrDefault(each_Char, 0) + 1);
		}
		// for loop to iterate the String
		for (int index = 0; index < s.length(); index++) {
			// if the String Character is present in the map and that having count of one than
			if (map.get(s.charAt(index)) == 1 && map.containsKey(s.charAt(index))) {
				// return the index
				return index;
			}
		}
		// return minus one otherwise
		return -1;

	}

}

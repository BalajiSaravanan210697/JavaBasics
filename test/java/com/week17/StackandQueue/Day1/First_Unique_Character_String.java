package com.week17.StackandQueue.Day1;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class First_Unique_Character_String {

	/*
	 * I/P - String O/P - int
	 * 
	 * TC - O(2N) SC - O(N) 
	 * 
	 * Pseudo code 
	
	 --> Initialise HashMap with Character and Integer as key and value pair
	 --> foreach loop to iterate all the character from string 
	 -->  if the character is already present in the Map than increment the count
	 -->  else put the count as one
	 --> for loop to iterate the elements in the map 
	 --> if the character count is 1 than return the index of the character
	 --> return  minus one for if no unique character is present   
	  
	 * */
	@Test
	public void validTestCase() {
		Assert.assertEquals(0, firstUniqChar("leetcode"));
	}

	@Test
	public void validTestCase1() {
		Assert.assertEquals(2, firstUniqChar("loveleetcode"));
	}

	@Test
	public void validTestCase2() {
		Assert.assertEquals(-1, firstUniqChar("aabb"));
	}

	public int firstUniqChar(String s) {
		// Initialise HashMap with Character and Integer as key and value pair
		HashMap<Character, Integer> hashmap = new HashMap<>();
		// foreach loop to iterate all the character from string
		for (char element_from_String : s.toCharArray()) {
			// if the character is already present in the Map than increment the count else put the count as one
			hashmap.put(element_from_String, hashmap.getOrDefault(element_from_String, 0) + 1);
		}
		// for loop to iterate the elements in the map
		for (int i = 0; i < s.length(); i++) {
			// if the character count is 1 than return the index of the character
			if (hashmap.containsKey(s.charAt(i)) && hashmap.get(s.charAt(i)) == 1)
				return i;
		}
		// return minus one for if no unique character is present
		return -1;

	}

}

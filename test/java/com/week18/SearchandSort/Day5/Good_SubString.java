package com.week18.SearchandSort.Day5;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class Good_SubString {

	
	/*
	 * I/P - String O/P - int
	 * 
	 * PesudoCode:
	 
	 --> Create a function that check the Substring is unique and having unique characters
	 --> Initialize two pointers left and right left start from zero and right fixed window size + 1
	 --> Initialize the String to Store the SubString
	 --> while loop to iterate till the left pointer reaches the window size  -- subtract
	 --> Store the String using the SubString and check that has not replicate character 
	 --> increment the count 
	 --> return count
	 
	  TC - O(N2)  SC - O(N) 
	 * */
@Test	
public void validtestcase() {
	Assert.assertEquals(4, goodSubStringCount("aababcabc"));	
	
}	

@Test
public void valid() {
	Assert.assertEquals(true, isAnagram("anagram", "nagaram"));
	Assert.assertEquals(false, isAnagram("rat", "car"));
	
}

public boolean isAnagram(String s, String t) {
   // TC - O(N)  SC - O(N)
	HashMap<Character, Integer> hashmap1 = new HashMap<>();
	HashMap<Character, Integer> hashmap2 = new HashMap<>();
	
	if(s.length()!=t.length()) return false;

	for (char each_map1 : s.toCharArray()) {
		hashmap1.put(each_map1, hashmap1.getOrDefault(each_map1, 0) + 1);
	}
	for (char each_map2 : t.toCharArray()) {
		hashmap2.put(each_map2, hashmap2.getOrDefault(each_map2, 0) + 1);
	}
	return hashmap1.equals(hashmap2);

}
	public boolean isNotDuplicate(String s) {

		for (int i = 0; i < 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2)
					|| s.charAt(i + 1) == s.charAt(i + 2)) {
				return false;
			}

		}
		return true;
	}
	
	public int goodSubStringCount(String str) {

		int left = 0, right = 3, window = 3,count = 0;
		String substring = "";
		while (left < str.length() - window) {
			substring = str.substring(left, right);
			if (isNotDuplicate(substring) == true) {
				count++;
			}
			left++;
			right++;
		}
		return count;

	}

}

package com.weel18.Classworks_Day1;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Decode_String {

	/*
	 * I/P  - String O/P - String
	 * 
	 * TC - O(N)  SC - O(N)
	 * 
	 * Pseudo code:
	 * 
	  Initialize Stack to store the String from the String
	  Initialize String output to store the String operations
	  for each to iterate all the characters from the String
	  if the character equal to '[' than pick the current peek element from stack and store as an integer
	                   and push the next element from character to stack till it reaches ']'  - Store the String pushing to stack in string
	   else push the element to stack
	   return output
	 * 
	 */
	@Test
	public void validtestcase() {
		Assert.assertEquals("aaabcbc", decodeString("3[a]2[bc]"));
	}
	public String decodeString(String s) {
		Stack<Character> stack = new Stack<>();
		
		String output = "";

		for (char each_element_String : s.toCharArray()) {
            
			if(each_element_String == '[') {
				
			}else {
				stack.push(each_element_String);
			}
		}
		return output;

	}
}

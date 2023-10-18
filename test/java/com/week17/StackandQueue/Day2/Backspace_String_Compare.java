package com.week17.StackandQueue.Day2;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Backspace_String_Compare {

	/*
	 * I/P - String,String  O/P  - boolean
	 * 
	 * TC - O(N)  SC - O(N)
	 * 
	 * pesudo code:
	 * 
	  
	 Intialise two stack for store String s and String t 
	 foreach loop to iterate the each charaxcter from String s 
	 if the character equals to  '#' then pop the element else push the element
	 foreach loop to iterate the each charaxcter from String t
	 if the character equals to  '#' then pop the element else push the element
	 
	 compare both strings after the operation if both are equal return true
	 
	 * */
	@Test
	public void validtestcase() {
		Assert.assertEquals(true, backspaceCompare("ab#c","ad#c"));
	}
	@Test
	public void validtestcase1() {
		Assert.assertEquals(true, backspaceCompare("ab##","c#d#"));
	}
	@Test
	public void validtestcase2() {
		Assert.assertEquals(false, backspaceCompare("a#c","b"));
	}
	@Test
	public void validtestcase3() {
		Assert.assertEquals(true, backspaceCompare("y#fo##f","y#f#o##f"));
	}
	public boolean backspaceCompare(String s, String t) {
		// Intialise two stack for store String s and String t
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
        // foreach loop to iterate the each charaxcter from String s
		for (char s_string : s.toCharArray()) {
			// if the character equals to  '#' then pop the element
			if (s_string == '#'&&!stack1.isEmpty()) {
				stack1.pop();
			} else {
				//else push the element
				stack1.push(s_string);
			}
		}
		//foreach loop to iterate the each charaxcter from String t
		for (char t_string : t.toCharArray()) {
			// if the character equals to  '#' then pop the element 
			if (t_string == '#'&&!stack2.isEmpty()) {
				stack2.pop();
			} else {
				//else push the element
				stack2.push(t_string);
			}
		}
		// compare both stack after the operation if both are equal in size return true
		if (stack1.empty() && stack2.empty()) {
			return true;
		} else if (stack1.empty() && !stack2.empty()) {
			return false;
		} else if (!stack1.empty() && stack2.empty()) {
			return false;
		}
		// compare both stack after the operation if both are equal in size return true
		return stack2.equals(stack1);

	}
}

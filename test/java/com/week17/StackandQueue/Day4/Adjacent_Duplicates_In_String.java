package com.week17.StackandQueue.Day4;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Adjacent_Duplicates_In_String {

	
	/*
	 * I/P  - string with small alphabets  O/P - String
	 * 
	 * TC  - O(n)  SC - O(N)
	 pesudo code :
	 
	 Initialize Stack to store the String characters
	 Initialize StringBuilder named output to store the characters
	 foreach to iterate the each element in the String 
	 if the Stack is not empty and peek character equal to current character than pop the character
	 else push the character
	 foreach to iterate the characters from stack and store to string output
	 return the reversed String as output
	 * */
	@Test
	public void validtestcase() {
		Assert.assertEquals("ca", removeDuplicates("abbaca"));
	}

	@Test
	public void validtestcase1() {
		Assert.assertEquals("ay", removeDuplicates("azxxzy"));
	}

	public String removeDuplicates(String s) {

		Stack<Character> stack = new Stack<Character>();
		StringBuilder output = new StringBuilder();

		for (char each_character : s.toCharArray()) {

			if (!stack.isEmpty() && stack.peek() == each_character) {
				stack.pop();
			} else {
				stack.push(each_character);
			}
		}

		for (char each_stack_character : stack) {
			output.append(each_stack_character);
		}

		return output.toString();
	}

}

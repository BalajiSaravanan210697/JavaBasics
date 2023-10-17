package com.week17.StackandQueue.Day1;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class BaseballGame {

	
	/*
	 * input - String[]
	 * output - int
	 * 
	 * TC - O(2N) SC - O(N)
	 * 
	 * Pseudo code:
	 * Initialize Stack Data type to store each String 
	 * foreach loop to iterate the each String from String[]
	 * switch case to present String  -- based on the String 
	 *   case 1 : if the String is 'C' then remove element in peek
	 *   case 2 : if the String is 'D' then multiply the element at peek and insert into output array
	 *   case 3 : if the String '+' than add the elements of peek + peek -1 (OR) 
	 *             output array elements of last & last - 1 and insert into output array
	 *   default :  Add element to the output Array
	 *  Initialize sum to zero 
	 *  for loop to iterate the output array 
	 *  add elements from the output array 
	 *  return sum value  
	 * */
	@Test
	public void validtestcase() {
 	int actual = calPoints(new String[] { "5", "2", "C", "D", "+" });
		Assert.assertEquals(30, actual);
	}
	@Test
	public void validtestcase1() {
 		Assert.assertEquals(0,  calPoints(new String[] { "1","C"}));
	}
	@Test
	public void validtestcase2() {
		Assert.assertEquals(27,  calPoints(new String[] { "5","-2","4","C","D","9","+","+"}));
	}

	public int calPoints(String[] operations) {
		// Initialize Stack Data type to store each String
		Stack<Integer> stack = new Stack<Integer>();
		// foreach loop to iterate the each String from String[]
		for (String eachString : operations) {
			// switch case to present String -- based on the String
			switch (eachString) {
			// case 1 : if the String is 'C' then remove element in pop
			case "C":
				stack.pop();
				break;
			// case 2 : if the String is 'D' then multiply the element at peek and insert
			// into stack
			case "D":
				stack.push(stack.peek() * 2);
				break;
			// case 3 : if the String '+' than add the elements of peek + peek -1 - pop
			// first and add peek + pop and later push both
			case "+":
				int first = stack.pop();
				int seconvalue = stack.peek();
				stack.push(first);
				stack.push(first + seconvalue);
				break;
			// default : Add element to the stack
			default:
				stack.push(Integer.parseInt(eachString));
				break;

			}
		}
		// Initialize sum to zero
		int sum = 0;
		// while loop to iterate till stack size is not zero
		while (stack.size() > 0) {
			// add elements from the output array
			sum += stack.pop();
		}
		// return sum value
		return sum;

	}
}

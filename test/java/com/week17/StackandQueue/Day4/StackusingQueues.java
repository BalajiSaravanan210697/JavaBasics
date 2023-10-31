package com.week17.StackandQueue.Day4;

import java.util.Stack;

import org.junit.Test;

public class StackusingQueues {

	/*
	 * 
	
	 * 
	 * */
	
	public StackusingQueues() {
		StackusingQueues stackimple = new StackusingQueues();
	}
	 
		public void push(int x) {

		}
   @Test	
   public void validtestcase() {
	   operationStack(5);
   }
   
   public int operationStack(int n) {
	   
	   Stack<Integer> stack = new Stack<Integer>();
	   
	   stack.push(n);
	   
	   return n;
   }
	
}

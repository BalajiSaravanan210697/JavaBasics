package com.doublelinkedlist;

import java.util.Stack;

public class ValidParanthesis {

	//Stack implementation push,pop,peek
	/* i/p - String , o/p - booleam
	 * Get the string characters 
	 * for loop to iterate the character 
	 * if the character having the 
	 * */
	 public boolean isValid(String s) {
		 
		for (int i = 0; i < s.length(); i++) {
			Stack stack = new Stack();
			stack.push(s.charAt(i));
			System.out.println(stack);
	
		} 
		return true;
	      
	        
	    }
	
	
}

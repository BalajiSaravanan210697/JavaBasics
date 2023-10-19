package com.week17.StackandQueue.Day3;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class Number_of_Recent_Calls {

	
	/*
	 * I/P - String[],List<List<Integer>>   O/P - Queue<Integer>
	 * 
	 * TC - O(N)  - SC - O(N)  
	
	 Initialize the Queue of integer named requests to store the time stamps 
	   it's Initialized part of class to access other methods in class
	 while loop to check the Queue is not empty and the value at peek is less than t-3000 value 
	 than poll the value from the Queue
	 add the time stamps to the Queue using offer of t
	 return the size of the Queue Requests
	  
	 * 
	 * */
	
	// Initialize the Queue of integer named requests to store the time stamps
	Queue<Integer> requests;

	public void RecentCounter() {
		requests = new LinkedList<>();
	}

	public int ping(int t) {
       // while loop to check the Queue is not empty and the value at peek is less than t-3000 value 
		while (!requests.isEmpty() && requests.peek() < t - 3000) {
			// than poll the value from the Queue
			requests.poll();
		}
        // add the time stamps to the Queue using offer of t
		requests.offer(t);
		// return the size of the Queue Requests
		return requests.size();
	}

}

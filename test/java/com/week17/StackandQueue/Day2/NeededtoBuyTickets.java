package com.week17.StackandQueue.Day2;

import org.junit.Test;

public class NeededtoBuyTickets {

	
	/*
	 * I/P - int[],int O/P - int
	 * 
	 * TC - O(N)  SC - O(N)
      
     Initialize empty Queue to add tickets array to Queue   // Queue = []
     foreach loop to iterate the all array elements to the Queue  //
     Initialize counter variable to zero                          // counter = 0  
     while loop to iterate till the k position becomes zero       //
     if the value present in queue is greater than zero than decrement the value and increment counter  // 
     increment the k value                                        //
     else increment the counter                                   //
     return counter                                               //
	 * */
	@Test
	public void validtestcase() {
		timeRequiredToBuy(new int[] { 2, 3, 2 }, 2);
	}

	public int timeRequiredToBuy(int[] tickets, int k) {

		int count = 0;

		while (tickets[k] != 0) {
			for (int i = 0; i < tickets.length; i++) {
				if (tickets[i] > 0) {
					tickets[i] = tickets[i] - 1;
					count++;
				}
			}
		}
		return count;

	}
}

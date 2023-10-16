package com.week16.Day4;

import org.junit.Assert;
import org.junit.Test;



public class ConverttoBinary {

	/*
	 * input - ListNode - Head
	 * output - int
	 * 
	 * pesudocode
	 * 
	 * Intialise the varaible total to store the decimal value
	 * Initaialise the Listnode of temp to store the head value
	 * while loop to iterate till the temp reaches the null
	 * Assign total value to the total multiplied by 2 and add the temp value
	 * increment the temp to temp value
	 * return total
	 * 
	 */
@Test	
public void test() {
	
	ListNode head = new ListNode(1);
	head.next = new ListNode(0);
	head.next.next = new ListNode(1);
	int actual = getDecimalValue(head);
	System.out.println(actual);
	Assert.assertEquals(5, actual);
	
}	
	public int getDecimalValue(ListNode head) {
//Intialise the varaible total to store the decimal value
		int total = 0;
//Initaialise the Listnode of temp to store the head value
		ListNode temp = head;
//while loop to iterate till the temp reaches the null
		while (temp != null) {
			// Assign total value to the total multiplied by 2 and add the temp value
			total = (total * 2) + temp.val;
			// increment the temp to temp value
			temp = temp.next;
		}
//return total
		return total;

	}

}

package com.week16.LLandHashing.Day1;

import org.junit.Test;

public class SingleLinkedListImplementation {

	/*
	 * Addelements to the List
	 * if the head is null than assign head and tail to Node value 
	 * else assign the tail next reference value to newnode and assign back the tail next value to tail 
	 * */
	
	//addElements method -- return type void add Elements to the LList
	ListNode head = null,tail = null;
	public int size = 0;
	
	public ListNode addElements(int val) {

		if (head == null) {
			head = tail = new ListNode(val);
		} else {
			tail.next = new ListNode(val);
			tail = tail.next;
		}
		size++;
		return head;

	}
	@Test
	public void test() {
		ListNode head = new ListNode(2);
		head.next = new ListNode(24);
		System.out.println(head);
		System.out.println(head.next);
		System.out.println(size);
	}
}

package com.week17.StackandQueue.Day3;

import org.junit.Test;
import com.doublelinkedlist.ListNode;

public class Reorder_List {

	 int val;
	ListNode next;
	/*
	 * I/P - ListNode O/P - ListNode
	 * 
	 * TC - O(N)  SC - O(N)
	 * 
	 pesuodcode : 
	 
	 Initialize ListNode slow and fast to find the middle of the linkedlist
	 while loop to iterate till the fast pointer not null and fast pointer next in not null 
	 slow pointer assigned as head.next and fast node assigned as head.next.next
	 split the list using middle pointer (slow) and disconnect fisrt half
	 Reverse second half of the list
	 while loop to iterate till the second half not equal to null
	 Assign the current.next to next1 pointer and secondhalf.next to next2 pointer
	   
	 * 
	 * */
	Reorder_List(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
  
	public void reorderList(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode secondHalf = slow.next;
		slow.next = null;
		secondHalf = reverseList(secondHalf);
		ListNode current = head;
		while (secondHalf != null) {
			ListNode next1 = current.next;
			ListNode next2 = secondHalf.next;
			current.next = secondHalf;
			secondHalf.next = next1;
			current = next1;
			secondHalf = next2;
		}

	}
 
	ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;

		while (current != null) {
			ListNode nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}

		return prev;
	}

}

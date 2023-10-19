package com.doublelinkedlist;

import org.junit.Test;

public class ListNode {
//Please implement the Doubly Linked List - Add First, Add Last, Remove First, Remove Last methods.
/*	Node  -- value,previous , next
 * Empty List  -- No nodes 
 if the head value is null
 Adding  Node   -  previous - null and value  and next value is null  - initially -  and assign it into tail
 Node added initially   as head and tail and holding the reference of  the head and tail
 Adding another node to list  node - value previous and next null initially
 else  
 assign the previous value to the tail node value and and the next as null
 tail.next value as current new node value 
 and assign the tail as new node	*/
	
	int value;
	public ListNode next;
	ListNode previous;

	public ListNode(int value) {
		this.value = value;
		this.next = null;
		this.previous = null;
	}
	
	ListNode head = null;
	ListNode tail = null;
    public int size = 0;
	
    public void addNode(int value) {
	  ListNode newNode = new ListNode(value);
		if(head == null) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.next = tail;
			tail = newNode;			
		}
		size++;
	}
   
    /*
     * head value is already there so we need to identify the previous == null   -- head --> previous,next and value 
     * if previous value is value is null than add new node
     * Assign the previous value equal to new node value 
     * new node next value to the current head value 
     * Assign the new node as head  
     * 
     * */
	public void addFirst(int value) {
	 
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = tail = newNode;
		}
		if(head.previous == null) {
			head.previous = newNode;
			newNode.next = head;
			newNode = head;	
		}
		size++;
	}
	
}

package dsa.LinkedList.Day1;

import org.junit.Test;

public class LinkedListcreation {

	
	
	// Define Node  ->  Setup the Data and how that should be taken --> add into a List
	//data  -- 11,43,23,11,90
	@Test
	public void test() {
		
		Node head = addNode(11);
		head.next = addNode(43);
		head.next.next = addNode(23);
		head.next.next.next = addNode(11);
		head.next.next.next.next.next = addNode(23);
		
	}
	public class Node {
		// integer data type and data holds the integer value
		int data;
		// next node to be null
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head,tail;
	public Node addNode(int data) {

		if (head == null) {
			head = tail = addNode(data);
		} else {
			tail.next = addNode(data);
			tail = tail.next;
		}
		return addNode(data);
	}

}

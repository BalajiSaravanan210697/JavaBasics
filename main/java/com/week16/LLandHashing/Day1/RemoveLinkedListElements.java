package com.week16.LLandHashing.Day1;

import org.junit.Assert;
import org.junit.Test;

public class RemoveLinkedListElements {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - int[] , int
	 * output - int[]
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 1.Input: head = [1,2,6,3,4,5,6], val = 6  Output: [1,2,3,4,5]
	 * 2.Input: head = [], val = 1 Output: []
	 * 3.Input: head = [7,7,7,7], val = 7 Output: []
	 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize the the ListNode of head, tail, previous node equal to null 
	 > Assign the head node to current node (so current node is having our head value)
	 > if the current node is null return null
	 > if current node is not null than assign the head equal 
	 >  
	
	
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 * 
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */

@Test
public void test() {

	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(6);
	head.next.next.next = new ListNode(3);
	head.next.next.next.next = new ListNode(4);
	head.next.next.next.next.next = new ListNode(6);

	int val = 6;

	ListNode actual = removeElements(head, val);

	Assert.assertEquals(4, actual.val);
	Assert.assertEquals(1, actual.next.val);
	Assert.assertEquals(3, actual.next.next.val);
	Assert.assertEquals(9, actual.next.next.next.val);
}

public ListNode removeElements(ListNode head, int val) {

	ListNode dummy = new ListNode(-1);
	dummy.next = head;
	ListNode current = dummy;
    while (current.next != null) {
		if (current.next.val == val) {
			current.next = current.next.next;
		} else {
		}
	}
	return dummy.next;
}
}

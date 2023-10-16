package week17.Classworks_Day1_14_10_2023;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionofTwoLinkedLists {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  - ListNode,ListNode
	 * output - 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 1.Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3 Output: Intersected at '8'
	 * 2.Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1 Output: Intersected at '2'
	 * 3.Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2 Output: No intersection
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
     
     if the headA or headB is nul than return null
     create a List node named tempA and assign the headA values
     while loop to iterate till the tempA not equal to bull
     create a List node named tempB and assign the headB Values
     while loop to iterate till the tempB not equal to null
     if the value reference of tempA and tempB equal than return the tempA
     iterate the tempB using tempB.next
     iterate the tempA using tempB.next
     return null


	 * 6.Dry run the pseudo code with all test data from step #2
	 * Done
	 * 7.Write the code on notepad
	 * 
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 */
	@Test
	public void test1() {
		ListNode headA = new ListNode(1);
		headA.next = new ListNode(9);
		headA.next.next = new ListNode(1);
		headA.next.next.next = new ListNode(2);
		headA.next.next.next.next = new ListNode(4);
		ListNode headB = new ListNode(3);
		headB.next = new ListNode(2);
		headB.next.next = new ListNode(4);
		Assert.assertEquals(headB.next, getIntersectionNode(headA,headB));
	}

	public class ListNode {
		int val;
		ListNode next;
	
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
// if the headA or headB is null than return null
		if (headA == null || headB == null)
			return null;
//  create a List node named tempA and assign the headA values
		
		ListNode tempA = headA;
		// create a List node named tempB and assign the headB Values
		ListNode tempB = headB;
		// while loop to iterate till the tempA not equal to null
		while (tempA != null) {
			while (tempB != null) {
				// if the value reference of tempA and tempB equal than return the tempA
				if (tempA == tempB) {
					return tempA;
				}
				// iterate the tempB using tempB.next
				tempB = tempB.next;
			}
			//iterate the tempA using tempB.next
			tempA = tempA.next;
		}
		// return null
		return null;
	}
	
	public ListNode getIntersectionNodeHashSet(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;
        HashSet<Integer> set = new HashSet<Integer>();
		ListNode tempA = headA;
		return tempA;
		
	
		

	}
}

package com.week16.LL.Day2;

public class MergeTwoSortedLists {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - list1,list2
	 * output - list
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 1.Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
	 * Input: list1 = [], list2 = [] Output: []
	 * Input: list1 = [], list2 = [0] Output: [0]
 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
    
      
      Initialize the node named resultnode with value as null
      Initialize the current node and assign back the result node 
      while loop to check both list1 and list2 not null 
      if the value of list1 less than or equal to list2 value than
            current.next value to be list1
            list1 value to be list1.next
      else  current.next value to be list2
            list2 value to be list2.next    
     current value assigned to current.next
     
     if the list1 value is not empty than current assigned to list1 values
     if the list2 value is not wmpty than current assugned to list2 values
     
     return the result node
      
     
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


public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	ListNode resultnode = new ListNode(0, null);
	ListNode currentnode = resultnode;

	while (list1.next != null && list2.next != null) {
		if (list1.val <= list2.val) {
			currentnode.next = list1;
			list1 = list1.next;
		}
	}
	return resultnode;

}

}

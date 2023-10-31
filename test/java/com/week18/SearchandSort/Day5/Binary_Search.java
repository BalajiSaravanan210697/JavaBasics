package com.week18.SearchandSort.Day5;

import org.junit.Assert;
import org.junit.Test;

public class Binary_Search {

	
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * Yes
		 * I/P - int[],int O/P - int
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * Input: nums = [-1,0,3,5,9,12], target = 9 Output: 4
		 * Input: nums = [-1,0,3,5,9,12], target = 2 Output: -1
		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * Yes
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		
		 // [-1,0,3,5,9,12], target = 9

         Initialize the integer variables left to zero and right to length of array minus one and mid as zero initially    // left = 0  right = 5 mid = 0
         while loop to iterate till the left less than or equal to right   // 0<=5 // 4<=5  4<=4
         calculate the mid value using left and right values divided by two  // mid  = 5/2 --> 3   = 4+5/2 -->5  
         if the mid value is equal to target return mid  // 5  != 9  12!= 9
         else if the value of mid is less than target adjust the left pointer add the mid plus one //  5<9 left = 3+1 --> 4 
         else adjust right boundary decrement the right value by one // 5-1 --> 4 
         return minus one if nothing matching with target
        
         * 6.Dry run the pseudo code with all test data from step #2
		 * Yes
		 * 7.Write the code on notepad
	
		 public int search(int[] nums, int target) {
		 int left = 0, right = nums.length-1, mid = 0; 
		 while(left<=right){
		 
		 mid = left+right/2;
		 
		 if(nums[mid] == target){
		 return mid;
		 }
		 else if(nums[mid]<target){
		 left = mid+1;
		 }
		 else{
		 right = mid-1;
		 }
		 }
		 return -1;
		 }
		 * 8. Dry run the code with all test data from step #2
		 * Done
		 * 9. Write code on IDE (remember to add comments and practice coding standards)
		 * Done
		 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		 * Completed
		 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
		 * 
		 */
	
	// TC - O(log N)  SC - O(1)
	@Test
	public void validtestcase() {
		Assert.assertEquals(4, search(new int[] {-1,0,3,5,9,12},9));
	}
	
	public int search(int[] nums, int target) {
        //  Initialize the integer variables left to zero and right to length of array minus one and mid as zero initially
		int left = 0, right = nums.length - 1, mid = 0;
        // while loop to iterate till the left less than or equal to right 
		while (left <= right) {
            // calculate the mid value using left and right values divided by two
			mid = left + (right-left) / 2;
            // if the mid value is equal to target return mid
			if (nums[mid] == target) {
				return mid;
				// else if the value of mid is less than target adjust the left pointer add the mid plus one
			} else if (nums[mid] < target) {
				left = mid + 1;
				//else adjust right boundary decrement the right value by one
			} else {
				right = mid - 1;
			}
		}
		//return minus one if nothing matching with target
		return -1;
	}
}

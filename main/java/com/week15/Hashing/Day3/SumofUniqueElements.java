package com.week15.Hashing.Day3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class SumofUniqueElements {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  - int[]
	 * output - int 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test case:
	 * 1.Input: nums = [1,2,3,2] Output: 4
	 * 2.Input: nums = [1,1,1,1,1] Output: 0
	 * 3.Input: nums = [1,2,3,4,5] Output: 15
	
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes 
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
     // [1,2,3,2]
    
     > Initialize the sum value to zero and HashSet with Integer as Key    // sum = 0 , map = {}; 
     > for each loop to iterate the integer array elements  // 1 , 0    2,1   3,2
     > add the elements to the Set  1=0,2=1,3=2
     > if the add method return false than subtract the value from sum
     > else add the sum value   //sum = 1+2+3
     > if the sum is less than zero than reset to zero
     > return sum
  
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Done
	 * 7.Write the code on note pad
	 
	  public int sumOfUnique(int[] nums) {
        int sum=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int valuesofarray:nums){
           if(set.add(valuesofarray)==false){
           sum-=valuesofarray;
           }else{
           sum+= valuesofarray;
           }
           
        }
         if(sum<0) return 0;
        return sum;
     }
     Time Complexity - O(N) - based on input given by nums array
     Space Complexity - O(N) - Set to store the elements 
	 
	 * 8. Dry run the code with all test data from step #2
	 * Done
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * Done
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * Done
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
	@Test
	public void validTestCase() {
		Assert.assertEquals(4, sumOfUniqueHashSMap(new int[] { 1, 2, 3, 2 }));
	}

	public int sumOfUniqueHashSet(int[] nums) {
		// Initialize the sum value to zero and HashSet with Integer as Key
		int sum = 0; // O(1)
		HashSet<Integer> set = new HashSet<Integer>(); // O(N)
		// for each loop to iterate the integer array elements
		for (int valuesofarray : nums) { // O(N)
			// add the elements to the Set
			// if the add method return false than subtract the value from sum
			if (set.add(valuesofarray) == false) {
				sum -= valuesofarray;
			} else {
				// else add the sum value
				sum += valuesofarray;
			}
		}
		// if the sum is less than zero than reset to zero
		if (sum < 0)
			return 0;
		// return sum
		return sum;
	}

	public int sumOfUniqueHashSMap(int[] nums) {
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			sum += map.get(nums[i]);
		}

		return sum;

	}

}

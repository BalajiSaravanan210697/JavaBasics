package com.week16.LLandHashing.Day1;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class EquivalentDominoPairs_Hashing {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - int[][]
	 * output - int
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test Case
	 * 1.Input: dominoes = [[1,2],[2,1],[3,4],[5,6]] Output: 1
	 * 2.Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]] Output: 3
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
 
     --> Initiaise the integer varaible  count to zero and Hashmap with Integer,Integer as key and value pair
     --> for loop to iterate the int[] of outer from i from 0 to length of array 
     -->  nested for loop to iterate the int[][] of value of j from 0 to length of array 
     -->   
	
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
	public void validTestCase() {
		Assert.assertEquals(0, numEquivDominoPairs(new int[][] {{1,2},{2,1},{3,4},{5,6}}));
	}
	@Test
	public void validTestCase1() {
		Assert.assertEquals(true, containsNearbyDuplicate(new int[] {1,2,3,1},3));
	}
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
             for(int i = 0 ; i<nums.length;i++){
	            for(int j = 1; i<nums.length;j++){
	             if(nums[i]==nums[j] && Math.abs(i-j)<=k){
	             return true;
	             }
	            }
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < nums.length; i++) {
      
				if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
					return true;
				}else {
					map.put(nums[i], i);
				}
			}

			return false;
	 }
	 public int numEquivDominoPairs(int[][] dominoes) {
		 int count = 0;
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for (int i = 0; i < dominoes.length; i++) {
			for (int j = 0; j < dominoes[i].length; j++) {
				for (int[] mapadding : dominoes) {
					if(map.containsKey(mapadding)||map.containsValue(mapadding)) {
						
					}
					
				}
			}
		}
		return count;
	        
	    }
}

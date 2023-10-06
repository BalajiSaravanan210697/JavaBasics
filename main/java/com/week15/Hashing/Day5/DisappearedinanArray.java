package com.week15.Hashing.Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DisappearedinanArray {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input - int[] 
	 * output - List<Integer>
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
	 * Input: nums = [1,1] Output: [2]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
     
      //  [4,3,2,7,8,2,3,1]
     -> Initialize HashSet to iterate the integer to store the value from 1 to length of an array   //set = {}
     -> Initialize Hash map with Integer,Integer as key and value pair // map<Integer,Integer> = {}
     -> Initialize the list<Integer> to store the output list elements  // List<Integer> = {}
     -> for loop to iterate the set from 1 to included length  // 1<=8 , 2<=8,3<=8 , 4<=8,5<=8 , 6<=8,7<=8 , 8<=8
     ->  add the elements as key to the set    // {1,2,3,4,5,6,7,8}
     -> for each loop to iterate the  all elements from the nums array   // first element -- 4 
     -> if the value at map not contains key of the Integer than  //4 
     ->  add into the List<Integer>
     -> return List<Integer>
   
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Done
	 * 7.Write the code on notepad
	 * Done
	 * 8. Dry run the code with all test data from step #2
	 * Done
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * Done
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * Done
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
@Test
public void ValidTestCase() {
	List<Integer> list = new ArrayList<Integer>();
	list.add(5);
	list.add(6);
	Assert.assertEquals(list, findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
}

@Test
public void ValidTestCase1() {
	List<Integer> list = new ArrayList<Integer>();
	list.add(2);
	Assert.assertEquals(list, findDisappearedNumbers(new int[] { 1, 1 }));
}

public List<Integer> findDisappearedNumbers(int[] nums) {
/* Time complexity : O(2N)
 * Space Complexity : O(N)
 */
	// Initialize HashSet to iterate the integer to store the value from 1 to length
	// of an array //set = {}
	HashSet<Integer> set = new HashSet<Integer>(); // O(1)
	// Initialize Hash map with Integer,Integer as key and value pair //
	// map<Integer,Integer> = {}
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  //O(1)
	// Initialize the list<Integer> to store the output list elements //
	// List<Integer> = {}
	List<Integer> outputlist = new ArrayList<Integer>();  // O(N)
	// for loop to iterate the set from 0 to less than array length // 0<8,1<8 ,
	// 2<8,3<8 , 4<8,5<8 , 6<8,7<8 , 8<8
	for (int i = 0; i < nums.length; i++) {  // O(N)
		// add the elements as key to the set
		set.add(nums[i]); // {1,2,3,4,7,8}
	}
	// for loop to iterate from 1 to length of an array included // first element --
	// 1
	for (int j = 1; j <= nums.length; j++) {// 1<=8  //O(N)

		map.put(j, 1);// {1,1}
		// if the value at map not contains key of the Integer than
		if (set.contains(j) == false) {//O(1)
			// add into the List<Integer>
			outputlist.add(j);//O(1)
		}
	}
//return List<Integer>
	return outputlist;

}
}

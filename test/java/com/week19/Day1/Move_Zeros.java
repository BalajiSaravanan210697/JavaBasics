package com.week19.Day1;

import org.junit.Assert;
import org.junit.Test;

public class Move_Zeros {

	
	/*
	1.Understood the problem
	
	2.I/P - int[]  O/P  - int[]
	Test Data : 
	
	1. nums = [1,2,0,1,0]  O/P - [1,2,1,0,0]
	2. nums = [1,2]        O/P - [1,2]
	3. nums = [0,0,0]      O/P - [0,0,0]
	 
	Approahes  - Bruteforce and two pointers
	
	pesudo code :
	
	Initialise the integer temp varaible to swap
	for loop to iterate the nums array using i from 0 to length of an array
	nested for loop to iterate the nums using j from i+1 (to check the next elements in array) to length of an array
	if the value of i is zero and value of j is not zero than
	  temp to store the i value 
	   Assign i value from j value
	   Assign j value as temp value
	return the array    
	
	TC - O(N^2) -- i*j iterations  SC - O(1) -- Constant Space 	 
	
	public int[] moveZeros(){
	int temp = 0;
	
	for (int i = 0; i<nums.length; i++){
	  for (int j = i+1; j<nums.length; j++){
	    if(nums[i]==0 && nums[j]!=0){
	     temp = nums[i];
	     nums[i] = nums[j];
	     nums[j] = temp;
	    }
	  }
	}
	return nums;
	}
	
	
	
	two pointer approach : 
	
	TC - O(N)   SC - O(1)
	
	// [3,0,1,0,3]
	pesudo code :
	Initialsie the temp varaible and assigned to zero , left pointer assigned to zero and right pointer assigned to 1  // temp = 0 ,left = 0,right = 1

	while loop to iterate till the right reaches the nums length  // 1<5  2<5 3<5  4<5
	
	if the value at left pointer is zero and right is having value  // 3!0 0=0   0  && 1 -- true  0 && 0! a zero   0 && 3
	 
	   temp to store the value of the left   // temp = 0   0
	 
	   assign the right value to left  // 0 --> 1   0-->3
	  
	   assign right value as temp value  //  1 --> 0  [3,1,0,0,3]  3-->0 [3,1,3,0,0]

	   increment the both counters values of left and right  // left = 3 right = 5 
	
	else if the value at left zero and right value also zero  // 3!=0 0==0   0 && 0 
	  
	   increment the right pointer      // 4
	
	else increment the both pointers   // left = 1 right = 2 
	
	return the nums array   	
	
	public int[] moveZerostwoPointer(int[] nums){
	
	int left = 0, right = 1, temp = 0;
	
	while(right<nums.length){
	
	if(nums[left]== 0 && nums[right] != 0){
	   temp = nums[left];
	   nums[left++] = nums[right];
	   nums[right++] = temp;
	   
	}
	else if(nums[left]== 0 && nums[right] == 0){
	right++;
	}
	else{
	left++;right++;
	}
	} 
	return nums;
	}
	
	*/
	
	
	@Test
	public void testcase1() {
		Assert.assertArrayEquals(new int[] {1,2,1,0,0}, moveZeros(new int[] {1,2,0,1,0}));
	}
	@Test
	public void testcase2() {
		Assert.assertArrayEquals(new int[] {1,2,1}, moveZeros(new int[] {1,2,1}));
	}
	@Test
	public void testcase3() {
		Assert.assertArrayEquals(new int[] {0,0,0}, moveZeros(new int[] {0,0,0}));
	}
	
	public int[] moveZeros(int[] nums) {
		if(nums.length==1) return nums;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0 && nums[j] != 0) {
					nums[i] = nums[j];
					nums[j] = 0;
				}
			}
		}
		return nums;
	}
	@Test
	public void tcase1() {
		Assert.assertArrayEquals(new int[] {1,2,1,0,0}, moveZerostwoPointer(new int[] {1,2,0,1,0}));
	}
	@Test
	public void tcase2() {
		Assert.assertArrayEquals(new int[] {0}, moveZerostwoPointer(new int[] {0}));
	}
	
	public int[] moveZerostwoPointer(int[] nums) {

		int left = 0, right = 1;
		if(nums.length==1) return nums;
		while (right < nums.length) {
          //temp varaible is not required & BiDirectional two pointer approach
			if (nums[left] == 0 && nums[right] != 0) {
				nums[left++] = nums[right];
				nums[right++] = 0;

			} else if (nums[left] == 0 && nums[right] == 0) {
				right++;
			} else {
				left++;
				right++;
			}
		}
		return nums;
	}
}

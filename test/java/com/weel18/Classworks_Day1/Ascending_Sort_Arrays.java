package com.weel18.Classworks_Day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Ascending_Sort_Arrays {

	/*
	 * I/P - int[] arr O/P - int[] arr
	 * 
	 * TC - O(N^2)   SC - O(1)
	 * 
	 * Pesudo code :
	 * 
	 * Initialize temp variable to zero to store the integer value
	 * for loop to iterate the each integer value from the array till it reaches length
	 *   nested for loop to iterate the 
	 *  if the ith value is less than i+1th value than swap 
	 *      temp to store the ith vlaue and assign the i+1 value to to i and assign back temp value to i+1
	 *      
	 * return arr     
	 * 
	 * 
	 * */
	
	
	@Test
	public void valid() {
		Assert.assertArrayEquals(new int[] {1,2,3,4}, BubblesortingArray(new int[] {3,2,4,1}));
	}
	@Test
	public void valid1() {
		Assert.assertArrayEquals(new int[] {-5,1,2,3}, BubblesortingArray(new int[] {3,-5,2,1}));
	}
	public int[] BubblesortingArray(int[] arr) {
		/** Initialize temp variable to zero to store the integer value
		 * for loop to iterate the each integer value from the array till it reaches length
		 *   nested for loop to iterate the 
		 *  if the ith value is less than i+1th value than swap 
		 *      temp to store the ith vlaue and assign the i+1 value to to i and assign back temp value to i+1
		 *      
		 * return arr   */
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}
	
	/*
	 * int temp = 0 store the element
	 * for loop to iterate the values form i  to length of an array
	 * Set Pivot value as i value
	 * take pivot value and pivot + 1 value
	 * if the pivot value is less than means pivot - 1 value is swap
	 * else move the pivot to next iteration
	 * return array
	 * 
	 * */

	public int[] selectionSort(int[] arr) {

		int temp = 0;

		for (int i = 1; i < arr.length; i++) {

			int pivot = i;

			while (pivot-1 > pivot ) {
				temp = arr[pivot - 1];
					arr[pivot - 1] = arr[pivot];
					arr[pivot] = temp;
			}

		}

		return arr;

	}

}

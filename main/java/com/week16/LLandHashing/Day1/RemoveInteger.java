package com.week16.LLandHashing.Day1;

import org.junit.Assert;
import org.junit.Test;

public class RemoveInteger {

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {1,2,3,4,5,0,0}, removeElements(new int[] {1,2,6,3,4,5,6},6));
	}

	public int[] removeElements(int[] nums, int val) {

		int[] output = new int[nums.length];
		int j=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				output[j] = nums[i];
				j++;
			}
		}
		return output;
	}
}

package com.week18.SearchandSort.Day2;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class Majority_Element {

	@Test
	public void validtestcase() {
		Assert.assertEquals(3, majorityElement(new int[] { 3, 2, 3 }));
	}

	public int majorityElement(int[] nums) {

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int each_elementofarray : nums) {
			hashmap.put(each_elementofarray, hashmap.getOrDefault(each_elementofarray, 0) + 1);
			for (int each_value : hashmap.values()) {
				if (each_value >= nums.length / 2) {
					return hashmap.get(each_elementofarray);
				}

			}
		}

		return -1;

	}
}

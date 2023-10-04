package com.week15.Hashing.Day2;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class JewelsandStones {
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * Yes
		 * Input - String,String
		 * output - int
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * 1.Input: jewels = "aA", stones = "aAAbbbb" Output: 3
		 * 2.Input: jewels = "z", stones = "ZZ"
		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * Yes
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
        
         -> Initialize the variable count to zero
         -> Initialize the HashMap name jewelsmap with Key and value pair as Integer,Integer
         -> for each loop to iterate the jewels string 
         -> add the characters to the jewelsmap and add the value of next as dummy one
         -> for each loop to iterate the stones string
         -> if the jewelsmap contains key of the stones string
             increase the count 
         -> return the count    
        
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
		 * 
		 */
	@Test
	public void validTestcase() {
		Assert.assertEquals(3, numJewelsInStonesHashMAP("aA", "aAAbbbb"));
		Assert.assertEquals(3, numJewelsInStonesBF("aA", "aAAbbbb"));
	}

	@Test
	public void validTestcase1() {
		Assert.assertEquals(0, numJewelsInStonesHashMAP("z", "ZZ"));
		Assert.assertEquals(0, numJewelsInStonesBF("z", "ZZ"));
	}

	@Test
	public void validTestcase2() {
		Assert.assertEquals(0, numJewelsInStonesTwoPointer("z", "ZZ"));
	}
	public int numJewelsInStonesHashMAP(String jewels, String stones) {
		// Initialize the variable count to zero
		int count = 0;
		// Initialize the HashMap name jewelsmap with Key and value pair as Integer,Integer
		HashMap<Character, Integer> jewelsmap = new HashMap<Character, Integer>();
		// for each loop to iterate the jewels string
		for (char jewelmap : jewels.toCharArray()) {
			// add the characters to the jewelsmap and add the value of next as dummy one
			jewelsmap.put(jewelmap, 1);
		}
		// for each loop to iterate the stones string
		for (char jewelmap : stones.toCharArray()) {
			// if the jewelsmap contains key of the stones string
			if (jewelsmap.containsKey(jewelmap)) {
				// increase the count
				count++;
			}
		}
		// return the count
		return count;

	}
	public int numJewelsInStonesBF(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i) == stones.charAt(j)) {
					count++;
				}

			}
		}
		return count;
	}
	
	public int numJewelsInStonesTwoPointer(String jewels, String stones) {
		int left = 0, right = 0, count = 0;
		while (left < jewels.length()) {
			while (right < stones.length()) {
              if (jewels.charAt(left) == stones.charAt(right)) {
					count++;
				}
				right++;
			}
			left++;
			right = 0;
		}
		return count;
	}
}

package com.week16.Day3;

import org.junit.Assert;
import org.junit.Test;

public class RingsandRods {

	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * Yes
		 * input  - String
		 * output  - int
		 * 
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 
		 * Input: rings = "B0B6G0R6R0R6G9" Output: 1
		 * Input: rings = "B0R0G0R9R0B0G0" Output: 1
		 * Input: rings = "G4" Output: 0

		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * Yes
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	     -> Initialize Hashmap with  
	
	
		 * 6.Dry run the pseudo code with all test data from step #2
		 *  
		 * 7.Write the code on note pad
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
	public void validtest() {
		Assert.assertEquals(1, countPoints("B0B6G0R6R0R6G9"));
	}

	public int countPoints(String rings) {
		int count = 0;
		int[] colors = new int[10];
		char[] chararray= rings.toCharArray();
		for (int i = 0; i < chararray.length; i++) {
			char color = chararray[i];
		//	int rod = parseInt(chararray[i + 1]);
			
		}
		return count;

	}

}

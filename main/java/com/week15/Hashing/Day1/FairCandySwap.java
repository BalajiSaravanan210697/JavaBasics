package com.week15.Hashing.Day1;

import org.junit.Assert;
import org.junit.Test;

public class FairCandySwap {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input - int[] , int[] 
	 * output - int[] 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * valid Test case:
	 * 1.aliceSizes = [1,1], bobSizes = [2,2] Output: [1,2]
	 * 2.Input: aliceSizes = [1,2], bobSizes = [2,3] Output: [1,2]
	 * 3.Input: aliceSizes = [2], bobSizes = [1,3] Output: [2,3]
	
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	    
	      // input [2] [1,3]
	 > Initialize the pointer1 and pointer2 to zero and sum1 and sum2 equal to zero   //pointer = 0,pointer2 = 0 sum1 = 0,sum2 =0 Overallsumalice= 0,Overallsumbob = 0
	 
	 > Initialize output array to store the index of the changing elements          //   output[0,0]
	 
	 > while loop to iterate the both array elements and store the sum1 for sum2 from respective arrays  // sum1 = 2  sum2=4
	 
	 > while loop to iterate till the pointer1 reaches the length of the array  // pointer = 0 0<1
	 
	      alice[pointer1] element taken     // 2
	      
	 > while loop to iterate pointer2 reaches the length of the array  //pointer2 = 0<2 1<2
	 
	     bob[pointer2] element taken and increment it       // 1
	     
	     Overallsumalice = substract the value of sum1 - alice[pointer1] add bob[pointer2]     // 2-2+1 --> 1   2-2+3
	     
	     Overallsumbob = substract the value of sum2 - bob[pointer2] add alice[pointer1]    // 4-1+2 --> 5  -->  4-3+2
	     
	      if the both sum value equals than add the alice[pointer1] value index 0 of output & bob[pointer2] value index 1 of output //not equal equal
	                   output[0] = alice[pointer1]
	                   output[1] = bob[pointer2]
	      Reset the sum values after each iterations Overallsumalice = sum1
	                                                 Overallsumbob = sum2     
	  >  once the loop reaches the end and not able to find the solution reset the pointer2 to zero
      > return the outputarray
      	
	 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
	 * Yes
	 * 8. Dry run the code with all test data from step #2
	 * Done
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * Done
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * Done
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
@Test
public void validTestcase() {
	Assert.assertArrayEquals(new int[] { 2, 3 }, fairCandySwap(new int[] { 2 }, new int[] { 1, 3 }));
}

public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	// Initialize the pointer1 and pointer2 to zero and sum1 and sum2 equal to zero
	// pointer = 0,pointer2 = 0 sum1 = 0,sum2 =0 Overallsumalice= 0,Overallsumbob = 0
	int pointer1 = 0, pointer2 = 0, sum1 = 0, sum2 = 0, alicesum = 0, bobsum = 0;
	// Initialize output array to store the index of the changing elements output[0,0]
	int[] output = new int[2];
	// while loop to iterate the both array elements and store the sum1 for sum2 from respective arrays sum1 = 2 sum2=4
	while (pointer1 < aliceSizes.length) {
		sum1 += aliceSizes[pointer1++];

	}
	while (pointer2 < bobSizes.length) {
		sum2 += bobSizes[pointer2++];
	}
	pointer1 = 0;
	pointer2 = 0;
	// while loop to iterate till the pointer1 reaches the length of the array pointer = 0 0<1
	while (pointer1 < aliceSizes.length) {
		// alice[pointer1] element taken // 2
		while (pointer2 < bobSizes.length) {
			// while loop to iterate pointer2 reaches the length of the array //pointer2 = 0<2 1<2
			//bob[pointer2] element taken and increment it // 1
			// Overallsumalice = substract the value of sum1 - alice[pointer1] add bob[pointer2] // 2-2+1 --> 1 2-2+3
			alicesum = sum1 - aliceSizes[pointer1] + bobSizes[pointer2];
			// Overallsumbob = substract the value of sum2 - bob[pointer2] add
			// alice[pointer1] // 4-1+2 --> 5 --> 4-3+2
			bobsum = sum2 - bobSizes[pointer2] + aliceSizes[pointer1];
			// if the both sum value equals than add the alice[pointer1] value index 0 of output & bob[pointer2] value index 1 of output not equal equal
			if (alicesum == bobsum) {
				// output[0] = alice[pointer1]
				output[0] = aliceSizes[pointer1];
				// output[1] = bob[pointer2]
				output[1] = bobSizes[pointer2];
				return output;
			}
			pointer2++;
			// Reset the sum values after each iterations Overallsumalice = sum1 Overallsumbob = sum2
			alicesum = sum1;
			bobsum = sum2;
			// once the loop reaches the end and not able to find the solution reset the pointer2 to zero
		}
		pointer1++;
		pointer2 = 0;
	}
	// return the outputarray
	return output;
}
}

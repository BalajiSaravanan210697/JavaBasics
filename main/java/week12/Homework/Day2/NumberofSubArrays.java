package week12.Homework.Day2;

import org.junit.Assert;
import org.junit.Test;

public class NumberofSubArrays {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input -- int[] arr,int k,int threshold 
	 * output -- int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases:
	 * 1.Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4 output : 3
	 * 2.Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5  output: 6
	 * 3.Input: arr = [2,3,4,5,1], k = 2, threshold = 3  output : 3
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 > Initialize the int variables pointer = 0,sum=0,and count=0                 //[2,3,4,5,1]  k = 2, threshold = 3
	 > while loop to iterate the int[]  0<2  
	 > sub array of size k and store into sum  -- 2    
	 > increment the pointer for each iteration 1
	 > divide the sum using k if that is greater than threshold increase the count  
	 > another while loop to iterate the int[]  till the length minus k value
	 >  sum to add the next value of pointer and subtract the previous value
	 > if the sum divide by k is greater than threshold than increase the count
	 > increase the pointer after each iteration
	 > return count
	 
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
public void ValidTestCase() {
	Assert.assertEquals(3, numOfSubarraysforloop(new int[] { 2, 3, 4, 5, 1 }, 2, 3));
}

@Test
public void ValidTestCase1() {
	Assert.assertEquals(3, numOfSubarraysforloop(new int[] { 2, 2, 2, 2, 5, 5, 5, 8 }, 3, 4));
}

public int numOfSubarrays(int[] arr, int k, int threshold) {
	int pointer = 0, count = 0, sum = 0;
	while (pointer < k)
		sum += arr[pointer++];
	if (sum / k >= threshold) {
		count++;
	}
	while (pointer < arr.length) {
		sum += arr[pointer] - arr[pointer - k];
		if (sum / k >= threshold) {
			count++;
		}
	}
	return count;
}

public int numOfSubarraysforloop(int[] arr, int k, int threshold) {
	int pointer, count = 0, sum = 0;
	for (pointer = 0; pointer < k; pointer++) {
		sum += arr[pointer];
	}
	if (sum / k >= threshold) {
		count++;
	}
	for (pointer = k; pointer < arr.length; pointer++) {
		sum += arr[pointer] - arr[pointer - k];
		if (sum / k >= threshold) {
			count++;
		}
	}
	return count;
}
}

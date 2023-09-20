package week12.Classwork.day2;

import org.junit.Assert;
import org.junit.Test;

public class HighestSumConsecutiveElement {
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * 
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * 
		 * 3.Do you know the Solution?
		 * 
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * 
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		 * 
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
		Assert.assertEquals(6, slidingWindow(new int[] {1,4,4,5,5,6},1));
		
	}
	public int highestSumConsecutive(int[] Array, int k,String s) {
		int sum = 0, Totalsum = 0;
		for (int i = 0; i < Array.length - k; i++) {
			sum+= Array[i];
			for (int j = i + 1; j < k; j++) {
				 sum+= Array[j];
			}
			if (Totalsum < sum) {
				Totalsum = sum;
				sum=0;
			}
			
		}return sum;
	}
	private int slidingWindow(int[] nums, int k){
        //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer] - nums[pointer-k];
            pointer++;
        }
        return Math.max(currentSum, max);
    }

}

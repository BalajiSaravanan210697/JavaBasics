package week12.Classworks;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTwoPointers {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - int[] 
	 * output - int[]
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid TestCase :
	 * input nums = [0,1,0,3,12]
	 * output  [1,3,12,0,0]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes - Brute force
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
public void validTestcase() {
	Assert.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, moveZeros(new int[] { 0, 1, 0, 3, 12 }));
}

public int[] moveZeros(int[] nums) {
	int j = nums.length-1;
	for (int i = 0; i < nums.length-1; i++) {
		if (nums[i] == 0 && nums[j] != 0) {
			int temp = nums[i+1];
			nums[i + 1] = nums[i];
			nums[i] = temp;
		}
		if (nums[j] == 0) {
			j--;
		}
	}
	return nums;
}
public int[] moveZerosDifferentApproach(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
		int j = i+1;
		if (nums[i] == 0 && nums[j] != 0) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
		}
		
	}
	return nums;
}
}

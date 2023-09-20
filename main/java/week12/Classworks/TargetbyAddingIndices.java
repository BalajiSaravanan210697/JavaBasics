package week12.Classworks;

import org.junit.Assert;
import org.junit.Test;

public class TargetbyAddingIndices {
	/*
	 * Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	 *  Input: nums = [2,3,5,7],target = 9 Output: [0,3] Output: Because nums[0] + nums[3] == 9, we return [0, 3].
	 */
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * Yes
		 * input - int[] sorted,int
		 * output - int []
		 *  
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * 
		 * 3.Do you know the Solution?
		 * Yes
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
	public void Validtest() {
		Assert.assertArrayEquals(new int[] { 0, 3 },targetAddSum(new int[] { 2, 3, 5, 7 }, 9));
	}

	@Test
	public void Validtest1() {
		Assert.assertArrayEquals(new int[] { 1, 2 },targetAddSum(new int[] { 2, 3, 5, 7 }, 8));
	}

	@Test
	public void Validtest2() {
		Assert.assertArrayEquals(new int[] { -1, -1 },targetAddSum(new int[] { 2, 3, 5, 7 }, 10));
	}
	public int[] targetAddSum(int[] nums, int target) {
		int j = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] + nums[j] == target) {
				return new int[] { i, j };
			}
			if (nums[i] + nums[j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return new int[] { -1, -1 };
	}

}

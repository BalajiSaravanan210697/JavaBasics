package week12.Homeworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input - int[] nums
	 * Output - int[] output
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * ValidTestcase:
	 * 1.Input: nums = [3,1,2,4]  Output: [2,4,3,1]
	 * 2.Input: nums = [4,3,2,1,1,4,5]  Output: [4,4,2,1,1,3,5]
	 * 3.Input: nums = [0]  Output: [0]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize the Left and Right Integer assign Right equal to length of the Array minus one
	 > for loop to iterate the nums array
	 > if the Left value is odd and Right value is even then swap the values and Decrement and Increment 
	 > if the Left value is even then increment Left++
	 > if the Right value is odd then Decrement Right--
	 > Return the nums array
	
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Done
	 * 7.Write the code on notepad
	 * Done
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
	Assert.assertArrayEquals(new int[] { 4, 2, 1, 3 }, sortArraybyParityCheck(new int[] { 3, 1, 2, 4 }));
}

@Test
public void validTestcase1() {
	Assert.assertArrayEquals(new int[] { 0 }, sortArraybyParityCheck(new int[] { 0 }));
}

@Test
public void validTestcase2() {
	Assert.assertArrayEquals(new int[] { 4, 4, 2, 1, 1, 3, 5 },
			sortArraybyParityCheck(new int[] { 4, 3, 2, 1, 1, 4, 5 }));
}

public int[] sortArraybyParityCheck(int[] nums) {
	int Left = 0, Right = nums.length - 1, temp;
	while (Left < Right) {
		if (nums.length == 1) {
			return nums;
		}
		if (nums[Left] % 2 != 0 && nums[Right] % 2 == 0) {
			temp = nums[Left];
			nums[Left] = nums[Right];
			nums[Right] = temp;
			Left++;
			Right--;
		}
		if (nums[Left] % 2 == 0) {
			Left++;
		}
		if (nums[Right] % 2 != 0) {
			Right--;
		}
	}
	
	return nums;
}

}

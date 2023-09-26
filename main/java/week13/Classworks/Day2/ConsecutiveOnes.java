package week13.Classworks.Day2;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveOnes {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - int[]
	 * output - int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases :
	 * 1.Input: nums = {1,1,0,1,1,1} output - 3
	 * 2.input: nums = {1,0,1,1,0,1,1} output - 2
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize the integer variables left = 0 and right = left+1 and windowsize = 0;
	 > while loop to iterate the array till the right reaches the array.length
	 >   if the value at left position is 1 and value at right position is 1 than increment the right 
	        if the existing windowsize is less than current right-left+1 value 
	        change the value of windowsize into current
	 > if the value present at right equal to 0 than 
	        left value equal to the right+1
	        right value = right+2
	 > return window size                 
	
	    1. Initialise left and right
        2. increase right till 1
        3. if number is zero, calculate the window of right-left and reset right and left as current index
        
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
	/* > Initialize the integer variables left = 0 and right = left+1 and windowsize = 0
	 > while loop to iterate the array till the right reaches the array.length
	 >   if the value at left position is 1 and value at right position is 1 than increment the right 
	        if the existing windowsize is less than current right-left+1 value 
	        change the value of windowsize into current
	 > if the value present at right equal to 0 than 
	        left value equal to the right+1
	        right value = right+2
	 > return window size*/
	@Test
	public void validTestCase() {
		Assert.assertEquals(3, findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
	}
	public int findMaxConsecutiveOnes(int[] nums) {
		// Initialize the integer variables left = 0 and right = left+1 and windowsize = 0
		int left = 0, right = 0, windowsize = 0;
		// while loop to iterate the array till the right reaches the array.length
		while (right < nums.length) {
			// if the value at left position is 1 and value at right position is 1 than
			// increment the right
			if (nums[left] == 1 && nums[right] == 1) {
				right++;
				// if the existing windowsize is less than current right-left+1 value
				windowsize = Math.max(windowsize, right - left + 1);
			}
			// if the value present at right equal to 0 than
			else {
				left = right + 1;
				right = right + 2;
			}
		}
		return windowsize;
	}
}

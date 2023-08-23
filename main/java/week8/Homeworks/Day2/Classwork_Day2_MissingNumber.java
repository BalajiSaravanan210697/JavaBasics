package week8.Homeworks.Day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Classwork_Day2_MissingNumber {
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * Yes understood
		 * input -- > Input []
		 * output --> int
		 * 
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * Valid : [2,1,3]  --> 0
		 *         [0,2,3] --> 1
		 * Edge :  [0,1] --> 2
		 *         [0] --> 1
		 * Invalid : [1,2,4] -->  Return Exception                  
		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * Yes
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		
		 * > Get the Input Array values [0,3,1]
		 * > Sort the array value using Sort function [0,1,3]
		 * > iterate the array using for loop  array starts from 0   --> 0 1 2
		 * > Compare the array index value with the array values  0==0 1==1  2!=3
		 * >    if the index value not equal to array value then 
		 *      return the index 2
		 * > return the array.length
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
	public void valid() {
		int actual =missingNumber(new int[] {2,1,3});
		Assert.assertEquals(0, actual);	
	}
	@Test
	public void Edge() {
		int actual =missingNumber(new int[] {0,1});
		Assert.assertEquals(2, actual);
	}
	@Test
	public void Invalid() {
		int actual = missingNumber(new int[] {2,1,3});
		Assert.assertEquals(0, actual);
	}
	
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
		if(nums[i]!=i){
		return i;
		}
		} return nums.length;
    }
}

package week13.Homeworks.Day1;

public class ContigiousSubArray {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input  -- int[]
	 * output -- int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases:
	 * 1. input nums = {2,-1,3,4} output  -= 8
	 * 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
   
     > Initialize the integer pointer = 0 and maximum = 0 and currentmaximum = 0 sum = 0  // {2,-1,2,3}
     > while loop to iterate till the pointer reaches the array length
     >  add the sum values of the existing value for currentsum
     > if the sum value greater than 0 than add into currentmaximum 
     > if the sum value is less than 0 than reset the currentsum to zero
     > check the maximum between current maximum and maxmium value
     > return maximum 
     
   
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
	
public int maxSubArray(int[] nums) {
	// Initialize the integer pointer = 0 and maximum = 0 and currentmaximum = 0 sum
	// = 0
	int pointer = 0, maximun = 0, currentmaximum = 0, sum = 0, currentsum = 0;
	// while loop to iterate till the pointer reaches the array length
	while (pointer < nums.length) {
		// add the sum values of the existing value for currentsum
		currentsum = sum + nums[pointer];
		sum = currentsum;
		// if the sum value greater than 0 than add into currentmaximum
		if (sum > 0) {
			currentmaximum = currentmaximum + sum;
		}
		// if the sum value is less than 0 than reset the currentsum to zero
		if (sum < 0) {
			currentmaximum = 0;
		}
		// check the maximum between current maximum and maxmium value
		maximun = Math.max(currentmaximum, maximun);
		pointer++;

	}
	// return maximum
	return maximun;
}
}

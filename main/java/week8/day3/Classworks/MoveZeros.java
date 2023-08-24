package week8.day3.Classworks;

public class MoveZeros {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input --> int[]
	 * output --> int[] 
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Input: nums = [0,1,0,3,12] --> Output: [1,3,12,0,0]
	 * input: nums= [0]  --> [0]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No 
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * > Get the input nums array   [0,1,0,3,12]
	 * > initialise the temp varaible to 0  
	 * > for loop to iterate the nums array 
	 * > if nums[i] == 0 then store into temp variable 0 1
	 *        temp = nums[i]         0  0 
	 *        nums[i]=num[i+1]       1 [1,0
	 *        nums[i+1] = temp       0 [1,0
	 *  return nums array
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
	public int[] moveZeros(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				nums[i+1]=nums[i];
				nums[i]=nums[i+1];
			}
		}
		return nums;
		
	}
}

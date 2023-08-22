package week8.Homeworks.Day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SetMismatch {
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		 * Yes
		 * input -- int[]
		 * output -- int[]
		 * Constraints -- int[] should have atleast 2 number means length would be 2 and max would be 10000
		 * numbers present in the array from 1 to 10000
		
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * Valid : [1,2,2,4,5]  --> [2,3]
           Edge : [1,1] --> [1,2]
           Invalid Case : [2,2] --> Invalid case
		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * No
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		 * 
		 * >.Get the input array nums                                                                [1,2,2,4,5]   [1,1]
		 * > Initialise the output array and size and counter variable = 0  2 --> one missed element + duplicate element       [2,3]  [1,2]
		 * >.for loop to iterate the nums array values from 0 to less than length                    0 1 2       0 1
		 * >.if nums[i] value less than 0  than return invalid input    
		 * > increment the counter +1 for each iteration      
		 * >.if nums[i] value equal to count than reassign counter-=1        1==1  2==2 2!=3  1==1  1!=2
		 * >. else  add the element ouput[0] = nums[i] to the output array and add the output[1] = count value into an array [2,3] [1,2]
		 * > return the output[] [2,3] [1,2]
		 * 
		 * >.Dry run the pseudo code with all test data from step #2
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
		int[] actual=findErrorNums(new int[] {1,2,2,4,5});
		Assert.assertArrayEquals(new int[] {2,3},actual);
	}
	@Test
	public void Edge() {
		int[] actual=findErrorNums(new int[] {1,1});
		Assert.assertArrayEquals(new int[] {1,2},actual);
	}
	@Test
	public void Edgecomplex() {
		findErrorNums(new int[] {3,2,2});
		
	}
	    public int[] findErrorNums(int[] nums){
	    int count=0;
		int[] output = new int[2];
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
		if(nums[i]<0)
		{
			System.out.println("Invalid input");
		}
		count=i+1;
		if(nums[i]==count){
			count=i-1;
		}
		else{
		output[0] = nums[i];
		output[1] = count;
		break;
		}
		}
		return output;
		}
	    
}

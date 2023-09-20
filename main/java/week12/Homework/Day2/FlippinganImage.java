package week12.Homework.Day2;

import org.junit.Assert;
import org.junit.Test;

public class FlippinganImage {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input - int[][] 
	 * Output - int[][]
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test case:
	 * 1.input - int[][] image = [[1,0,1].[1,1,1],[1,1,0]]  output --[[0,1,0],[0,0,0],[1,0,0]]
	 * 2.input - int[][] image = [[1,0,0,1] [1,1,1,0] [0,0,0,1]]  output -- [[0,1,1,0],[1,0,0,0],[0,1,1,1]]
     * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > 
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
/*
 * input = [1,1,0] output = [1,0,0]
 */
	@Test
public void ValidTestCase() {
		Assert.assertArrayEquals(new int[] {1,0,0}, flipArray(new int[] {1,1,0}));
	
}
public int[] flipArray(int[] nums) {
	int left = 0, right = nums.length - 1, temp = 0;
	while (left < right) {
		temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
		if(nums[left]==0||nums[right]==0) {
			nums[left]=1;
			nums[right]=1;
		}else {
			nums[left]=0;
			nums[right]=0;
		}
		left++;
		right--;	
	}
	System.out.println(nums);
	return nums;

}

	@Test
	public void Validtestcase() {
		flipAndInvertImage(new int[][] {{1,0,1},{1,1,1}});
	}
	
	public int[][] flipAndInvertImage(int[][] image){
		
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j <= image.length; j++) {
			System.out.println(image[i][j]);	
			}
			
		} return image;
	}
}

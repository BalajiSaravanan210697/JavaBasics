package week8.Homeworks.Day3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartition {
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
	 * Yes
	 * input -- int[]
	 * output -- int
	 * constraints -- 1 <= n <= 104
                      nums.length == 2 * n
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * [1,4,3,2] --> 4
	 * [6,2,6,5,1,2] --> 9
	 * [3,2,6,7] --> 8 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 * > Get the input intger array of nums                   [3,2,6,7]
	 * > Sort the nums array using Arrays.sort function       [2,3,6,7] 
	 * > for loop to iterate the elements in the nums array   0<3   2<3 3<3 not less than 3 breaks
	 * > if the nums[i] value is less than nums[i+1] then     2<3 6<7
	 * > sum+=nums[i]                                         2+6
	 * > else sum+=nums[i+1]
	 * > increment i++ --> to get the next iteration elements  1 2
	 * > return sum
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
public void Valid() {
	int actual = arrayPartition(new int[] { 1, 4, 3, 2 });
	Assert.assertEquals(4, actual);
}

@Test
public void Valid1() {
	int actual = arrayPartition(new int[] { 6, 2, 6, 5, 1, 2 });
	Assert.assertEquals(9, actual);
}

@Test
public void Valid2() {
	int actual = arrayPartition(new int[] { 13, 2, 6, 7 });
	Assert.assertEquals(8, actual);
}

public int arrayPartition(int[] nums) {
	int sum = 0;
	Arrays.sort(nums);
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] < nums[i + 1]) {
			sum += nums[i];
			i++;
		} else {
			sum += nums[i + 1];
			i++;
		}
	}
	return sum;

}
}

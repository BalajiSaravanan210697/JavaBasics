package week11.Homework.Day2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * 
	 * yes 
	 * input -- int[]
	 * output -- boolean
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Testcases
	 * input -- [-2,-1,0,3,4,-2] output -- true
	 * input -- [1]                output -- false
	 * input -- [1,2,3,4] output -- false
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * > if the nums.length ==1 then return false 
	 * > for loop to iterate the int[] nums using i till nums.length
	 * >  nested for loop to iterate the elements from i+1 using j
	 * >  return value of  nums[i] equal to nums[j] 
	 * 
	 * 
	 * > Get the int[] nums values 
	 * > Initialize a Set named numsSet 
	 * > add the elements from the nums array 
	 * > while adding the value if set returns false then we need to return true
	 * > else return false
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 *  public boolean isDuplicates(int[] nums){
	 *  if(nums.length==1) return false;
	 *  for (int i=0;I<nums.length;i++){
	 *  for (int j=i+1;j<nums.length;j++){
	 *  if (nums[i]==nums[j]){
	 *  return true;
	 *  }
	 *  }
	 *  }return false;
	 *  }
	 *  
	 *  public boolean isDuplicatesSetApproach(int[] nums){
	 *  if(nums.length==1) return false;
	 *  Set<Integer> numsSet =new HashSet<Integer>();
	 *  for(int i=0;i<nums.length;i++){
	 *  boolean value=numsSet.add(nums[i]);
	
	 *  }
	 *  return value==false;
	 *  }
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
@Test
public void validcase() {
	Assert.assertEquals(true, isDuplicatesSetApproach(new int[] { -2, -1, 0, 3, 4, -2 }));
}

@Test
public void validcase1() {
	Assert.assertEquals(false, isDuplicatesSetApproach(new int[] { -2 }));
}

@Test
public void validcase2() {
	Assert.assertEquals(false, isDuplicatesSetApproach(new int[] { 1, 2, 3, 4, 5 }));
}

public boolean isDuplicatesSetApproach(int[] nums) {
	if (nums.length == 1)
		return false;
	Set<Integer> numsSet = new HashSet<Integer>();
	for (int i = 0; i < nums.length; i++) {
		boolean value = numsSet.add(nums[i]);
		if (value == false) {
			return true;
		}
	}
	return false;
}

public boolean isDuplicates(int[] nums) {
	if (nums.length == 1)
		return false;
	for (int i = 0; i < nums.length; i++) {
		for (int j = i + 1; j < nums.length; j++) {
			if (nums[i] == nums[j]) {
				return true;
			}
		}
	}
	return false;
}
}

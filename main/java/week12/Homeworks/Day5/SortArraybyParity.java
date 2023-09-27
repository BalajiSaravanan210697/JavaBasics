package week12.Homeworks.Day5;

import org.junit.Assert;
import org.junit.Test;

public class SortArraybyParity {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- int[] 
	 * output -- int[]
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Testcases:
	 * 1.input : nums : {2,4,1,3}  -- output -- nums :{2,1,4,3}
	 * 2.input : nums : {4,2,5,7}  -- output -- nums :{4,5,2,7}
	 * 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize the integers left = 0  and right = nums.lenght -1 and temp to store the value  // [4,2,5,7]  0,1,2,3 left = 0  right = 4-3 -->3 temp = 0 
	 > while loop to iterate the array left<right   0<3  1<2
	 > if the left value divisible by 2 and num[left] value is divisible by 2 OR   0/2 --> 4%2-->0  1%2!=0 2%2-->0
         	 left value is not divisible by 2 and num at left value divided by 2 not equal to zero than increment  1
	 > if the right value is divisible by 2 not equal to zero and num[right] value is not divisible by 2 OR   3/2!=0 7%2!=0
	         right value is divisible by 2 and num at left value divided by 2  equal to zero then decrement   2
	 > if left value divisible 2 not equal to zero and value nums[left] module by 2 is zero OR value nums[left] module by 2 is not equals to zero and left value divisible 2 equal to zero
	 > if right value divisible 2 not equal to zero and value nums[right] module by 2 is zero OR value nums[right] module by 2 is not equals to zero and left value divisible 2 equal to zero
	 > return the nums array
	 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
	 * public int[] sortArrayByParityII(int[] nums) {
	 //Initialize the integers left = 0  and right = nums.lenght -1 and temp to store the value
	 int left = 0,right = nums.length-1,temp=0;
	 //while loop to iterate the array left<right 
	 while(left<right){
	 //if the left value divisible by 2 and num[left] value is divisible by 2 OR   0/2 --> 4%2-->0  1%2!=0 2%2-->0 left value is not divisible by 2 and num at left value divided by 2 not equal to zero than increment  1
	 if(left%2==0&&nums[left]%2==0||left%2!=0&&nums[left]%2!=0){
	 left++;
	 }
	 //if the right value is divisible by 2 not equal to zero and num[right] value is not divisible by 2 OR   3/2!=0 7%2!=0 right value is divisible by 2 and num at left value divided by 2  equal to zero then decrement   2
	 if(right%2==0&&nums[right]%2==0||right%2!=0&&nums[right]%2!=0){
	 right--;
	 }
	 //if left value divisible 2 not equal to zero and value nums[left] module by 2 is zero OR value nums[left] module by 2 is not equals to zero and left value divisible 2 equal to zero
	 //AND if right value divisible 2 not equal to zero and value nums[right] module by 2 is zero OR value nums[right] module by 2 is not equals to zero and left value divisible 2 equal to zero
	 if((left%2!=0&&nums[left]%2==0||left%2==0&&nums[left]%2!=0)&&(right%2!=0&&nums[right]%2==0||right%2==0&&nums[right]%2!=0)){
	 //temp to store the value of left and and assign value of right to left and again back store the value of temp to right
	 temp = nums[left];
	 nums[left] = nums[right];
	 nums[right] =temp;
	 left++;
	 right--;
	 }
	 }
	 //return the nums array
	 return nums;
	 }
	 * 8. Dry run the code with all test data from step #2
	 * yes
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
@Test
public void validTestcase() {
	Assert.assertArrayEquals(new int[] {4,5,2,7}, sortArrayByParityII(new int[] {4,2,5,7}));
	Assert.assertArrayEquals(new int[] {2,3}, sortArrayByParityII(new int[] {2,3}));
}	

@Test
public void validTestcase1() {
	Assert.assertArrayEquals(new int[] {2,3,0,1,4,1,0,3,4,3}, sortArrayByParityII(new int[] {2,3,1,1,4,0,0,4,3,3}));
}
public int[] sortArrayByParityII(int[] nums) {
	// Initialize the integers left = 0 and right = nums.lenght -1 and temp to store the value
	int left = 0, right = nums.length - 1, temp = 0;
	// while loop to iterate the array left<right
	while (left < right) {
		// if the left value divisible by 2 and num[left] value is divisible by 2 OR 0/2 --> 4%2-->0 1%2!=0 2%2-->0 left value is not divisible by 2 and num at left value divided by 2 not equal to zero than increment 1
		if (left % 2 == 0 && nums[left] % 2 == 0 || left % 2 != 0 && nums[left] % 2 != 0) {
			left++;
		}
		// if the right value is divisible by 2 not equal to zero and num[right] value is not divisible by 2 OR 3/2!=0 7%2!=0 right value is divisible by 2 and num at left value divided by 2 equal to zero then decrement 2
		if (right % 2 == 0 && nums[right] % 2 == 0 || right % 2 != 0 && nums[right] % 2 != 0) {
			right--;
		}
		// if left value divisible 2 not equal to zero and value nums[left] module by 2 is zero OR value nums[left] module by 2 is not equals to zero and left value divisible 2
		//equal to zero AND if right value divisible 2 not equal to zero and value nums[right] module by 2 is zero OR value nums[right] module by 2 is not equals to zero and left value divisible 2 equal to zero
		if ((left % 2 != 0 && nums[left] % 2 == 0 || left % 2 == 0 && nums[left] % 2 != 0)
				&& (right % 2 != 0 && nums[right] % 2 == 0 || right % 2 == 0 && nums[right] % 2 != 0)) {
			// temp to store the value of left and and assign value of right to left and again back store the value of temp to right
			temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
	//return the nums array
	return nums;
}

}

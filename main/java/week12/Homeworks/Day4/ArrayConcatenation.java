package week12.Homeworks.Day4;

import org.junit.Assert;
import org.junit.Test;

public class ArrayConcatenation {
private static final Integer Intger = null;

/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input : int[] nums
	 * output : long
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases:
	 * 1.Input: nums = {7,52,2,4}     Output: 596
	 * 2.Input: nums = {5,14,13,8,12} Output: 673
	 * 3.Input: nums = {2,4,7,9}      Output: 76
	 * 4.Input: nums = {12,14,9,14,13}Output: 2636
	 * 5.Input: nums = {4}            Output: 4
	 * 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
     
     > Initialize the integers left=0,right=nums.length-1, long variable concatenation = 0,   // {7,52,2,4} left=0,right=3 concatenation = 0 s1="",s2="", numerals ="" 
                     String variable numerals and Strings s1,s2 to store numeric values
     > while loop to iterate the nums array till left< right  // 0<3 1<2 2!<2
     > if the nums.length equal to 1 then add the element at the index of 0 to concatenation and return concatenation
     > if the nums.length%2 not eequal to zero then add 1 to length and pick the center element and add into concatenation  4%2==0
     > else store the nums[left] value into s1 as a string using Interger.tostring method and nums[right] value s1 ="7" s2="4"  s1="52" s2="2"
                     into s2 as a string using Interger.tostring method
     > concatenation the both s1 and s2 and store into numerals String and convert back to integer and assign into concatenation  numerals="74" "522" concatenation =0+74 =74+522 = 596
	 > increment left and decrement right pointers  1 2    2 2
	 > return concatenation  596
	 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
	 
	 public long findTheArrayConcVal(int[] nums){    //{5,14,13,8,12} -- 5
	 int left=0,right=nums.length-1;  // left = 0  right= 5-1=4
	 long concatenation=0; //0
	 String numerals ="";
	 String s1 ="";
	 String s2 ="";
	 if(nums.length==1){concatenation+=nums[0];return concatenation;} //!=1
	 while(left<right){  //0<4
 	 if(nums.length%2!=0){concatenation+=nums[nums.length/2+1];return concatenation}  //5%2!=0  -- nums[5/2+1] -- 13
	 else{
	 s1=Intger.toString(left);
	 s2=Intger.toString(right);
	 numerals = s1+s2;
	 concatenation+=Integer.parseInt(numerals);
	 left++;
	 right--;
	 }} return concatenation;
	 }
	 * 8. Dry run the code with all test data from step #2
	 * Yes
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */

@Test
public void validTescase() {
	Assert.assertEquals(596, findTheArrayConcVal(new int[] { 7, 52, 2, 4 }));
}

@Test
public void validTescase1() {
	Assert.assertEquals(673, findTheArrayConcVal(new int[] { 5, 14, 13, 8, 12 }));
}

@Test
public void validTescase2() {
	Assert.assertEquals(76, findTheArrayConcVal(new int[] { 2, 4, 7, 9 }));
}

@Test
public void validTescase3() {
	Assert.assertEquals(2636, findTheArrayConcVal(new int[] { 12, 14, 9, 14, 13 }));
}

@Test
public void validTescase4() {
	Assert.assertEquals(4, findTheArrayConcVal(new int[] { 4 }));
}

public long findTheArrayConcVal(int[] nums) { // {5,14,13,8,12}
	int left = 0, right = nums.length - 1;
	long concatenation = 0;
	String numerals = "";
	String s1 = "";
	String s2 = "";
	if (nums.length == 1) {
		concatenation += nums[0];
		return concatenation;
	}
	if (nums.length % 2 != 0) {
		concatenation += nums[nums.length / 2];
	}
	while (left < right) {
		s1 = Integer.toString(nums[left]);
		s2 = Integer.toString(nums[right]);
		numerals = s1 + s2;
		concatenation += Integer.parseInt(numerals);
		left++;
		right--;
	}
	return concatenation;
}
}

package week12.Homeworks.Day5;

import org.junit.Assert;
import org.junit.Test;

public class KBeautyofNumber {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  - int,int
	 * output - int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * validTestcases:
	 * 1.Input: num = 240, k = 2 Output: 2
	 * 2.Input: num = 430043, k = 2 Output: 2
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 > Initialize the integer variables left to zero and right equal to k and count equal to zero   //num = 240, k = 2 left = 0 right = 2 count = 0 ,dividend = 0
	 > String named substring to store the substring  substring  = " ";
	 > convert the nums value into string  "240"
	 > while loop to iterate the left less than or equal to string length minus k  0<3-2 --> 1  0<=1 1<=1
	 >    substring to get the value from the start index as left and end index as k     0,2  --> 24
	 >     increment the left and right     1,3
	 >    convert the string into integer   dividend = 24
	 > check dividend not equal to zero and it divide the nums module by dividend equal to zero !=0  24   240%24equal to zero
	         if yes than increase the counter  1
	 > return count         
	 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
	 * public int divisorSubstrings(int nums,int k){
	 //Initialize the integer variables left to zero and right equal to k and count equal to zero
	 int left = 0,right = k, count = 0, dividend = 0;
	 //String named substring to store the substring  
	 String substring = "";
	 //convert the nums value into string and store to the string
	 String string = Integer.toString(nums);
	 //while loop to iterate the left less than or equal to string length minus k
	 while(left<=string.length()){
	 //substring to get the value from the start index as left and end index as k
	 substring = string.substring(left,right);
	 // increment the left and right
	 left++;
	 right++;
	 //convert the string into integer
	 dividend =Integer.ParseInt(substring);
	 //check dividend not equal to zero and it divide the nums module by dividend equal to zero 
	 if(dividend!=0 && nums%dividend ==0)
	 {
	  //if yes than increase the counter  1
	 count++;
	 }
	 }
	 //return count
	 return count; 
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
public void validTestCase() {
	Assert.assertEquals(2, divisorSubstrings(240, 2));
}

@Test
public void validTestCase1() {
	Assert.assertEquals(2, divisorSubstrings(430043, 2));
}

public int divisorSubstrings(int nums, int k) {
	// Initialize the integer variables left to zero and right equal to k and count equal to zero
	int left = 0, right = k, count = 0, dividend = 0;
	// String named substring to store the substring
	String substring = "";
	// convert the nums value into string and store to the string
	String string = Integer.toString(nums);
	// while loop to iterate the left less than or equal to string length minus k
	while (left <= string.length() - k) {
		// substring to get the value from the start index as left and end index as k
		substring = string.substring(left, right);
		// increment the left and right
		left++;
		right++;
		// convert the string into integer
		dividend = Integer.parseInt(substring);
		// check dividend not equal to zero and it divide the nums module by dividend
		// equal to zero
		if (dividend != 0 && nums % dividend == 0) {
			// if yes than increase the counter 1
			count++;
		}
	}
	// return count
	return count;
}
}

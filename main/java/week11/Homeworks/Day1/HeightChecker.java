package week11.Homeworks.Day1;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class HeightChecker {
/*
 * 1.Understanding the problem to detailed level (clarity on input and
 * output,constraints) 
 * Yes 
 * input -- int[] 
 * output -- int
 * 
 * 2.Frame Test data (valid, invalid, complex and edge cases)
 *  Valid Test caae :
 * 1.input -- [3,2,1,3,4,2,1] output -- 7 
 * 2.input -- [1] output -- 0 
 * 3.input -- [1,3,1,5,2] output -- 4
 * 4.input -- [1,2,3,4,5] output -- 0 
 * 5,input -- [5,1,2,3,4] output -- 5 
 * 3.Do you know the Solution?
 * Yes 
 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
 * No 
 * 5. Derive Pseudocode in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE
 * UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output! 
 * > Initialize the variable count to zero  and int[] initalarray size equal to heights array
 * > if height array length is 1 one return count 
 * > for loop to iterate the heights array and store the value into intialarray
 * > Sort the heights array 
 * > for loop iterate the heights array and initial array using height array length
 * > compare the height array value and initialarray elements if not equal then increase count 
 * > return count 
 *  
 * 6.Dry run the pseudo code with all test data from step #2
 * Yes
 * 7.Write the code on notepad
 * 
 * public int heightChecker(int[] heights){ 
 * int count=0; 
 * if(heights.lenghth==1)  return count; 
 * int[] initialarray = new int[heights.length];
 * for(int i=0;i<heights.length;i++){
 * initialarray[i]=heights[i];
 * }
 * Arrays.sort(heights);
 *  for(int i=0;i<heights.length;i++){
 *   if(heights[i]!=initialarray[i]){
 *   count++;
 * }
 * 
 *  return count;
 *  } 
 *  8. Dry run the code with all test data from step #2
 * 
 * 9. Write code on IDE (remember to add comments and practice coding standards)
 * 
 * 10. Test the code + Debug the code (if any failures) Debug like a pro using
 * debugging options of IDE
 * 
 * 11. Check for any gaps of code optimization (if not optimized already in Step
 * #9)
 */
@Test
public void validCase() {
	Assert.assertEquals(3, heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));

}

@Test
public void validCase1() {
	Assert.assertEquals(0, heightChecker(new int[] { 1 }));

}

@Test
public void validCase2() {
	Assert.assertEquals(7, heightChecker(new int[] { 3, 2, 1, 3, 4, 2, 1 }));

}

@Test
public void validCase3() {
	Assert.assertEquals(5, heightChecker(new int[] { 5, 1, 2, 3, 4 }));

}

@Test
public void validCase4() {
	Assert.assertEquals(4, heightChecker(new int[] { 1, 3, 1, 5, 2 }));

}

public int heightChecker(int[] heights) {
	int count = 0;
	if (heights.length == 1)
		return count;
	int[] initialheightarray = new int[heights.length];
	for (int i = 0; i < heights.length; i++) {
		initialheightarray[i] = heights[i];
	}
	Arrays.sort(heights);
	for (int i = 0; i < heights.length; i++) {
		if (initialheightarray[i] != heights[i]) {
			count++;
		}
	}
	return count;
}

}

package week11.Homeworks.day4;

import org.junit.Assert;
import org.junit.Test;

public class EqualDigitCountandDigitValue {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes 
	 * input -- String
	 * output -- boolean
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases : 
	 * 1.input -- num = "1210" output -- true
	 * 2.input -- num="131012" output -- false
	 * 3.input -- nums="2" output -- false
	 * 4.input -- nums = "0" output -- false
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 * > Initialize the counter variable to 0 and Get the input String nums   //"1 2 1 0"
	 * > for loop to iterate the nums string using i to nums.length           //0 -- 1
	 * > nested for loop to iterate the nums.length 
	 * > if the nums string value equal to i then increase the count   // 0,1,2,3    0 == 0 -- 1
	 * > if the element value from nums.length not equal to the count of elements 1==1
	 * > return false
	 * > otherwise return true 
	 * 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	  public boolean digitCount(String num){
	  int count = 0;
	  for(int i=0;i<nums.length();i++){
	  for(int j=0;j<nums.length();j++)
	  if(i==nums.chartAt(j)){count++;
	  }
	  
	  }
	  if(nums.charAt(i)!=count){
	  return false;
	  }return true;
	  }
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
@Test
public void ValidTestCase() {
	Assert.assertEquals(true, digitCount("1210"));
}

@Test
public void ValidTestCase1() {
	Assert.assertEquals(false, digitCount("131012"));
}

@Test
public void ValidTestCase2() {
	Assert.assertEquals(false, digitCount("2"));
}

@Test
public void ValidTestCase3() {
	Assert.assertEquals(false, digitCount("0"));
}

public boolean digitCount(String nums) {
	int integerconversion = 0;
	int integerconversionsecond = 0;
	char[] chararray = new char[11];
	for (int j = 0; j < nums.length(); j++) {
		char ch = nums.charAt(j);
		integerconversion = ch - '0';
		chararray[integerconversion]++;
	}
	for (int k = 0; k < nums.length(); k++) {
		char ch1 = nums.charAt(k);
		integerconversionsecond = ch1 - '0';
		if (chararray[k] != integerconversionsecond) {
			return false;
		}
	}

	return true;
}
}

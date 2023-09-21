package week12.Homeworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class SubstringofSizeThree {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String
	 * output - int
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Testcases : 
	 * 1.input: s = "xyzzaz"  Output: 1
	 * 2.input: s = "aababcabc"  output : 4
	 * 3.input: s= "xyyzakbbz"  ouput : 3  
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize String substring to store the string and k value to 3 and count to 0
	 > for loop to iterate the string and till length -k less than or equal to
	 > Store the Substring of index at pointer and end index would be k
	 >  if the isduplicate return true than increase the count
	 >  return count 
	 
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
public void validTestcase() {
	Assert.assertEquals(1, countGoodSubstrings("xyzzaz"));
}

@Test
public void validTestcase1() {
	Assert.assertEquals(4, countGoodSubstrings("aababcabc"));
}

@Test
public void validTestcase2() {
	Assert.assertEquals(3, countGoodSubstrings("xyyzakbbz"));
}

public boolean isDuplicate(String str) {
	int left = 0, right = left + 1;
	if (str.charAt(1) == str.charAt(2)) {
		return false;
	}
	while (left < right && right < str.length()) {
		if (str.charAt(left) == str.charAt(right)) {
			return false;
		} else {
			right++;
		}
	}

	return true;
}

public int countGoodSubstrings(String s) {
	String substring = "";
	int k = 3, count = 0, pointer;
	for (pointer = 0; k <= s.length(); pointer++) {
		substring = s.substring(pointer, k);
		k++;
		if (isDuplicate(substring) == true) {
			count++;
		}
	}
	System.out.println(count);
	return count;
}
}

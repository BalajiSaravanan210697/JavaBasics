package week13.HomeWork.Day2;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstring {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String
	 * output - String 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * valid Test cases : 
	 * 1.Input: s = "babad" Output: "bab"
	 * 2.Input: s = "cbbd" Output: "bb"
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize the integer variables left equal to string length divide by 2 and minus one and right string output to append 
	 > if the string length is positive than right equal to right plus one else it would be length divided by 2
	 > while loop to iterate till the right reaches the string length 
	 >  if the character value at left and right is equal than add character to output and decrement left and increment right 
	 >  return the output

	 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
	 * Yes
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
Assert.assertEquals("bab", longestPalindrome("babad"));
}

public String longestPalindrome(String s) {
	// Initialize the integer variables left equal to string length divide by 2 and
	// minus one and right string output to append
	int left = s.length() / 2 - 1, right = s.length() / 2 + 1,centre=s.length()/2;
	char[] output = new char[s.length()];
	if (s.length() % 2 != 0) {
		output[centre] = s.charAt(centre);
	}
	// while loop to iterate till the right reaches the string length
	while (right < s.length()) {
		// if the character value at left and right is equal than add character to
		// output and decrement left and increment right
		if (s.charAt(left) == s.charAt(right)) {
			output[left] = s.charAt(left);
			output[right] = s.charAt(right);	
		}
		left--;
		right++;
	}
	// return the output
	return new String(output.toString());
}
}

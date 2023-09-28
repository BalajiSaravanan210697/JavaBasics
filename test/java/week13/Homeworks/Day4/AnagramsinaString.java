package week13.Homeworks.Day4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AnagramsinaString {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  - String,String
	 * output  - int[] or List<Integer>
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 1.Input: s = "cbaebabacd", p = "abc" Output: [0,6]
	 * 2.Input: s = "abab", p = "ab" Output: [0,1,2]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 // s = "cbaebabacd", p = "abc"
	 > Initialize the pointer left to zero and right equals to length of the p String     // left = 0 right = 3
	 > Initialize the integer array to store the anagram index length of the s string     // output size to 10
	 > Initialize the String substring to store the respective string to compare          // substring = " "
	 > while loop to iterate till left value less than or equal to s length minus p length // 0<=10-3 --> 7
	 > substring to store the string based on left and right pointers                      // substring(0,3) --> cba
	 > if the substring contains p than store the left value into output integer array and increment the left and right true [0,] 1,2
	 > increment the left and right (general) - if not satisfy the above condition
	 > return the output integer array
	
	
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
public void ValidTestcase() {
	Assert.assertEquals(new int[] { 0, 6 }, findAnagrams("cbaebabacd", "abc"));
}

@Test
public void ValidTestcase1() {
	Assert.assertEquals(new int[] { 0, 6 }, findAnagrams("abba", "ab"));
}

public List<Integer> findAnagrams(String s, String p) {
// Initialize the pointer left to zero and right equals to length of the p String  left = 0 right = 3
	int left = 0, right = p.length(), valueofalpahabets = 0, valueofalpahabetspstring = 0;
// Initialize the integer array to store the anagram index length of the s string output size to 10
	List<Integer> output = new ArrayList<Integer>();
// Initialize the String substring to store the respective string to compare substring = " "
	String substring = "";
// while loop to iterate till left value less than or equal to s length minus p length // 0<=10-3 --> 7
	while (left <= s.length() - p.length()) {
		valueofalpahabets = 0;
		valueofalpahabetspstring = 0;
// substring to store the string based on left and right pointers substring(0,3) --> cba
		substring = s.substring(left, right);
// if the substring contains p than store the left value into output integer array and increment the left and right true [0,] 1,2
		for (int i = 0; i < substring.length(); i++) {
			valueofalpahabets += substring.charAt(i) - 'a';
			valueofalpahabetspstring += p.charAt(i) - 'a';
		}
		if (valueofalpahabets == valueofalpahabetspstring) {
			output.add(left);
			left++;
			right++;
		}
// increment the left and right (general) - if not satisfy the above condition++;
		else {
			left++;
			right++;
		}

	}
// return the output integer array
	return output;
}
}

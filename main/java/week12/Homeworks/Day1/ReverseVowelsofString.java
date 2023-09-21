package week12.Homeworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsofString {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- String
	 * Output -- String
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test case : 
	 * input -- s = "hello"  output -- "holle"
	 * input -- s = "leetcode"  output -- "leotcede"
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 > Initialize the Left and Right Integers & temp character store the character   // balajisara 
	 > Right value assigned to Length of the string minus one
	 > for loop to iterate the given input string
	 > if the Left character is Vowel and Right character is vowel swap the character
	 > if Left value is vowel and Right is not vowel then decrement the Right
	 > if Right value is vowel and Left is not vowel than increment the Left

	  
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
public void Validtest() {
	Assert.assertEquals("holle", vowelsString("hello"));
}
@Test
public void Validtest1() {
	Assert.assertEquals("leotcede", vowelsString("leetcode"));
}
@Test
public void Validtest2() {
	Assert.assertEquals("tastleef", vowelsString("testleaf"));
}
public boolean isVowel(char c) {
	return c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U';
}
public String vowelsString(String s) {
	int left=0, Right = s.length() - 1;
	char[] changedarray = s.toCharArray();
	char temp = ' ';
	while (left < Right) {
		if (isVowel(changedarray[left])&&isVowel(changedarray[Right])) {
			temp = changedarray[left];
			changedarray[left] = changedarray[Right];
			changedarray[Right] = temp;
			Right--;
			left++;
		}
		if (!isVowel(changedarray[Right])) {
			Right--;
		}
		if (!isVowel(changedarray[left])) {
			left++;
		}
	}
	return new String(changedarray);
}
}

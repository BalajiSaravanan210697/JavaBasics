package week12.Homework.Day2;

import org.junit.Assert;
import org.junit.Test;

public class SmallestPalindrome {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input -- String
	 * Output -- String
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * ValidTescases
	 * 1.Input -- s = "egcfe" output -- "efcfe"
	 * 2.Input -- s = "abcd"  output --"abba"
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initiate the left=0,right<s.length()-1 
	 > char[] to store string character 
	 > char temp to store the element
	 > while loop to iterate the elements till left less than right
	 > temp to store the value of left & assign value of left from  right & assign back the value of temp to right
	 > increment left and decrement the right
	 > while loop to iterate the string length or char array length
	 > compare the value of the swapped char array with charat original string s 
	 > if the character at original string and char array equals than increment the pointer 
	 > else compare the value of value of the chartAt string and char array value 
	 > replace with less than value 
	 > return String of char array changed
	 
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
	Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
}

@Test
public void validTestcase1() {
	Assert.assertEquals("abba", makeSmallestPalindrome("abcd"));
}
@Test
public void validTestcase2() {
	Assert.assertEquals("teet", makeSmallestPalindrome("test"));
}

public char[] reversepElements(char[] ch) {
	int left = 0, right = ch.length - 1;
	char c = ' ';
	while (left < right) {
		c = ch[left];
		ch[left] = ch[right];
		ch[right] = c;
		left++;
		right--;
	}
	return ch;
}

public String makeSmallestPalindrome(String s) {
	int pointer = 0, strvalue = 0, charvalue = 0;
	char[] chararray = s.toCharArray();
	reversepElements(chararray);
	while (pointer < s.length()) {
		if (s.charAt(pointer) == chararray[pointer]) {
			pointer++;
		} else {
			strvalue = s.charAt(pointer) - 'a';
			charvalue = chararray[pointer] - 'a';
			if (strvalue < charvalue) {
				chararray[pointer] = s.charAt(pointer);
				pointer++;
			} else {
				pointer++;
			}
		}
	}
	return new String(chararray);
}
}

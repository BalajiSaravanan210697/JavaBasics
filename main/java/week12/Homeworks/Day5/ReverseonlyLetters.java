package week12.Homeworks.Day5;

import org.junit.Assert;
import org.junit.Test;

public class ReverseonlyLetters {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String
	 * output - String
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases :
	 * Input: s = "ab-cd" Output: "dc-ba"
	 * Input: s = "a-bC-dEf-ghIj" Output: "j-Ih-gfE-dCba"
	 * Input: s = "Test1ng-Leet=code-Q!" Output: "Qedo1ct-eeLg=ntse-T!"
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 > Initilaise the left=0 and right = s.length()-1 and char c to store the characters
	 > char[]  to store the string values
	 > while loop iterate till the condition met left<right
	 > if the value present in left is character than check the character present in right also a character using ischaracter method
	 > both are character than swap and increment left and  decrement right
	 > if left hand side present is not a character than left ++
	 > if right hand side present is not a character the right -- 
	 > return the final string
	   
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
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
public void validTescase() {
	Assert.assertEquals("dc-ba", reverseOnlyLetters("ab-cd"));
}

public String reverseOnlyLetters(String s) {
	int left = 0, right = s.length() - 1;
	char temp = ' ';
	char[] chararray = s.toCharArray();
	while (left < right) {
		if (Character.isAlphabetic(chararray[left]) && Character.isAlphabetic(chararray[right])) {
			temp = chararray[left];
			chararray[left] = chararray[right];
			chararray[right] = temp;
			left++;
			right--;
		}
		if (!Character.isAlphabetic(chararray[left])) {
			left++;
		}
		if (!Character.isAlphabetic(chararray[right])) {
			right--;
		}
	}
	return new String(chararray);
}
}

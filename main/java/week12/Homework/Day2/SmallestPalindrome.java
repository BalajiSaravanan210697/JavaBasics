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
	 
	 > Initialise String output and char[] to store the String Elements,left=0,right=s.length()-1,temp to swap
	 > while loop to check the condition like left<right
	 >  if the value at left equal to value at right then swap using temp varaible
	 >  else assign the value left to right and swap
	 > return the string output  
	 
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
public void test() {
	Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
}	
public String makeSmallestPalindrome(String s) {
	int left = 0, right = s.length() - 1;
	String output="";
	char temp = ' ';
	char[] chararray = s.toCharArray();

	while (left < right) {
		if (chararray[left] == chararray[right]) {
			temp = chararray[left];
			chararray[right] = chararray[left];
			chararray[right] = temp;
			output+=chararray[left];
			output+=chararray[right];
		} else {
			chararray[right] = chararray[left];
			temp = chararray[left];
			chararray[right] = chararray[left];
			chararray[right] = temp;
			output+=chararray[left];
			output+=chararray[right];
		}
		left++;
		right--;
	}
	
	return output;
	
}
}

package week10.Homeworks;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNoofWords {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
	 * Yes
       Input --> String[]
       Output --> Int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * input --> sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"] output--> 6
	 * input --> ["I am SDET", "working in comcast", "try to switch job"]  output --> 4
	 * input --> ["b a l"]  output --> 3
	 * input --> ["s"] output --> 1
	 * 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * 
	 > Get the String[] sentences 
     > for loop to iterate the String[] sentences array 
     > String[] spliitingwords to store the splitting strings
     > if spliitingwords.length greater than equal to spliitingwords.length
     >   count = spliitingwords.length
     > return count
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
	public void validtest() {
		Assert.assertEquals(6, mostwordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
	}
	@Test
	public void validtest1() {
		Assert.assertEquals(4, mostwordsFound(new String[] {"b a l","i am a singer"}));
	}
	
	public int mostwordsFound(String[] sentences){
		int count=0;
		String[] splittedwords = new String[100];
		for(int i=0;i<sentences.length;i++){
		 splittedwords = sentences[i].split(" ");
		 if(splittedwords.length>=splittedwords.length){
				count=splittedwords.length;
		}
		 }
		
		return count;
		}
}

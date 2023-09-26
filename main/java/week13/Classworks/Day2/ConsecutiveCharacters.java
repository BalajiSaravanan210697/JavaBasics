package week13.Classworks.Day2;

public class ConsecutiveCharacters {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  - String
	 * output - int
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 
	 * 3.Do you know the Solution?
	 * 
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * 
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * 
	 * 6.Dry run the pseudo code with all test data from step #2
    
     
               
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
/*	> Initialize the variables left = 0 and right = 0 and maxvalue = 0
    > while loop iterate till the right < s.length()
    > if the character at left equal to character at right increment right
		  replace the maxvalue if the value right minus left plus one greater than existing maxvalue
    > else reset the left pointer into right position and right pointer at right plus one position
    > return maxvalue*/
	
public int maxPower(String s) {
	// > Initialize the variables left = 0 and right = 0 and maxvalue = 0
	int left = 0, right = 0, maxvalue = 0;
	// > while loop iterate till the right < s.length()
	while (right < s.length()) {
		// > if the character at left equal to character at right increment right
		if (s.charAt(left) == s.charAt(right)) {
			// replace the maxvalue if the value right minus left plus one greater than
			// existing maxvalue
			maxvalue = Math.max(maxvalue, right - left + 1);
			right++;
		} // > else reset the left pointer into right position and right pointer at right
			// plus one postion
		else {
			left = right;
			right = right + 1;
		}

	}
	// return maxvalue
	return maxvalue;
}
}

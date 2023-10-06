package com.week15.Hashing.Day3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class NumberofConsistentStrings {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String,String[]
	 * output  - int 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 1.Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"] Output: 2
	 * 2.Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"] Output: 7
	 * 3.Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"] Output: 4
	
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!

     > Initialize the HashMap with Character and Integer 
     > for each loop to iterate all the elements in the allowed and stored as key
     > for each loop to iterate the String from array and check the character not matches the key return false 
     > else return true and increase the count
     > return count
     Time complexity : O(2N)
     Space Complexity : O(N)
     
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
public void validTestCase() {
Assert.assertEquals(2, countConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"}));
}

public int countConsistentStrings(String allowed, String[] words) {
	int count = 0;
	HashSet <Character> set = new HashSet<Character>();
	for (char characterfromallowed : allowed.toCharArray()) {
		set.add(characterfromallowed);
	}

	for (int i = 0; i < words.length; i++) {
		for (int j = 0; j < words[i].length(); j++) {
			if (!(set.contains(words[i].charAt(j))) == true)
				count++;
		}

	}
	return count;
}
}

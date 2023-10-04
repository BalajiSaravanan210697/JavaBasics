package com.week15.Hashing.Day2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SentenceIsPangram {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * Input - String
	 * output - boolean
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initalise the HashSet with Character as key value
	 > if the string length is less than 25 than return false
	 > foreach loop to iterate the String character
	 > add all character to the Set
	 > return true if the length of set equal to 26
	
	
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
public void ValidTestCase() {
	Assert.assertEquals(true, checkIfPangramHashSet("thequickbrownfoxjumpsoverthelazydog"));
}
@Test
public void ValidTestCase1() {
	Assert.assertEquals(false, checkIfPangramHashSet("leetcode"));
}

public boolean checkIfPangramHashSet(String sentence) {
	//if the string length is less than 25 than return false
	if (sentence.length() < 25)
		return false;
	//Initalise the HashSet with Character as key value
	HashSet<Character> set = new HashSet<Character>();
	//foreach loop to iterate the String character
	for (char duplicateremoval : sentence.toCharArray()) {
		// add all character to the Set
		set.add(duplicateremoval);
	}
	//return true if the length of set equal to 26
	return set.size() == 26;
}
}

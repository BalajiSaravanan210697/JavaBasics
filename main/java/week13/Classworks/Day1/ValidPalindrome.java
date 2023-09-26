package week13.Classworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String
	 * output  - boolean
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases
	 * 1.input -- s ="RADAR" output -- true
	 * 2.input -- s = "madam" output -- true
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > intialise the left = 0 and right=s.length()-1 
	 > while loop to iterate till left< right
	 > if the value of equal to right then return true
	  
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
public void validTest() {
	Assert.assertEquals(false, isValidPalindromExpandfromtheCenter("RaDAR"));
}

@Test
public void validTest1() {
	Assert.assertEquals(true, isValidPalindromExpandfromtheCenter("madam"));
}

@Test
public void validTest2() {
	Assert.assertEquals(false, isValidPalindromExpandfromtheCenter("madan"));
}

@Test
public void validTest3() {
	Assert.assertEquals(false, isValidPalindromExpandfromtheCenter("madanm"));
}
@Test
public void validTest4() {
	Assert.assertEquals(true, isValidPalindromEFCInt(121));
}
@Test
public void validTest5() {
	Assert.assertEquals(true, isValidPalindromEFCInt(12321));
}

public boolean isValidPalindromEFCInt(int n) {
	String s = Integer.toString(n);
	int center = s.length() / 2;
	int left = center - 1, right = center + 1;
	while (left < right) {
		if (s.charAt(left) == s.charAt(right)) {
			left++;
			right--;
		} else {
			return false;
		}
	}
	return true;
}

public boolean isValidPalindromExpandfromtheCenter(String s) {
	int left = s.length() / 2 - 1, right;
	if (s.length() % 2 == 0) {
		right = s.length() / 2;
	} else {
		right = s.length() / 2 + 1;
	}
	while (right < s.length()) {
		if (s.charAt(left) != s.charAt(right)) {
			return false;
		} else {
			left--;
			right++;
		}
	}
	return true;
}

public boolean isValidPalindrome(String s) {
	int left = 0, right = s.length() - 1;
	while (left < right) {
		if (s.charAt(left) == s.charAt(right)) {
			left++;
			right--;
		} else {
			return false;
		}
	}
	return true;
}

public boolean isValidPalindromeExpandfromCentreodd(String s) {
	int center = s.length() / 2;
	int left = center - 1, right = center + 1;
	while (left < right) {
		if (s.charAt(left) == s.charAt(right)) {
			left++;
			right--;
		} else {
			return false;
		}
	}
	return true;
}

}

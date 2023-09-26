package week13.Classworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class PalindromArray {
	/*Given an input String,return a boolean array by validate each of the word is a palindrome.
	  Input = "this is a Test"
	  output = [false, false, true, true]
      input - String
	  output - int[]
      Pesudocode:
            > Split the string using split by space \\s+ and store back to String[]
			> initialse the boolean[] of length of the String[] length
			> Get the length of the String[] and assign the pointer varaibles left and right
			> while loop to iterate till the right pointer less than String[] length
			> if the word is of left is palindrome than true else return false (decrement left)
			> if the word of right is palindrome than return true else return false (increment right)
			> return boolean[] array */
	@Test
	public void validTestCase() {
		Assert.assertArrayEquals(new boolean[] { false, true, true, true }, isPalindromEFC("This is a tst"));
	}

	public boolean isPalindrom(String s) {
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

	public boolean[] isPalindromEFC(String s) {
		String[] strarray = s.split("\\s+");
		boolean[] output = new boolean[strarray.length];
		int left = strarray.length / 2 - 1, right;
		if (strarray.length % 2 == 0) {
			right = strarray.length / 2;
		} else {
			right = strarray.length / 2 + 1;
		}

		while (right < strarray.length) {
			if (output[left] = isPalindrom(strarray[left])) {
				left--;
			}
			if (output[left] = !isPalindrom(strarray[left])) {
				left--;
			}
			if (output[right] = isPalindrom(strarray[right])) {
				right++;
			}
			if (output[right] = !isPalindrom(strarray[right])) {
				right++;
			}
		}
		return output;
	}
}

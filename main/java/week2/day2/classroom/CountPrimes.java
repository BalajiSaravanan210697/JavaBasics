package week2.day2.classroom;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimes {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - int
	 * output  - int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid TestCases : 
	 * 1.Input: n = 10 Output: 4
	 * 2.Input: n = 0 Output: 0
	 * 3.Input: n = 1 Output: 0
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!

     > Initialize count variable 
     > isPrime function to check the giving number is prime or not 
     > if the isprime method return true than increase count
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
public void validTestCase() {
	Assert.assertEquals(4, countPrimes(10));
}

public boolean isPrimeorNot(int input) {
	if (input > 1) {
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return false;
			}
		}
	}
	return true;
}

public int countPrimes(int n) {
	int count = 0;
	for (int i = 2; i < n; i++) {
		if (isPrimeorNot(i) == true) {
			count++;
		}
	}
	return count;

}
}

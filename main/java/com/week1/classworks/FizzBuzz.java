package com.week1.classworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  - int
	 * output  - List<String>
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test Cases : 
	 * 1.Input: n = 3 Output: ["1","2","Fizz"]
	 * 2.Input: n = 5  Output: ["1","2","Fizz","4","Buzz"]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	  > Initialise  the List<Integer> to store the output value
	  > for loop to iterate the n value from 1 till it reaches the n
	  > if the i value divisible by 3 and 5 the add   "FizzBuzz"  to List
	     else if the value is divisible by 3 than add "Fizz" to List
	     else if the value id divisible by 5 than add "Buzz" to List
	     else add i value to the list
	  > return list
	     
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Done
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
		List<String> actual = Arrays.asList(new String[] {"1", "2", "Fizz"});
		Assert.assertEquals(actual, fizzBuzz(3));
	}
	@Test
	public void validTestCase1() {
		List<String> actual = Arrays.asList(new String[] {"1","2","Fizz","4","Buzz"});
		Assert.assertEquals(actual, fizzBuzz(5));
	}
	  public List<String> fizzBuzz(int n) {
			List<String> output = new ArrayList<String>();
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					output.add("FizzBuzz");
				} else if (i % 3 == 0) {
					output.add("Fizz");
				} else if (i % 5 == 0) {
					output.add("Buzz");
				} else {
					output.add(Integer.toString(i));
				}
			}
			return output;
		}
}

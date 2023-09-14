package week11.Homworks.Day3;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- int[] , String 
	 * output -- String
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * 1.input -- indices[4,5,7,6,0,1,2,3] s= "lefatest" output -- "testleaf"
	 * 2.input -- indices[0,2,1] s="cta" output -- "cat"
	 * 3.input -- indices[0] s="b" output -- "b"
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * >Get the input values of int[] and String
	 * >Declare the char array to store the character at indexs
	 * >using for loop to iterate the string 
	 * >Get the character at the indices of i from string
	 * >Store into respective indices of array i position
	 * >return the String 
	
	 * >.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 * public String shffleStringafter(String s,int[] indices) {
		char[] temp = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            temp[indices[i]] = s.charAt(i);    
        }
        return new String(temp);	
	}
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
@Test
public void validTestcase() {
	Assert.assertEquals("testleaf", shffleStringafter("lefatest", new int[] { 4, 5, 7, 6, 0, 1, 2, 3 }));
}

@Test
public void validTestcase1() {
	Assert.assertEquals("cat", shffleStringafter("cta", new int[] { 0, 2, 1 }));
}

@Test
public void validTestcase2() {
	Assert.assertEquals("a", shffleStringafter("a", new int[] { 0 }));
}

public String shffleStringafter(String s, int[] indices) {
	char[] temp = new char[indices.length];
	for (int i = 0; i < s.length(); i++) {
		temp[indices[i]] = s.charAt(i);
	}
	return new String(temp);
}
}

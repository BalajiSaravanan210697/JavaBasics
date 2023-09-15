package week11.Homeworks.day4;

import org.junit.Assert;
import org.junit.Test;

public class ReverseofString {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- String
	 * output  -- String
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Testcases:
	 * 1. input -- "reverse this string" output -- "gnirts siht esrever"
	 * 2. input -- "balaji s"            output -- s ijalab
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * no
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * > intialise the String reverse store the reversed string  
	 * > for loop to iterate the String but in reverse order
	 * > i value should equal to string length minus one and i value greater than equal to 0 and decrement
	 * > get the character from the string and add into reverse string
	 * > return string
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 public String reverseString(String S){
	 String reverse=""; 
	 for(int i=S.length()-1;i>=0;i--){
	 reverse+=S.charAt(i); 
	 }return reverse;
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
Assert.assertEquals("gnirts siht esrever", reverseString("reverse this string"));
}
@Test
public void validTestcase1() {
Assert.assertEquals("s ijalab", reverseString("balaji s"));
}
@Test
public void validTestcase2() {
Assert.assertEquals("s", reverseString("s"));
}
@Test
public void validTestcase3() {
Assert.assertEquals(" ", reverseString(" "));
}

public String reverseString(String S) {
	if(S.length()==1||S.contains(" ")){return S;}
	String reverse = "";
	for (int i = S.length() - 1; i >= 0; i--) {
		reverse += S.charAt(i);
	}
	return reverse;
}
}

package week11.Homworks.Day3;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWords {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- String
	 * output -- String
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * ValidCase
	 * 1.input -- s = "Let's take LeetCode contest" output -- s'teL ekat edocteeL tsetnoc
	 * 2.input -- s="bal'a"   output -- a'lab
	 * 3.input -- s="God Ding" output -- doG gniD
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * 
	 * > Get the input String and initialize the String output variable
	 * > Split the String using space (" ") and store back to the String Array
	 * > Get the String from the array and Reverse using Reverse function 
	 * > Add the reversed String from array and store back to output string
	 * > return output string 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 public String reverseWords(String s){
	 String output = "";
	 for(int i=s.length()-1;i>=0;i--){
	 output+= s.charAt(i);
	 }
	 return output;
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
public void validtestcase() {
	Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));

}

@Test
public void validtestcase1() {
	Assert.assertEquals("bal'a", reverseWords("a'lab"));

}

@Test
public void validtestcase2() {
	Assert.assertEquals("doG gniD", reverseWords("God Ding"));

}

public String reverseWords(String s) {
	String output = "";
	String reverse = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		reverse += s.charAt(i);
	}
	String[] splitarray = reverse.split(" ");

	for (int j = splitarray.length - 1; j >= 0; j--) {
		output += " " + splitarray[j];
	}
	output = output.trim();
	System.out.println(output);
	return output;
}
}

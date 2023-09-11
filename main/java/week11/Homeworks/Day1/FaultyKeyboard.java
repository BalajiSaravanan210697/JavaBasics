package week11.Homeworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class FaultyKeyboard {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String 
	 * output - String
	 * constraints - 0th index would not be i 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test case : 
	 * 1.input : s="string"  output : "rtsng"
	 * 2.input : s="poiinter"  output : "ponter"
	 * 3.input : s="bi"  output : "b"
	 * 4.input : s="balajisara"  output : "balajsara"
	 * 5.input : s="balajisarsir"  output : "balajrassr"
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * > Initialize String variable named output      //balajisara
	 * > for loop to iterate the given input string   // b a l a j s a r a
     * > if the String contains character 'i' then reverse a string till now stored in output String and stored back to string output  i==i  reverse(jalab)
     * > else output string to store the each character if not i   //b a l a j  jalab s a r a
     * > return the output 
	
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Done
	 * 7.Write the code on notepad
	 * public String reverseString(String str){
	 * String reverse="";
	 * for(int j=str.length-1;j>=0;j--){
	 * reverse+=str.charAt(j);
	 * }
	 * return reverse;
	 * }
	 * public String faultKeyboard(String s){
	 * String output ="";
	 * for(int i=0;i<s.length;i++){
	 * if(s.charAt(i)=='i'){
	 * reverseString(output);
	 * output=output;
	 * }else{
	 * output+=s.chartAt(i);
	 * }
	 * }
	 * return output;
	 * }
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
	Assert.assertEquals("balajsara", faultKeyboard("balajiisara"));
}

@Test
public void validTestCase1() {
	Assert.assertEquals("b", faultKeyboard("bi"));
}

@Test
public void validTestCase2() {
	Assert.assertEquals("ponter", faultKeyboard("poiinter"));
}

@Test
public void validTestCase3() {
	Assert.assertEquals("rtsng", faultKeyboard("string"));
}

@Test
public void validTestCase4() {
	Assert.assertEquals("balajrassr", faultKeyboard("balajisarsir"));
}

public String reverseString(String str) {
	String reverse = "";
	for (int j = str.length() - 1; j >= 0; j--) {
		reverse += str.charAt(j);
	}
	return reverse;
}

public String faultKeyboard(String s) {
	String output = "";
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) == 'i') {
			output = reverseString(output);
		} else {
			output += s.charAt(i);
		}
	}
	return output;
}
}

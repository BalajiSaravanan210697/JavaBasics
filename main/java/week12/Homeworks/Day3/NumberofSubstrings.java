package week12.Homeworks.Day3;

import org.junit.Assert;
import org.junit.Test;

public class NumberofSubstrings {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- String
	 * output  -- int  
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Test cases:
	 * 1.input -- s = "abcabc" Output -- 10
	 * 2.input -- s = "aaacb"  Output --  3
	 * 3.input -- s = "abc"    Output --  1
	
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 > Initialize the integer left = 0 and right = k and initialize k=3 and String substring to store the string and count=0
	 > for loop to iterate the initial index of string left from 0 left<s.length-k
	 > nested for loop to iterate the end index of substring value right till the s.length
	 > Substring to store the element from the string
	 > if the substring contains the abc using method check true than increase the count
	     isContains method check the substring contains abc 
	 > return count 
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
	 *
	 public boolean isContains(String str){
	 return str.contains("abc");
	 } 
	  public int numberOfSubstrings(String s){
	  int left,right,k=3,count=0;
	  String substring="";
	  for(left=0;left<=s.length()-k;left++){
	  for(right=k;right<s.length();k++){
	  if(isContains(substring=s.substring(left,right))==true){
	  count++;
	  }
	  }
	  }
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
	Assert.assertEquals(10, numberOfSubstrings("abcabc"));
}

@Test
public void validTestcase1() {
	Assert.assertEquals(3, numberOfSubstrings("aaacb"));

}

@Test
public void validTestcase2() {
	Assert.assertEquals(1, numberOfSubstrings("abc"));

}

public boolean isContains(String str) {
	return (str.contains("a") && str.contains("b") && str.contains("c"));

}

public int numberOfSubstrings(String s) {
	int left = 0, right = 3, count = 0;
	String sub = "";
	while (left <= s.length() - 3) {
		while (right <= s.length()) {
			sub = s.substring(left, right);
			if (isContains(sub) == true) {
				count++;
			}
			right++;
		}
		left++;
		right = 3;
		right += left;
	}
	System.out.println(count);
	return count;
}

}

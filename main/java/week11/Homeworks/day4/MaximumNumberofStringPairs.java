package week11.Homeworks.day4;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberofStringPairs {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String[] 
	 * output - int
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Testcases 
	 * input -- words = ["cd","ac","dc","ca","zz"] output --3
	 * input -- words = ["ab","ba","cc"]  output -- 1
	 * input -- words = ["aa","ab"] output -- 0
	 * input -- words = ["aa"]   output --0
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * 
	 * > Initialize the count variable to 0 
	 * > Check the lenghth of words array if it equals to 1 then return count
	 * > for loop to iterate the words String array
	 * >  nested for loop to iterate the remain element of string array & Reverse the String 
	 * > if the reverse value is equal to words array value then increase the count and break 
	 * > return the count
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 
	 public int maximumNumberOfStringPairs(String[] words){
	 int count=0;
	 String reverse ="";
	 for(int i=0;i<words.length;i++){
	 for(int j=i+1;j<words.length;j++){
	  reverse= words[j].charAt(1)+words[j].charAt(0);
	  if(words[i]==reverse){
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
public void Validtest() {
	Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] { "cd", "ac", "dc", "ca", "zz" }));
}
@Test
public void Validtest1() {
	Assert.assertEquals(1, maximumNumberOfStringPairs(new String[] { "ab","ba","cc"}));
}
@Test
public void Validtest2() {
	Assert.assertEquals(0, maximumNumberOfStringPairs(new String[] { "aa","ab"}));
}
@Test
public void Validtest3() {
	Assert.assertEquals(0, maximumNumberOfStringPairs(new String[] {"cd"}));
}
public int maximumNumberOfStringPairs(String[] words) {
	int count = 0;
	if (words.length == 1) {
		return count;
	}
	for (int i = 0; i < words.length; i++) {
		for (int j = i + 1; j < words.length; j++) {
			if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
				count++;
				break;
			}
		}
	}
	return count;
}

}

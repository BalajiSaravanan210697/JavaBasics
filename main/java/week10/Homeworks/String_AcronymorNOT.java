package week10.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class String_AcronymorNOT {
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints) 
	 * Yes 
	 * input - String[],String 
	 * output - boolean
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid test cases :
	 * input --> Str[] ["alice","bob","charlie"] s = "abc" output --> TRUE
	 * input--> Str[] ["test","leaf"] s = "lt" output --> FALSE
	 * input --> Str[] ["automation"] s = "ab" output --> FALSE
	 * 
	 * 3.Do you know the Solution? Yes 4.Do you have any alternate approaches?
	 * (Thing of alternate approaches) No 5. Derive Pseudo code in paper (for the
	 * best chosen approach) Use ChatGPT to get approach or hints not the entire
	 * solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE
	 * APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND
	 * PRACTICED + Remember how your brain is converting the test data input to its
	 * expected output!
	 * 
	 * > Get the List of Strings from array words and String s 
	 * > Initaise the String named firstElements in Words
	 * > for loop iterate the words in array till the array length 
	 * > Get the first character from the words and append it 
	 * > comparethe firstElements value with s value if both are equal then return true
	 * 
	 * 
	 * 6.Dry run the pseudo code with all test data from step #2 
	 * Done 
	 * 7.Write thecode on notepad 
	 * public boolean isAcronym(String[] words,String s){ 
	 * String firstElements = ""; 
	 * for(int i=0;i<words.length-1;i++){
	 * firstElements+=words[i].charAt(0); 
	 * } 
	 * if(s.equals(firstElements))
	 * { return true
	 * } return false;
	 * } 
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using
	 * debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 * 
	 */
	@Test
	public void Valid() {
		String[] words = {"alice", "bob", "charlie"};
		boolean actual = isAcronymlist(Arrays.asList(words), "abc");
		Assert.assertEquals(true, actual);
		
	}

	@Test
	public void ValidCase() {
		String[] words = { "test", "leaf"};
		boolean actual = isAcronymlist(Arrays.asList(words), "lt");
		Assert.assertEquals(false, actual);
	}

	@Test
	public void EdgeValidCase() {
		String[] words = {"automation"};
		boolean actual = isAcronymlist(Arrays.asList(words), "ab");
		Assert.assertEquals(false, actual);

	}

	public boolean isAcronym(String[] words, String s) {
		String firstElements = "";
		for (int i = 0; i < words.length; i++) {
			firstElements += words[i].charAt(0);
		}
		if (s.equals(firstElements)) {
			return true;
		}
		return false;
	}
	public boolean isAcronymlist(List<String> words, String s) {
		String firstElements = "";
		for (int i = 0; i < words.size(); i++) {
			firstElements += words.get(i).charAt(0);
		}
		if (s.equals(firstElements)) {
			return true;
		}
		return false;
	}
}
package week9.Classworks;

import org.junit.Test;

public class Vowels {
	/*Write a program to remove vowels from a String
	Example:
	Input: "Hi testleaf students"
	Output: "H tstlf students" */
	
	/*input --> String
	output --> String
	
	1.Get the input string 
	2.iterate the string elements one by one
	3.Get the character element and store 
	4.check the vowels value equals to a,e,i,o,u anyone of the character 
	5.the value is present then dont add those character to string
	6.otherwise add all characters to string*/
	@Test
	public void test() {
		vowelsRemove("HI testleaf students");
	}
	public String vowelsRemove(String input) {
		StringBuilder output=new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char character=input.charAt(i);
			if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U') {
				}else {
					output=output.append(character);
				}
		}
		System.out.println(output);
		return output.toString();
		
	} 
}

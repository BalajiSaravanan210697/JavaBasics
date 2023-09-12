package week11.Homework.Day2;

import org.junit.Assert;
import org.junit.Test;

public class NumberofLines {
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input  -- int[],String
	 * output -- int[] 
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid Testcases : 
	 * 1.Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
	 * output : [3,60]
	 * 
	 * 2.Input: widths = [10,3,4,5,5,3,4,8,5,2,3,4,3,2,3,4,4,4,5,7,5,4,9,8,5,3], s = "zesrwqqa"
	 * output : [1.44]
	 * 
	 * 3.Input: widths = [10,3,4,5,5,3,4,8,5,2,3,4,3,2,3,4,4,4,5,7,5,4,9,8,5,3], s = "a"
	 * output : [1,10]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5.Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 * > Initialise the int varaible lines=1 linepixelvalue , characterwidhth int[] result of size to store the value
	 * > for loop to iterate the String 
	 * > Character at the string to subtract the 'a' to find the index and stored into characterwidhth 
	 * > if the linepixelvalue+characterwidhth[i] value greater than 100 increment the lines value and reset linepixelvalue and the value into linepixelvalue+characterwidhth[i] 
	 * > else linepixelvalue to sum the value based on characterwidhth to index based value from width
	 * > return lines and linepixelvalue and stored back to the int[] result
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
       public int[] numberOfLines(int[] widths, String s){
       int[] result=new int[2];
       int lines=1,linepixelvalue=0,characterwidhth=0;;
       
       for(int i=0;i<s.length();i++){
       characterwidhth=s.chartAt(i) - 'a';   
       if(linepixelvalue+widths[characterwidhth]>100){
       lines++;
       linepixelvalue=0;
       linepixelvalue += widths[characterwidhth];
       }
       else{
       linepixelvalue += widths[characterwidhth];}      
       }
       result[0]=lines;
       result[1]=linepixelvalue; 
       return result;
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
	public void validTestCase() {
		Assert.assertArrayEquals(new int[] { 3, 60 }, numberOfLines(new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "abcdefghijklmnopqrstuvwxyz"));
	}

	@Test
	public void validTestCase1() {
		Assert.assertArrayEquals(new int[] { 1, 44 },
				numberOfLines(
						new int[] { 10, 3, 4, 5, 5, 3, 4, 8, 5, 2, 3, 4, 3, 2, 3, 4, 4, 4, 5, 7, 5, 4, 9, 8, 5, 3 },
						"zesrwqqa"));
	}

	@Test
	public void validTestCase2() {
		Assert.assertArrayEquals(new int[] { 1, 10 }, numberOfLines(
				new int[] { 10, 3, 4, 5, 5, 3, 4, 8, 5, 2, 3, 4, 3, 2, 3, 4, 4, 4, 5, 7, 5, 4, 9, 8, 5, 3 }, "a"));
	}

	@Test
	public void validTestCase3() {
		Assert.assertArrayEquals(new int[] { 2, 4 }, numberOfLines(new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "bbbcccdddaaa"));
	}

	public int[] numberOfLines(int[] widths, String s) {
		int[] result = new int[2];
		int lines = 1, linepixelvalue = 0, characterwidhth = 0;
		for (int i = 0; i < s.length(); i++) {
			characterwidhth = s.charAt(i) - 'a';
			if (linepixelvalue + widths[characterwidhth] > 100) {
				lines++;
				linepixelvalue = 0;
				linepixelvalue += widths[characterwidhth];
			} else {
				linepixelvalue += widths[characterwidhth];
			}
		}
		result[0] = lines;
		result[1] = linepixelvalue;
		return result;
	}

}

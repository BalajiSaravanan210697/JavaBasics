package week11.Homework.Day2;

import org.junit.Assert;
import org.junit.Test;

public class BalancedStrings {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input - String
	 * output - int
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid TestCase 
	 * 1.input -- s = "RLRRLLRLRL"  output -- 4
	 * 2.input -- s = "RLRRRLLRLL"  output -- 2
	 * 3.input -- s = "RLRLLR"      output -- 3
	 * 4.input -- s = "LLRR"        output -- 1
	 * 5.input -- s = "LL" or "RR"  output -- 0
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5.Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 * > Initialize the count variable into zero and RCount=0 and LCount=0
	 * > for loop iterate the given String till the length
	 * > check the charAt i the position equal to 'R' then increase the RCount
	 * >   else increase the LCount
	 * >  if the LCount equal to RCount then increase the count and reset the RCount and LCount
	 * > return count
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 * public int balancedStringSplit(String s){
	 * int count=0,Rcount=0,Lcount=0;
	 * for(int i=0;i<s.length();i++){
	 * if(s.charAt(i)=='r'){
	 * Rcount++;
	 * }else{ Lcount++;
	 * }
	 * if(Rcount==Lcount){
	 * count++;
	 * Rcount=0;
	 * Lcount=0;
	 * }
	 * }
	 * return count;
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
	public void validtestcase() {
		Assert.assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
	}
	@Test
	public void validtestcase1() {
		Assert.assertEquals(2, balancedStringSplit("RLRRRLLRLL"));
	}
	@Test
	public void validtestcase2() {
		Assert.assertEquals(3, balancedStringSplit("RLRLLR"));
	}
	@Test
	public void validtestcase3() {
		Assert.assertEquals(1, balancedStringSplit("LLRR"));
	}
	@Test
	public void validtestcase4() {
		Assert.assertEquals(0, balancedStringSplit("LL"));
	}
	@Test
	public void validtestcase5() {
		Assert.assertEquals(0, balancedStringSplit("RR"));
	}
		
	 public int balancedStringSplit(String s){
			int count = 0, Rcount = 0, Lcount = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'R') {
					Rcount++;
				} else {
					Lcount++;
				}
				if (Rcount == Lcount) {
					count++;
					Rcount = 0;
					Lcount = 0;
				}
			}
			return count;
		}

	}

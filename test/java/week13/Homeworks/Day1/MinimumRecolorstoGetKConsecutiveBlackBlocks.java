package week13.Homeworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
	/*2379. Minimum Recolors to Get K Consecutive Black Blocks
	You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
    You are also given an integer k, which is the desired number of consecutive black blocks.
    In one operation, you can recolor a white block such that it becomes a black block.
    Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
    Example 1:
    Input: blocks = "WBBWWBBWBW", k = 7
	Output: 3
	Explanation:
	One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
	so that blocks = "BBBBBBBWBW". 
	It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
	Therefore, we return 3.
	Example 2:
	Input: blocks = "WBWBBBW", k = 2
	Output: 0
	Explanation:
	No changes need to be made, since 2 consecutive black blocks already exist.
	Therefore, we return 0.
	Constraints:
	n == blocks.length
	1 <= n <= 100
	blocks[i] is either 'W' or 'B'.
	1 <= k <= n*/
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
		 * Yes
		 * input - String , int
		 * output - int
		 * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * Valid Test cases : 
		 * Input: blocks = "WBBWWBBWBW", k = 7  Output: 3
		 * Input: blocks = "WBWBBBW", k = 2 
		 * 
		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * Yes
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		 
		 > Initialize the int variables left=0 and right = k-1 and currentcount = 0 count = 0   // blocks = "W B B W W B B W B W", k = 7  left = 0 right = 6 count = 0 currentcount = 0
		                                                                                  0 1 2 3 4 5 6 7 8 9
		 > while loop to iterate till the right reaches the string length  // 6<10  6<10
		
		 > while loop to iterate till the left reaches right  0<
		 
		 > check the character at the position and it is W then increment the count    W  count = 1 ,B,
		 
		 > after increment the count increment the right   // 1 != 7  right = 1 2!=7 right = 1 
		 
		 > if satisfied with condition then increment both left and right to check any minimal count is possible  1!=7
		 
		 > return the minimal count
		
		 * 6.Dry run the pseudo code with all test data from step #2
		 * Yes
		 * 7.Write the code on notepad
		 
        public int minimumRecolors(String blocks, int k) {
        int left = 0 ,right  = k-1, count = 0;
        while(right<blocks.lebgth()){
        while(left<=right){
        if(blocks.charAt(left)!='B'){
        count++;
        }
        left++;
        }
        count = Math.Min(count,count);
        left++;
        right++;
        }
        return count;
         }
		 * 8. Dry run the code with all test data from step #2
		 * Yes
		 * 9. Write code on IDE (remember to add comments and practice coding standards)
		 * Done
		 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		 * 
		 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
		 */
	@Test
	public void validTescase() {
		Assert.assertEquals(3, minimumRecolors("WBBWWBBWBW",7));
	}
	@Test
	public void validTescase1() {
		Assert.assertEquals(0, minimumRecolors("WBWBBBW",2));
	}
	
	public int minimumRecolors(String blocks, int k) {
		int left = 0, right = k, count = 0;
		while (right < blocks.length()) {
			while (left < right) {
				if (blocks.charAt(left) != 'B') {
					count++;
				}
				left++;
			}
			count = Math.min(count, count);
			left++;
			right++;
		}
		return count;
	}

	
}

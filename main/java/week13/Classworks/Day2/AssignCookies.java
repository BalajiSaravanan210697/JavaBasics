package week13.Classworks.Day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class AssignCookies {
/* Input: g = [1,2,1], s = [1,1]
 * pesudocode
 * Initialize the pointer left = 0 and right = 0 and count = 0  
 * Sort the arrays of g and s 
 * while loop to iterate till the left reaches the g array length or right reaches the s array length
 * if left value is equal or less than right value than increase the count and increment the left and right
 * else right pointer
 * return count
 * */
	@Test
	public void validTestcase() {
		Assert.assertEquals(1, findContentChildren(new int[] {1,2,3},new int[] {3}));
	}
public int findContentChildren(int[] g, int[] s) {
	// Initialize the pointer left = 0 and right = 0 and count = 0
	int left = 0, right = 0, count = 0;
	// Sort the arrays of g and s
	Arrays.sort(g);
	Arrays.sort(s);
	// while loop to iterate till the left reaches the g array length or right
	// reaches the s array length
	while (left < g.length && right < s.length) {
		// if left value is equal or less than right value than increase the count and
		// increment the left and right
		if (g[left] == s[right]) {
			count++;
			left++;
			right++;
		} else {
			right++;
		}
	}
	return count;
}
}

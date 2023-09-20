package week12.Classworks;

import org.junit.Assert;
import org.junit.Test;

public class ReverseaString {

	public String reverseString(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}
 public String reverseStringtwoPointers(String s) {
		char[] stringcharacter = s.toCharArray();
		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (i < j) {
				char temp = stringcharacter[j];
				stringcharacter[j] = stringcharacter[i];
				stringcharacter[i] = temp;
				j--;
			}
		}
		return new String(stringcharacter);
	}
	@Test
	public void validTestCase() {
		Assert.assertEquals("faeltset", reverseStringtwoPointers("testleaf"));
		System.out.println(reverseStringtwoPointers("testleaf"));
	}
	@Test
	public void validTestCase1() {
		Assert.assertEquals("fael tset", reverseString("test leaf"));
	}
	@Test
	public void validTestCase2() {
		Assert.assertEquals("fael tset", reverseString("test leaf"));
	}
}

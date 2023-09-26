package week13.Classworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class PalindromIntgerValue {
	@Test
	public void validTestCase() {
		Assert.assertEquals(true, isPalindrom(121));
	}

	public boolean isPalindrom(int n) {
		int remainder = 0,  reverse = 0;
		while (n >= 1) {
			remainder = n % 10;
			n = n / 10;
			reverse = remainder + (10*reverse);
		}
		return reverse == n;
	}
}

package week13.HomeWork.Day2;

import org.junit.Test;

public class Sample {

	@Test
	public void Test() {
		
	}

	public  String solution(String str) {
		int left = 0, right = str.length();
		char[] chararray = str.toCharArray();
		char temp = ' ';
		while (left < right) {
			temp = chararray[left];
			chararray[left] = chararray[right];
			chararray[right] = temp;
		}
		return new String(chararray);
	}
}

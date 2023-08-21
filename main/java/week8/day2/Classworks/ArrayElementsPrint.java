package week8.day2.Classworks;

import java.util.Arrays;

import org.junit.Test;

public class ArrayElementsPrint {
	
	public static void main(String[] args) {
		int[] primaryArray = {1,2,3};
	    int[] secondaryArray = primaryArray;
	    secondaryArray[2] = 5;
	    System.out.println(Arrays.toString(primaryArray));
	    System.out.println(Arrays.toString(secondaryArray));
	}
	
	@Test
	public void test() {
		arrayPrintElements2(new int[] {2,3,4,5});
	}
	public static int[] arrayPrintElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
		
	}
	
	public static int[] arrayPrintElements2(int[] array) {
		
		for (int eachvalue : array) {
			System.out.println(eachvalue);
		}
		return array;
		
	}
   
	
}

package week8.Classwork;

import org.junit.Test;

public class Susbstract {
	
	@Test
	public void test() {
		int[] actual= substractArray(new int[] {1,2,3,4},new int[] {2,3,4,5});
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);
		}
		
	}
	
	public static int[] substractArray(int[] arr1,int[] arr2) {
		int[] output=new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) { //based on length of first array 4  o(n)
			int sum=0; //Constant but it's looped 4 times based on  the above for loop
			for (int j = 0; j < arr2.length; j++) {  //based on first array length 4 --> and this array length 4 ==> 4*4 --> 16 
				if(i==j) continue;
				sum+=arr2[j];
				sum-=arr1[i];
			}
			 output[i]=sum;
		}
		return output;
	}

}

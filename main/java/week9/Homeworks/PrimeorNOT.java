package week9.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class PrimeorNOT {
	@Test
	public void Valid() {
	 Assert.assertEquals(true, isPrimeorNot(5));
	}
	@Test
	public void ValidTest() {
	 Assert.assertEquals(false, isPrimeorNot(10));
	}
	public int isPrimeNoCount() {
		int count=0;
		if(isPrimeorNot==true) {
			String
		}
		return count;
		
	}
	public boolean isPrimeorNot(int n){
		for(int i=2;i<n;i++){
		if(n%i==0){
		return false;
		}
		}return true;
		} 
}

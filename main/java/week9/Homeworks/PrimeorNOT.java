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
	
	public boolean isPrimeorNot(int n){
		for(int i=2;i<n;i++){
		if(n%i==0){
		return false;
		}
		}return true;
		} 
}

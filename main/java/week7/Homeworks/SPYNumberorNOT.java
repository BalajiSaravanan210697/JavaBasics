package week7.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class SPYNumberorNOT {
	/*1.Understanding the problem to detailed level (clarity on input and output, constraints)
	Yes Understood the problem
	input --<Integer>
	Output --<boolean>
	Constraints  --<postive numbers starts from 0>
	2.Frame Test data (valid, invalid, complex and edge cases)
	132		    TRUE
	1123		FALSE
	1124		TRUE
    3.Do you know the Solution?
	Yes
	4.Do you have any alternate approaches? (Thing of alternate approaches)
	Yes
	5. Derive Pseudo code in paper (for the best chosen approach)
	     Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	1.Get the input integer value n   //132
	2.Initialize the varaiables sum=0,Product=1,Dividend=0,Remainder=0
	3.Create a while loop and check the number is greater than 0 //132   13  1
	4.If condition to check the value is less than or equal to 9   //132  13  1
	    Yes then Remainder = n;  --> 1
	    else then remainder=n%10; //Iteration 1  -->  2   3
		            Dividend = n/10; // --> 13   1
					n=Dividend; //--> 13         1
	5. once the iteration add the sum value based on remainder sum+=remainder; 0+2+3+1
	6. Once the iteration done add the product value based on remainder  product+=rwmainder; 1*2*3*1				
	7. If the sum value equals product value then return true  6==6
	8. else return false
	6.Dry run the pseudo code with all test data from step #2
	Done
	7.Write the code on notepad
	public boolean isSPYNootNot(int n){
	int sum=0,product=1,Dividend=0,Remainder=0;
	while(n=>0){
	if(n>=0||n<=9){
	Remainder =n;
	}else{
	Remainder=n%10;
	Dividend=n/10;
	n=Dividend;
	}
	sum+=Remainder;
	Product*=Remainder;
	}
	if(sum==Product){return true}
	return false;
	}
	8. Dry run the code with all test data from step #2
    9. Write code on IDE (remember to add comments and practice coding standards)
   10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
   11. Check for any gaps of code optimization (if not optimized already in Step #9)*/
	@Test
	public void validtest1() {
		boolean actual=isSPYNootNot(132);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void validtest2() {
		boolean actual=isSPYNootNot(1123);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void validtest3() {
		boolean actual=isSPYNootNot(1124);
		Assert.assertEquals(true, actual);
	}
	public boolean isSPYNootNot(int n){
		int sum=0,product=1,Dividend=0,Remainder=0;
		while(n>=0){
		if(n>=0&&n<=9){
			sum+=n;
			product*=n;
			break;
		}else{
		Remainder=n%10;
		Dividend=n/10;
		n=Dividend;
		}
		sum+=Remainder;
		product*=Remainder;
		}
		if(sum==product){
	    return true;}
		return false;
		}
}

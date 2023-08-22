package week8.Homeworks.Day1;

import org.junit.Assert;
import org.junit.Test;

public class PlaceFlowers {
	/*
		 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		 * Yes
		 * Input - Int[] flowerbed ,int n
		 * Output - boolean
		 * Constraints:

           1 <= flowerbed.length <= 2 * 104
           flowerbed[i] is 0 or 1.
           There are no two adjacent flowers in flowerbed.
           0 <= n <= flowerbed.length  
             
         * 2.Frame Test data (valid, invalid, complex and edge cases)
		 * Positive :  flowerbed = [1,0,0,0,1], n = 1	TRUE
                       flowerbed = [0,0,1,0,1], n = 2	FALSE
           Edge     :  flowerbed = [0,0,0], n = 2	TRUE
           Negative :  flowerbed = [1,1], n = 1	Run Time exception
		 
		 * 3.Do you know the Solution?
		 * Yes
		 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
		 * No
		 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
		 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
		 * pesudocode :

          1.Get the integer array int[]  flowerbed and int n value   
          2.Iterate the flowerbed array using for loop  
          3. if the value of flowerbed[i] == 0 then check      
          4. if the value of flowerbed[i-1] && flowerbed[i+1] == 0  
          5  true then decrement the value of n-- 6
          6. return n==0;  
          
          pesudocode

         1.Get the int[] and int value
         2.for loop to iterate the int[] values till the length of array  
         3.if the flowerbed[i]==0 && flowerbed[i+1]==0
           Decrement the n value 
         4.Reset the i value from i=i+1    
		 * 6.Dry run the pseudo code with all test data from step #2
		 * 
		 * 7.Write the code on notepad
		 * 
		 * 8. Dry run the code with all test data from step #2
		 * 
		 * 9. Write code on IDE (remember to add comments and practice coding standards)
		 * 
		 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		 * 
		 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
		 */
	@Test
	public void valid() {
		boolean actual = flowerReplaceApproach2(new int[] {1,0,0,0,1},1);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void valid1() {
		boolean actual = flowersReplace(new int[] {1,0,0,0,1},2);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void Edge() {
		boolean actual = flowerReplaceApproach2(new int[] {0,0,0,0,0,0,0},4);
		Assert.assertEquals(true, actual);
	}
	 public boolean flowersReplace(int[] flowerbed,int n){
	   if ( flowerbed[0] == 0 && flowerbed[1]==0) {
		   n--;
	   }
	   if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0) {
		   n--;
	   }
		 for(int i=2;i<flowerbed.length-2;i++){
		  if(flowerbed[i]==0){
		   if(flowerbed[i+1]==0&&flowerbed[i-1]==0){
		       n--;
		         }
	           }
		} 
		 return n==0;
		}
	 
	 public boolean flowerReplaceApproach2(int[] flowerbed,int n) {
		  for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i]==0&&flowerbed[i+1]==0) {
				n--;
				i=i+2;
				if(i==flowerbed.length)break;
			}
		}
		return n==0; 
	 }
}

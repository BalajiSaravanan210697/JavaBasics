package week8.Homeworks.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SummaryRanges {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Input : int[]
       output : List<Strings>
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid:
        input [0,1,2,4,5,7] output ["0->2","4->5","7"]
        input [-2,0,3,4,6,7] output ["-2","0","3->4","6->7"]
       Edge:
        input [-3] output ["-3"]
        input [0]  output ["0"]
       Negative: 
        input [2,3,1] output 'nums' must be strictly increasing
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * >Get the input nums array                                                       [0,1,2,4,5,7]
	 * >Initialize String variable and List<String> arrayList named as list             0 1 2 3 4 5
	 * >if nums.length ==1 then return the List<String> with value present in the array
	 * >for loop to iterate the nums array 
	 * > if the nums[i]+1 = nums[i+1]                                                   1==1 2==2 3!=4
	 *         add the nums[i] value to the String s and seperated by : symbol          "0": + "1": :"2"
	 *         else add the nums[i] value to the String s and seperated by : symbol  
	 * >Split the string using symbol and add the value to the List<String>        "0" +"-->"+"2"
	 * >Return the List<String>       
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
	public void Validcase() {
		List<String> actual =summaryRanges(new int[] {0,1,2,4,5,7});
		System.out.println(actual);
	}
	@Test
	public void edgeCase() {
		List<String> actual =summaryRanges(new int[] {1});
		
	}
	 public void summaryRanges(int[] nums){
		 
		 } 
}

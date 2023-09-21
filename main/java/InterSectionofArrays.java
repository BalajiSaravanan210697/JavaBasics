import java.util.HashSet;
import java.util.Set;

public class InterSectionofArrays {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
	 * Intersection : the things prsent in one object should present in another object then it would intersected (nums,strings,words)
	 * input  - int[],int[]
	 * output - int[]
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * input nums1[2,4,4,5] nums[3,1]  --> output [0]
	 * input nums[1] nums2[1] --> [1]
	 * input [2,3,4,5] nums2[3,4,2] --> output [2,3,4]
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * 
	 * ->Get the input arrays nums1 and nums2
	 * ->Initialise set for Integer and the output array 
	 * ->for loop to iterate the nums1 values from 0 till nums1.length-1 
	 * -> nested for loop to iterate the nums2 value from 0 to nums2.length-1  
	 * -> Check the value of nums1 equals to nums2 value 
	 * ->      then add into the set 
	 * -> initialise the array length with set length 
	 * -> add the elements to int[]
	 * -> return the int[] values
	 * 6.Dry run the pseudo code with all test data from step #2
	 * 
	 * 7.Write the code on notepad
	 * public int[] interSection(int nums1,int nums2){
	 * Set<Integer> set=new HashSet<Integer>();
	 * for(int i=0;i<=nums1.length-1;i++){
	 * for(int j=0;j<=nums2.length-1;j++){
	 * if(nums[i]==nums[j]){
	 * set.add(nums[i]));
	 * break;
	 * }
	 * }
	 * }
	 * int[] output =new int[set.size()];
	 * for(int i=0;i<=set.size()-1;i++){
	 * output[i] = set(i);
	 * } return output;
	 * }
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
public int[] interSection(int[] nums1,int[] nums2){
		  Set<Integer> set=new HashSet<Integer>();
		  for(int i=0;i<nums1.length-1;i++){
		  for(int j=0;j<=nums2.length-1;j++){
		  if(nums1[i]==nums2[j]){
		  set.add(nums1[i]);
		  break;
		  }
		  }
		  }
		  int[] output = new int[set.size()];
		 for (int i : output) {
			
		} return output;
		  }


}

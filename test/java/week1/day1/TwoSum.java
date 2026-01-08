package week1.day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*1.Understanding the problem to detailed level (clarity on input and output, constraints)
      Yes (Find a pair of index value that's add up to derive the target)
      Input - int[] , int
      output - int[]
      Input array length would minium two input & inside numeric will be - and + Integers
      Target Integer would be - and + Integers
	2.Frame Test data (valid, invalid, complex and edge cases)
      Done
	3.Do you know the Solution?
     Yes
	4.Do you have any alternate approaches? (Thing of alternate approaches)
      Yes (using BF Approach, two pointers,HashMap)
	5. Derive Pseudo code in paper (for the best chosen approach)
	     Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!

        for loop i entries starts from 0 to the nums array till length-1 and increment
          nested for loop to itereate j from i+1 always till length-1 of nums array and increment on each iterations
           if the value of nums[i] and nums[j] add up and equals to target
             return the index values in the arrays i,j

	6.Dry run the pseudo code with all test data from step #2
       Done
	7.Write the code on notepad
      Done
	8. Dry run the code with all test data from step #2
       nums = [3,2,4] target == 6
     public int[] twoSum(int[] nums, int target){

	  for(int i=0; i<nums.length;i++){    // i=0,1
	   for(int j=i+1; j<nums.length;j++){ // j=1,2 2
	     if(nums[i]+nums[j] == target)    // 3+2 = 5 != target
		  return new int[]{i,j};            // 3+4 = 7 != target
	   }                                  // 2+4 = 6 == target [1,2]
	  }
	 return new int[]{0,0};
	}
	TC - o(n2) SC - o(1)

	9. Write code on IDE (remember to add comments and practice coding standards)
       Done
	10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
        Done
	11. Check for any gaps of code optimization (if not optimized already in Step #9)* Done/   */
	//TC - o(n2) SC - o(1)
    public int[] twoSum(int[] nums, int target){

	  for(int i=0; i<nums.length;i++){    // i=0,1
	   for(int j=i+1; j<nums.length;j++){ // j=1,2 2
	     if(nums[i]+nums[j] == target)    // 3+2 = 5 != target
		  return new int[]{i,j};            // 3+4 = 7 != target
	   }                                  // 2+4 = 6 == target [1,2]
	  }
	 return new int[] {0,0};
	}
	// TC- o(n) SC - o(n)
	public int[] twoSumusingMap(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap<>();
		 for(int i=0; i<nums.length; i++){
			int anotherValue = target-nums[i];
			if(map.containsKey(anotherValue)){
				return new int[] {i,map.get(anotherValue)};
			}
			map.put(nums[i],i);
		}
		return new int[] {0,0};
	}
    @Test
    public void test(){
	  int[] indexArray = twoSum(new int[] {2,7,11,15},9);
	  System.out.println("Two sum indices Arrays is :"+Arrays.toString(indexArray));
      Assert.assertArrayEquals(new int[]{0,1},indexArray);
    }

	@Test
	public void test1(){
		int[] indexArray = twoSum(new int[] {3,2,4},6);
		System.out.println("Two sum indices Arrays is :"+Arrays.toString(indexArray));
		Assert.assertArrayEquals(new int[]{1,2},indexArray);
	}

	@Test
	public void test2(){
		int[] indexArray = twoSum(new int[] {-2,5,3,-1,0},-3);
		System.out.println("Two sum indices Arrays is :"+Arrays.toString(indexArray));
		Assert.assertArrayEquals(new int[]{0,3},indexArray);
	}

	@Test
	public void test3(){
		int[] indexArray = twoSumusingMap(new int[] {2,7,11,15},9);
		System.out.println("Two sum indices Arrays is :"+Arrays.toString(indexArray));
		Assert.assertArrayEquals(new int[]{1,0},indexArray);
	}

	@Test
	public void test4(){
		int[] indexArray = twoSumusingMap(new int[] {3,2,4},6);
		System.out.println("Two sum indices Arrays is :"+Arrays.toString(indexArray));
		Assert.assertArrayEquals(new int[]{2,1},indexArray);
	}

	@Test
	public void test5() {
		int[] indexArray = twoSumusingMap(new int[]{-2, 5, 3, -1, 0}, -3);
		System.out.println("Two sum indices Arrays is :" + Arrays.toString(indexArray));
		Assert.assertArrayEquals(new int[]{3, 0}, indexArray);

	}
}

package week3.Homeworks;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberofOccurrences {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,
	 * constraints)
	 * Yes
	 * input  - int[]
	 * output - boolean 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Valid TestCase : 
	 * 1.arr = [1,2,2,1,1,3] Output: true
	 * 2.arr = [1,2] Output : false
	 * 3.arr = [-3,0,1,-3,1,1,1,-3,10,0] Output: true
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 
	 > Initialize Hashmap with Integer,Integer as Key and value pair
	 > for each to iterate the array elements and add to map with the count
	 >  Initialize HashSet with Integer value as key and map to be converted as set
	 >  if the map size and set size is equal return true
	 
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
	public void validTestCase() {
		Assert.assertEquals(true, uniqueOccurrences(new int[] {1,2,2,1,1,3}));
	}
	@Test
	public void validTestCase1() {
		Assert.assertEquals(false, uniqueOccurrences(new int[] {1,2}));
		
	}
	@Test
	public void validTestCase2() {
		Assert.assertEquals(true, uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}
	
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		HashSet<Integer> hset = new HashSet<Integer>(map.values());
		return hset.size() == map.size();

	}
}

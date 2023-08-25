package week8.Homeworks.Day5;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
	 * Yes 
       input int[] g, int[] s
       output int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * g = [1,3,4,5]  s =[1,2,2,4]  --> 2
       g = [2,4,3]  s =[1,3]  --> 1
       g = [3,2,1,4,5]  s =[3,1,2]  --> 3
       g = [4]          s=[3] --> 0
       g = [4,3]        s=[2,3] --> 1
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * No
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	 * >Get the integer array values of int[] g and int[] s     [1,3,4,5] [1,2,2,4]    
       >intalise the int varaiables Count=0,Difference=0   
       >for loop to iterate the int[] g array elements from i=0 1 3 4 5
       > nested for loop to iterate the int[] s array elements fro m j=0 1  0,2,2,4 0,2,2,1
       >  if the array element value of s[j] greater than or equal to array element value of g[i]    1==1 4>3
       >       Difference = s[j]-g[i] // Calculating diffrence between size and greed  1-1 = 0 4-3 =1
       >       s[j] = Difference // difference (means remainsize size should be stored in array again) [0,2,2,4] [0,2,2,1]
       > Increase the counter value and breaking the inner loop +1+1
       > return count
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
	int actual = findContentChildren(new int[] { 1, 3, 4, 5 }, new int[] { 1, 2, 2, 4 });
	Assert.assertEquals(2, actual);
}

@Test
public void valid2() {
	int actual = findContentChildren(new int[] { 2, 4, 3 }, new int[] { 1, 3 });
	Assert.assertEquals(1, actual);
}

@Test
public void Edge1() {
	int actual = findContentChildren(new int[] { 4 }, new int[] { 3 });
	Assert.assertEquals(0, actual);
}

@Test
public void Edge2() {
	int actual = findContentChildren(new int[] { 1 }, new int[] { 2 });
	Assert.assertEquals(1, actual);
}

public int findContentChildren(int[] g, int[] s) {
	int Count = 0, Difference = 0;
	for (int i = 0; i < g.length; i++) {
		for (int j = 0; j < s.length; j++) {
			if (s[j] >= g[i]) {
				Difference = s[j] - g[i];
				s[j] = Difference;
				Count++;
				Difference = 0;
				break;
			}
		}
	}
	return Count;
}
}

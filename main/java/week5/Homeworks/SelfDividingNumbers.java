package week5.Homeworks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SelfDividingNumbers {
	/*
	 * 1) Did I understand the problem? Description : To find that in given integer
	 * series divisible -> If yes, go to next step !!
	 * 
	 * What is the input(s)? int , int What is the expected output? List<Integer> Do
	 * I have constraints to solve the problem? 1<left<right<100000 Do I have all
	 * informations to go to next step!!
	 * 
	 * 2) Test data set Minimum of 3 data set !! Positive, Edge, Negative Valid
	 * TestCase : 1.Input: left = 1, right = 22 Output:
	 * [1,2,3,4,5,6,7,8,9,11,12,15,22] 2.Input: left = 47, right = 85 Output:
	 * [48,55,66,77] 3) Do I know how to solve it? Yes - great. - Ask for tip Yes 4)
	 * Ask for hint (If you do not know how to solve) No 5) Start always with Pseudo
	 * code
	 * 
	 * > Initialize the List of Integer to store the output number > for loop to
	 * iterate the left to right elements > check the number is self dividing number
	 * is true than add into List -- isSelfdividend > return output
	 * 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void validTestCase() {
		selfDividingNumbers(21, 22);
	}

	@Test
	public void validTestCase1() {
		selfDividingNumbers(47, 85);
	}

	public boolean isSelfDividend(int num) {
		int remainder = 0, number = num;
		while (number>0) {
			remainder = number % 10;
			if (remainder == 0 || num % remainder != 0) {
				return false;
			}
			number = number / 10;
		}
		return true;
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> outputlist = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (isSelfDividend(i) == true) {
				outputlist.add(i);
			}
		}
		return outputlist;

	}

}

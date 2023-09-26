package week13.HomeWork.Day2;

public class BowlingGame {
/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,constraints)
	 * Yes
	 * input -- int[] , int[]
	 * output -- int
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * ValidTestCase : 
	 * 1.input  -- p1 ={2,1,3,10} p2={10,2,1,1} output --2
	
	 * 3.Do you know the Solution?
	 * Yes
	 * 4.Do you have any alternate approaches? (Thing of alternate approaches)
	 * Yes
	 * 5. Derive Pseudo code in paper (for the best chosen approach) Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY
	 *  WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
     
     > Initialize the pointer variable to zero and player1sum to zero and player2sum to zero  // p1 ={2,1,3,10} p2={10,2,1,1} pointer = 0
   
     > while loop to iterate till the pointer reaches the playe1 array length // 0<4 1<4 2<4
     
     > if the pointer minus one and pointer minus two values if any one of them is 10 than multiply current value into two  
     if the value is less than zero no need to check 0-1 0-2  == -1,-2 not to check  1-1=0 1-2 =-1(not check)  0 (2) 2-1=1 2-2 = 0
          player1sum should be the pointer value into 2 
          else the player1sum value should be the value present in the array   player1sum =10+2+3
     
      > if the pointer minus one and pointer minus two values if any one of them is 10 than multiply current value into two
       if the value is less than zero no need to check 0-1 0-2  == -1,-2 not to check  1-1=0 1-2 =-1 (not check) 0(10) 2-1=1,2-2=0 
          player2sum should be the pointer value into 2 player2sum = 2*2 = 4  2*1 = 2 --> 6
          else the player2sum value should be the value present in the array    player2sum = 10
     
     > compare the player1sum and player2sum if the player1sum greater than player2sum return 1 else return 2
     
     > return both or equal than to 0 
     
	 * 6.Dry run the pseudo code with all test data from step #2
	 * Yes
	 * 7.Write the code on notepad
 
    public int isWinner(int[] player1,int[] player2){
    //Initialize the pointer variable to zero and player1sum to zero and player2sum to zero 
      int pointer = 0 , player1sum = 0, player2sum = 0;
    //while loop to iterate till the pointer reaches the playe1 array length
      while(pointer<player.length){
    // if the pointer minus one and pointer minus two values if any one of them is 10 than multiply current value into two
     //if the value is less than zero no need to check
      if(pointer-1>=0 && nums[pointer-1] =10 || pointer-2>=0 && nums[pointer-2] = 10){
      player1sum+ =2*nums[pointer];
      }
      else{
      player1sum+ = nums[pointer];
      }
      // if the pointer minus one and pointer minus two values if any one of them is 10 than multiply current value into two
       //if the value is less than zero no need to check 0-1 0-2  == -1,-2 not to check  1-1=0 1-2 =-1 (not check) 0(10) 2-1=1,2-2=0 
         // player2sum should be the pointer value into 2 player2sum = 2*2 = 4  2*1 = 2 --> 6
          // else the player2sum value should be the value present in the array    player2sum = 10
      if(pointer-1>=0 && nums[pointer-1] =10 || pointer-2>=0 && nums[pointer-2] = 10){
      player2sum+ =2*nums[pointer];
      }
      else{
      player2sum+ = nums[pointer];
      }
      pointer++;
     
      }
     //compare the player1sum and player2sum if the player1sum greater than player2sum return 1 else return 2 
      if(player1sum>player2sum) {return 1;
      }else{return 2;}
      return 0;
      }  
    
    }
	 * 8. Dry run the code with all test data from step #2
	 * 
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * 
	 * 10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
public int isWinner(int[] player1, int[] player2) {
	// Initialize the pointer variable to zero and player1sum to zero and player2sum to zero
	int pointer = 0, player1sum = 0, player2sum = 0;
	// while loop to iterate till the pointer reaches the playe1 array length
	while (pointer < player1.length) {
		// if the pointer minus one and pointer minus two values if any one of them is
		// 10 than multiply current value into two
		// if the value is less than zero no need to check
		if (pointer - 1 >= 0 && player1[pointer - 1] == 10 || pointer - 2 >= 0 && player1[pointer - 2] == 10) {
			player1sum += 2 * player1[pointer];
		} else {
			player1sum += player1[pointer];
		}
		// if the pointer minus one and pointer minus two values if any one of them is 10 than multiply current value into two
		// if the value is less than zero no need to check 0-1 0-2 == -1,-2 not to check 1-1=0 1-2 =-1 (not check) 0(10) 2-1=1,2-2=0
		// player2sum should be the pointer value into 2 player2sum = 2*2 = 4 2*1 = 2--> 6
		// else the player2sum value should be the value present in the array player2sum = 10
		if (pointer - 1 >= 0 && player2[pointer - 1] == 10 || pointer - 2 >= 0 && player2[pointer - 2] == 10) {
			player2sum += 2 * player2[pointer];
		} else {
			player2sum += player2[pointer];
		}
		pointer++;
	}
	// compare the player1sum and player2sum if the player1sum greater than player2sum return 1 else return 2
	if (player1sum > player2sum) {
		return 1;
	} else if (player1sum == player2sum) {
		return 0;
	} else {
		return 2;
	}
}
}

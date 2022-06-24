//Beggining of the exercise class
public class Exercise1
{
	//Beggining of Main Method
	public static void main(String[] args)
	{
		//Declare the player 1 card hand array
		int[] player1 = {10,6,8,9,7,12,7};
		//Declare the player 2 card hand array
		int[] player2 = {7,6,9,5,2,8,11};
		//count and store player 1 wins
		int player1Wins = 0;
		//count and store player 2 wins
		int player2Wins = 0;
		//Declare index to use to compare players hands
		int compHands = 0;
		//count the number of wins from player1
		
		
		//Print out a header for the card busters game
		System.out.println("**************************************************************************** Play Card Busters!!! ******************************************************************************************************"+"\n");
		//Setting up a for loop for rounds
		for(int r=1; r<8; r++)
		{
			//Check which player has the greater number or if it is a tie
			if(player1[compHands] > player2[compHands]){
				System.out.println(" Round No: " + r + "- Player 1 wins the round: " + player1[compHands] + " beats " + player2[compHands]);
				compHands++;
				player1Wins++;
			}else if (player1[compHands]<player2[compHands]){
				System.out.println(" Round No: " + r + "- Player 2 wins the round: " + player2[compHands] + " beats " + player1[compHands]);	
				compHands++;
				player2Wins++;
			}else{
				System.out.println(" Round No: " + r + "- Tie! " + player1[compHands] + " ties with " + player2[compHands]);
				compHands++;
			}
			
		
		}
		//Check which player got greater number of wins or if it is a tie
		if (player1Wins>player2Wins)
		{
			System.out.println(" \n Player One wins!! Player won " + player1Wins + " rounds beating Player Two who won " + player2Wins +" rounds");
		}else if(player2Wins>player1Wins){
			System.out.println(" \n Player Two wins!! Player won " + player2Wins + " rounds beating Player One who won " + player1Wins +" rounds");
		}else{
			System.out.println(" \n Game tied!! Player One and Player Two won " + player1Wins + " rounds each ");
		}
			
	}
}
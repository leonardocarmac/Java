//Begging the exercise creating a class
public class Exercise2
{
	//Begging the main method
	public static void main(String[] args)
	{
		//Declaring the variable money
		int kitty = 500;
		//Declaring the array which contains the loans amounts 
		int[] loans = {60,20,100,80,40,300,200,100};
		
		//Creating a loop to go through loans amounts 
		for(int a=0; a < loans.length ; a++)
		{
			if(loans[a]<= kitty)
			{
				System.out.println("\n Cash in the pot: " + kitty);
				System.out.println(" Loan amount requested: " + loans[a] +" - Loan amount granted!");
				kitty -= loans[a];
			
				
			}
			else if(loans[a]>kitty && kitty>0)
			{
				System.out.println("\n Cash in the pot: " + kitty);
				System.out.println(" Loan amount requested: " + loans[a]);
				System.out.println(" The exact loan request amount cannot be processed in full (insufficent funds available. However, we will give you what we can... " + kitty);
				kitty=0;
				System.out.println("\n Cash remaining in the pot: " + kitty);
				System.out.println("\n The following loan requests could not be facilitated:");
			}
			else
			{ 
				
				System.out.println(" " + loans[a]);
			}
				
		}
		
	}
	
}

/*Darren thanks for the feedback, I didnt even notice that until you pointed it out, 
thanks for the guidance I really appreciate it. I hope I got right this time */
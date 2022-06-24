public class FishTank
{
	public static void main(String[] args)
	{
		int noOfFishInTank = 4;
		
		switch (noOfFishInTank)
		{
			case 0:
			 System.out.println("There are no fish in the tank");
			 break;
			case 1:
			 System.out.println("There is one fish in the tank");
			 break;
			case 2:
			 System.out.println("There are two fish in the tank");
			 break;
			case 3:
			 System.out.println("There are three fish in the tank");
			 break;
			default:
			 System.out.println("An indeterminate number of fish are in the tank");
			 break;
		}
	}
}
		
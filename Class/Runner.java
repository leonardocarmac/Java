public class Runner
{
	public static void main(String[] args)
	{
		byte noOfMilesCovered = 25;
		
		switch (noOfMilesCovered)
		{
			case 5: case 10: case 15: case 20: case 25:
				System.out.println("Water is available at this mark");
				break;
			default:
				System.out.println("No water is available at this mark");
				
		}
	}
}
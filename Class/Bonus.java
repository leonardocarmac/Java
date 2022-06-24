public class Bonus
{
	public static void main(String[] args)
	{
		boolean bonus = false;
		int itemsSold = 1000;
		int yearsService = 20;
		int salesYear = 10_000;
		
		if (itemsSold >= 1000 && yearsService >= 20 && salesYear >= 10_000)
		{
			bonus=true;
			System.out.println("Bonus granted");
		}
		else
		{
			bonus=false;
			System.out.println("Bonus not granted");
		}
	}
}
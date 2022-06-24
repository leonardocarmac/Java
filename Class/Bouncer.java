public class Bouncer
{
	public static void main(String[] args)
	{
		byte patronAge = 18;
		boolean isPatronSober = true;
		
		if (patronAge>=18 && isPatronSober==true)
		{	
			System.out.println("Patron entrance has been granted");
		}
		else
		{
			System.out.println("Patron entrace not granted");
		}
	}
}
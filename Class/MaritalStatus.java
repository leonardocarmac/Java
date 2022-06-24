public class MaritalStatus
{
	public static void main(String[] args)
	{
		char status = 'F';
		
		switch (status)
		{
			case 'S':
				System.out.println("Status: Single");
				break;
			case 'D':
				System.out.println("Status: Divorced");
				break;
			case 'M':
				System.out.println("Status: Married");
				break;
			case 'W':
				System.out.println("Status: Widowed");
				break;
			default:
				System.out.println("Invalid data");
				
			
		}
	}
}
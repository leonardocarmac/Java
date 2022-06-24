public class Withdraw
{
	public static void main(String[] args)
	{
		float amount = 20f;
		float balance = 180f;
		String withdraw = (amount > balance) ? "Insufficient funds" : "Withdraw approved";
		
		System.out.println(withdraw);
	}
}
		
		
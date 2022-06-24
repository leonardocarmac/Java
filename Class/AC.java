public class AC
{
	public static void main(String[] args)
	{
		float temp = -10f;
		
		if (temp>=20){
			System.out.println("Tropical");
		} else if (temp>=10) {
			System.out.println("Warm");
		} else if (temp>=0) {
			System.out.println("Moderate");
		} else if (temp>=-4) {
			System.out.println("Cold");
		} else {
			System.out.println("Artic");
		}
	}
}
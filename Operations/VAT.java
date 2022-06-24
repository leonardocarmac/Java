public class VAT
{
	public static void main(String[] args)
	{
		float priceBefVat = 14.50f;
		float vat = priceBefVat*0.23f;
		float totalPrice = priceBefVat + vat;
		
		System.out.printf("The price before VAT was: %.2f \n",priceBefVat);
		System.out.printf("VAT = %.2f \n" , vat);
		System.out.printf("Total price: %.2f", totalPrice);
	}
}
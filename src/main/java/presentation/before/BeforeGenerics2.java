package presentation.before;

public class BeforeGenerics2
{
	public static void main(String[] args)
	{
		Product laptop = new Product("P01", "Laptop");

		String laptopId = (String) laptop.getId();
		String laptopName = (String) laptop.getName();

		System.out.println("Product id : " + laptopId);
		System.out.println("Product Name : " + laptopName);


		Product Charger = new Product(101, "Charger");

		Integer chargerId = (Integer) Charger.getId();
		String chargerName = (String) Charger.getName();

		System.out.println("Product id : " + chargerId);
		System.out.println("Product Name : " + chargerName);
	}
}

public class Bike
{
	static String bikeName;
	static int price;
	static float rating;
	static int numberOfColors;
	static String weight;
	
	public static void main(String[] args)
	{
		bikeName = "Royal Enfield";
		price = 250000;
		rating = 5.0f;
		numberOfColors = 4;
		weight = "175Kg";
		
		System.out.println("The Bike Name is:"+Bike.bikeName);
		System.out.println("The Bike Price is:"+Bike.price);
		System.out.println("The Bike Rating is:"+Bike.rating);
		System.out.println("The Number Of Colors are:"+Bike.numberOfColors);
		System.out.println("The Bike Weight is:"+Bike.weight);
	}

}
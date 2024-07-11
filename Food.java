public class Food 
{
	public static void item(String[] foodItemName,int[] quantity)
	{
		System.out.println("Displaying FoodItems ,Quantity ,TotalPrice");
		int price=10;
		for(int i=0;i<foodItemName.length;i++)
		{
			int TotalPrice = quantity[i] * price;
			System.out.println("Item name is:"+foodItemName[i]+","+"Quantity:"+quantity[i]+","+"Price:"+TotalPrice);
		}
	}
	
	public static void main(String[] args)
	{
		String[] foodItemName = {
            "Biryani", "Masala Dosa", "Paneer Butter Masala", "Idly vada",
            "Bisi Bele Bath", "Pav Bhaji", "Aloo Paratha", "Samosa",
            "Vada Pav", "Pani Puri", "Puri", "Gulab Jamun",
            "Tandoori Chicken", "Momos", "Kachori", "Seva Puri",
            "Palak Paneer", "Fride Rice", "Tomato Bath", "Jalebi"};

        int[] quantity = {2, 3, 1, 4, 2, 3, 2, 5, 4, 3,2, 3, 1, 2, 3, 4, 2, 3, 1, 4};
		
		item(foodItemName,quantity);
	}
} 
			
		
  
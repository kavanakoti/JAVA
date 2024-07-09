public class BookMyShow
{
	public static void movie()
	{
		String theaterName = "Inox";
		System.out.println("theaterName is:"+theaterName);
	}
	
	public static void movie(String movieName, int price)
	{
		System.out.println("movie name is:"+movieName+"   "+"movie price is:"+price);
	}

    public static String movie(float ratings)
	{
		System.out.println("movie ratings are:"+ratings);
		return "method end";
	}
	
	public static String movie(String Languages[])
	{
		for( int i=0;i < Languages.length; i++)
		System.out.println("Languages are:"+Languages[i]);
		return "method end";
	}
}
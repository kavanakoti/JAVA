public class Nammayatri
{
	public static void cab()
	{
		String driverName = "shivaraj";
		System.out.println("driverName is:"+driverName);
	}
	
	public static void cab(String Location, int time)
	{
		System.out.println("current location is:"+Location+"   "+"Time is:"+time);
	}

    public static String cab(String destination)
	{
		System.out.println("my destination is:"+destination);
		return "method end";
	}
	
	public static String cab(String cabtype[])
	{
		for( int i=0; i< cabtype.length; i++)
		System.out.println("cab type is :"+cabtype[i]);
		return "method end";
	}
}
public class Speakify
{
	public static void skill()
	{
		String userName = "Kavana";
		System.out.println("userName is:"+userName);
	}
	
	public static void skill(String guideName, int duration)
	{
		System.out.println("guide name is:"+guideName+"   "+"class duration is:"+duration);
	}

    public static String skill(float rating)
	{
		System.out.println("app rating is:"+rating);
		return "method end";
	}
	
	public static String skill(String Languages[])
	{
		for( int i=0; i< Languages.length; i++)
		System.out.println("Languages are:"+Languages[i]);
		return "method end";
	}
}
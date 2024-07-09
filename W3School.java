public class W3School
{
	public static void type()
	{
		String skillName = "JAVA";
		System.out.println("skillName is:"+skillName);
	}
	
	public static void type(String topicName, int types)
	{
		System.out.println("topic name is:"+topicName+"   "+"methods types are:"+types);
	}

    public static String type(float ratings)
	{
		System.out.println("app ratings are:"+ratings);
		return "method end";
	}
	
	public static String type(String Languages[])
	{
		for( int i=0;i < Languages.length; i++)
		System.out.println("Languages are:"+Languages[i]);
		return "method end";
	}
}
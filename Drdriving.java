public class Drdriving
{
	public static void game()
	{
		String playerName = "prajwal";
		System.out.println("playerName is:"+playerName);
	}
	
	public static void game(String carName, int carNo)
	{
		System.out.println("car name is:"+carName+"   "+"car number is:"+carNo);
	}

    public static String game(float rating)
	{
		System.out.println("app rating is:"+rating);
		return "method end";
	}
	
	public static String game(String gameType[])
	{
		for( int i=0; i< gameType.length; i++)
		System.out.println("gameType is:"+gameType[i]);
		return "method end";
	}
}
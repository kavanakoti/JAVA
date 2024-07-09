public class HiTv
{
	public static void series()
	{
		String seriesName = "Truebeauty";
		System.out.println("seriesName is:"+seriesName);
	}
	
	public static void series(String LeadName, int LeadNo)
	{
		System.out.println("Lead name is:"+LeadName+"   "+"LeadNo is:"+LeadNo);
	}

    public static String series(float ratings)
	{
		System.out.println("series ratings are:"+ratings);
		return "method end";
	}
	
	public static String series(String Languages[])
	{
		for( int i=0;i < Languages.length; i++)
		System.out.println("Languages are:"+Languages[i]);
		return "method end";
	}
}
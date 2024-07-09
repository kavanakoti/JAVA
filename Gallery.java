public class Gallery
{
	public static void photo()
	{
		String folderName = "favorites";
		System.out.println("folderName is:"+folderName);
	}
	
	public static void photo(String gallerytype, int totalfolders)
	{
		System.out.println("gallery type is:"+gallerytype+"   "+"total folders are:"+totalfolders);
	}

    public static String photo(float ratings)
	{
		System.out.println("app ratings are:"+ratings);
		return "method end";
	}
	
	public static String photo(String lockedgalleries[])
	{
		for( int i=0;i < lockedgalleries.length; i++)
		System.out.println("lockedgalleries are:"+lockedgalleries[i]);
		return "method end";
	}
}
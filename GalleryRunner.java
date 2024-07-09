public class GalleryRunner
{
	public static void main(String args[])
	{
		Gallery.photo();
		Gallery.photo("google photos",16);
		Gallery.photo(4.5f);
		String lockedgalleries[] = {"friends","internship","ambasoftware"};
		Gallery.photo(lockedgalleries);
	}
}
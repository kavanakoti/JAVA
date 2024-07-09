public class BookMyShowRunner
{
	public static void main(String args[])
	{
		BookMyShow.movie();
		BookMyShow.movie("Kalki",240);
		BookMyShow.movie(4.5f);
		String Languages[] = {"Kannada","Hindi","Telagu"};
		BookMyShow.movie(Languages);
	}
}
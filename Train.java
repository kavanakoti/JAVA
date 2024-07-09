public class Train
{
	public static void main(String args[])
	{
		int gadag = 520;
		int gokak = 500;
		int chitradurga = 400;
		int kolar = 180;
		int bengalur = 300;
		int mysore = 20;
		int hampi = 50;
		int shimoga = 200;
		int hubli = 150;
		int hospet = 100;

		int trainprice = gadag + mysore + hubli;
		if(trainprice>600)
		{
			System.out.println("The Bijapur price is:"+trainprice);
		}
	}
}
public class DrdrivingRunner
{
	public static void main(String args[])
	{
		Drdriving.game();
		Drdriving.game("Ferrari",2020);
		Drdriving.game(4.5f);
		String gameType[] = {"Lane","Highway"};
		Drdriving.game(gameType);
	}
}
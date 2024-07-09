public class SpeakifyRunner
{
	public static void main(String args[])
	{
		Speakify.skill();
		Speakify.skill("Vinoda",20);
		Speakify.skill(4.5f);
		String Languages[] = {"English","Hindi","Telagu"};
		Speakify.skill(Languages);
	}
}
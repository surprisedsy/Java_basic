package java1.Day4.practice;

public class MusicPhone extends Phone {
	
	public void execute(String function)
	{
		if(function.equals("����"))
		{
			playMusic();
			return;
		}
		
		super.execute(function);
	}
	
	private void playMusic()
	{
		System.out.println("MP3 player���� �������");
	}
}

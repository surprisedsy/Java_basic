package java1.Day4.practice;

public class MusicPhone extends Phone {
	
	public void execute(String function)
	{
		if(function.equals("À½¾Ç"))
		{
			playMusic();
			return;
		}
		
		super.execute(function);
	}
	
	private void playMusic()
	{
		System.out.println("MP3 player¿¡¼­ À½¾ÇÀç»ý");
	}
}

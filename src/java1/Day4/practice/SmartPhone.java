package java1.Day4.practice;

public class SmartPhone extends MusicPhone {
	
	public void execute(String function)
	{
		if(function.equals("À½¾Ç"))
		{
			playMusic();
			return;
		}
		if(function.equals("ÅëÈ­"))
		{
			super.execute(function);
			return;
		}
			
		if(function.equals("¾Û"))	
		{
			playApp();
			return;
		}
	}
	
	private void playMusic()
	{
		System.out.println("´Ù¿î·Îµå ÇØ¼­ À½¾ÇÀç»ý");
	}
	
	private void playApp()
	{
		System.out.println("¾Û ½ÇÇà");
	}
	
}

package java1.Day4.practice;

public class SmartPhone extends MusicPhone {
	
	public void execute(String function)
	{
		if(function.equals("����"))
		{
			playMusic();
			return;
		}
		if(function.equals("��ȭ"))
		{
			super.execute(function);
			return;
		}
			
		if(function.equals("��"))	
		{
			playApp();
			return;
		}
	}
	
	private void playMusic()
	{
		System.out.println("�ٿ�ε� �ؼ� �������");
	}
	
	private void playApp()
	{
		System.out.println("�� ����");
	}
	
}

package java1.Day3.practice;

public class MyBase extends Base {
	
	public void service(String state)
	{
		if(state.equals("��"))
			day();
		else if (state.equals("��"))
			night();
		else
			afternoon();
	}
	
	public void day()
	{
		System.out.println("������ ������ ������!");
	}
	
	public void afternoon()
	{
		System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�.");
	}
}

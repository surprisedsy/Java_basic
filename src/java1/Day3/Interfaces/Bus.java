package java1.Day3.Interfaces;

public class Bus extends Car implements ICarUsable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("������ useAccel �Լ��Դϴ�.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("������ useBreak �Լ��Դϴ�.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("������ doHandling �Լ��Դϴ�.");
	}

}

package java1.Day3.Interfaces;

public class SportsCar extends Car implements ICarUsable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("������ī�� useAccel �Լ��Դϴ�.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("������ī�� useBreak �Լ��Դϴ�.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("������ī�� doHandling �Լ��Դϴ�.");
	}

}

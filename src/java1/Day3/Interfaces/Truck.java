package java1.Day3.Interfaces;

public class Truck extends Car implements ICarUsable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� useAccel �Լ��Դϴ�.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� useBreak �Լ��Դϴ�.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� doHandling �Լ��Դϴ�.");
	}

}

package java1.Day3.Interfaces;

public class Bus extends Car implements ICarUsable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("버스의 useAccel 함수입니다.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("버스의 useBreak 함수입니다.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("버스의 doHandling 함수입니다.");
	}

}

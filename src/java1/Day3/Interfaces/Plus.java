package java1.Day3.Interfaces;

public class Plus extends Calculation implements IMakerable {
	
	@Override
	public void makeResult() {
		// TODO Auto-generated method stub
		result = a + b;
	}
	
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println(a + " + " + b + " = " + result);
	}

}

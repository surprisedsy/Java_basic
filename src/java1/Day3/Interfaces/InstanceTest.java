package java1.Day3.Interfaces;

public class InstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation c = new Plus();
		
		System.out.println(c instanceof Plus);
		System.out.println(c instanceof IMakerable);
		System.out.println(c instanceof Minus);
		System.out.println(c instanceof Calculation);
	}

}

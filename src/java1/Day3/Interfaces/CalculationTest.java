package java1.Day3.Interfaces;

public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Plus plus = new Plus();
		plus.setData(27, 32);
//		plus.makeResult();
//		plus.answer();
				
		Calculation c = plus;
		IMakerable im = plus;
		im.makeResult();
		c.answer();
		
		
		Minus minus = new Minus();
		minus.setData(16, 5);
		//minus.answer();
		
		Calculation cl = minus;
		IMakerable imk = minus;
		imk.makeResult();
		cl.answer();
	}

}

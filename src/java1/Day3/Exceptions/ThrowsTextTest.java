package java1.Day3.Exceptions;

import java.io.IOException;

public class ThrowsTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsText throwsText = new ThrowsText();
				
			try {
				throwsText.suspiciousMethod();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

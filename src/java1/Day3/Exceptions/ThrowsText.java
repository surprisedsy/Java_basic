package java1.Day3.Exceptions;

import java.io.IOException;

public class ThrowsText {
	
	
	public void suspiciousMethod() throws MyException
	{
		System.out.println("���� �߻� ��");
		
		//throw new IOException();
		throw new MyException("error!!!!!!!!!!!");
		
		//System.out.println("���� �߻� ��");
	}
}

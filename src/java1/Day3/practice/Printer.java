package java1.Day3.practice;

public class Printer {
	
	int i = 0;
	boolean p = true;
	double d = 0;
	String name = "";
	
	void println(int i)
	{
		this.i = i;
		System.out.println(i);
	}
	
	void println(boolean p)
	{
		this.p = p;
		System.out.println(p);
	}
	
	void println(double d)
	{
		this.d = d;
		System.out.println(d);
	}
	
	void println(String name)
	{
		this.name = name;
		System.out.println(name);
	}
	
	
	
}

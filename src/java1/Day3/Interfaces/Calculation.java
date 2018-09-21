package java1.Day3.Interfaces;

public abstract class Calculation {

	int a;
	int b;
	int result;

	public abstract void answer();

	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

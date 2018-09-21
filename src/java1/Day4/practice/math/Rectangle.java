package java1.Day4.practice.math;

public class Rectangle extends Shape implements IResizable {

	double ss = IResizable.s;
	
	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		double result = (this.width * this.height) * ss;
		return result;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		
		double result = (this.width + this.height) * 2 * ss;
		return result;
	}

}

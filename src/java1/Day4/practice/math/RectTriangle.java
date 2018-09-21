package java1.Day4.practice.math;

public class RectTriangle extends Shape {
		
	public RectTriangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double Arearesult = (this.width * this.height * 0.5);
		return Arearesult;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		
		double wid = Math.pow(width, 2);
		double heig = Math.pow(height, 2);
				
		double Periresult = this.width + this.height + (Math.sqrt(wid + heig));
		return Periresult;
	}

}

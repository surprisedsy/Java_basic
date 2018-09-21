package java1.Day4.practice.math;

public abstract class Shape {
	
	double width;
	double height;
		
	public Shape(double width, double height) {
		
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}

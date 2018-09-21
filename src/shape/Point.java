package shape;

public class Point {
	
	int x = 0;
	int y = 0;
	String color = "";
	

	public Point(int x) {
		super();
		this.x = x;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public void Show()
	{
		System.out.println("�� [x = " + x + ", y = " + y + "] �� �׷Ƚ��ϴ�.");
	}
	
	
	public void Show(boolean visible)
	{
		if(visible)
		{
			System.out.println("�� [x = " + x + ", y = " + y + "] �� �׷Ƚ��ϴ�.");
		}
		else
		{
			System.out.println("�� [x = " + x + ", y = " + y + "] �� �������ϴ�.");
		}
	}

}

package shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Point p1 = new Point(2, 3);
		p1.Show(true);
		p1.setX(10);
		p1.setY(23);
		p1.Show(false);*/

		
		Shape s1 = new Rect();
		Shape s2 = new Tri();
		Rect r1 = new Rect();
		Tri t1 = new Tri();
		
		//Rect r3 = (Rect) new Shape();		// �θ� Ŭ������ �ڽ� Ŭ������ ���� Ÿ�� ĳ����(Ÿ�� ��ȯ) �ȵ�.
		
		Shape s3 = new Rect();
		Rect r2 = (Rect) s3;		// ���� ����ó�� �ٷδ� �ȵ����� �ι� ��ȯ��Ű�� �ȴ�.
		
		System.out.println(s1.x);	// shape �� int x �� ��
		System.out.println(r1.x);	// rect�� int x �� ��
		//System.out.println(s1.name);	shape�� �θ� Ŭ���� �� name�� ����
		System.out.println(r1.name);	// rect�� name ���� ������
		System.out.println(r2.x);  
		
		Circle c1 = new Circle();
		ShapeDraw draw = new ShapeDraw();
		
		draw.drawShapeRect(r1);
		draw.drawShapeTri(t1);
		draw.drawShapeCircle(c1);
		
		draw.drawShape(s1);
		draw.drawShape(s2);	// ������ ó�� �ϳ��� �θ� �ʿ� ���� �������̵� �� �Լ��� ���.
		
		draw.drawShape(s3);	// �ι� ��ȯ��Ų �� ���. ��ȯ �Ǽ� ���� �ȳ�!!
		
	}

}

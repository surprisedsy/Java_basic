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
		
		//Rect r3 = (Rect) new Shape();		// 부모 클래스가 자식 클래스에 직접 타입 캐스팅(타입 변환) 안됨.
		
		Shape s3 = new Rect();
		Rect r2 = (Rect) s3;		// 위에 쓴것처럼 바로는 안되지만 두번 변환시키면 된당.
		
		System.out.println(s1.x);	// shape 의 int x 로 들어감
		System.out.println(r1.x);	// rect의 int x 로 들어감
		//System.out.println(s1.name);	shape는 부모 클래스 라서 name이 없음
		System.out.println(r1.name);	// rect에 name 설정 되있음
		System.out.println(r2.x);  
		
		Circle c1 = new Circle();
		ShapeDraw draw = new ShapeDraw();
		
		draw.drawShapeRect(r1);
		draw.drawShapeTri(t1);
		draw.drawShapeCircle(c1);
		
		draw.drawShape(s1);
		draw.drawShape(s2);	// 위에것 처럼 하나씩 부를 필요 없이 오버라이딩 된 함수를 사용.
		
		draw.drawShape(s3);	// 두번 변환시킨 후 결과. 변환 되서 오류 안남!!
		
	}

}

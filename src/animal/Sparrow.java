package animal;

public class Sparrow extends Bird {
	
	String name = "±±";
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		setName(this.name);
		System.out.println("����" + "(" + getName() + ")�� ���ƴٴմϴ�." );
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

		System.out.println("����" + "(" + getName() + ")�� �Ҹ����� ��ϴ�." );
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		System.out.println("������ �̸��� " + getName() + "�Դϴ�.");
		return this.name;
	}

}

package animal;

public class Duck extends Bird {
	
	String name = "�в���";
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		setName(this.name);
		System.out.println("����" + "(" + getName() + ")�� ���� �ʽ��ϴ�." );
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

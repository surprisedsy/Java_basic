package java1.Day3.Interfaces;

public class DriveCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriveCar dc = new DriveCar();
		
		Truck truck = new Truck();
		Bus bus = new Bus();
		SportsCar sc = new SportsCar();
		
		
		//ICarUsable itruck = new Truck();
		ICarUsable itruck = (ICarUsable) truck;	// ��------��------������ upcasting�� �����ذ�.
		dc.doDriveCar(itruck);
				
		
		//dc.doDriveCar((ICarUsable)sc);		//���� �����δ� ����ó�� ���ų� �̷��� ��. ����ȯ�� ��Ȯ�ϰ� ����-������ ����.
		
		/*dc.doDriveCar(bus);  // �Ϲ������� upcasting��
		dc.doDriveCar(truck);
		dc.doDriveCar(sc);*/
				
		/*
		dc.doDriveCarTruck(truck);
		dc.doDriveCarBus(bus);
		*/
	}

}

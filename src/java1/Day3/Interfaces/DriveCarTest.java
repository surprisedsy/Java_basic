package java1.Day3.Interfaces;

public class DriveCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriveCar dc = new DriveCar();
		
		Truck truck = new Truck();
		Bus bus = new Bus();
		SportsCar sc = new SportsCar();
		
		
		//ICarUsable itruck = new Truck();
		ICarUsable itruck = (ICarUsable) truck;	// 명------시------적으로 upcasting을 시켜준것.
		dc.doDriveCar(itruck);
				
		
		//dc.doDriveCar((ICarUsable)sc);		//보통 실제로는 위에처럼 쓰거나 이렇게 씀. 형변환도 명확하고 유지-보수에 좋음.
		
		/*dc.doDriveCar(bus);  // 암묵적으로 upcasting됨
		dc.doDriveCar(truck);
		dc.doDriveCar(sc);*/
				
		/*
		dc.doDriveCarTruck(truck);
		dc.doDriveCarBus(bus);
		*/
	}

}

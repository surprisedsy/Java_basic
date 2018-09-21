package java1.Day3.Interfaces;

public class DriveCar {
	
	// bus moving method
	public void doDriveCarBus(Bus bus)
	{
		bus.doHandling();
		bus.useAccel();
		bus.useBreak();
	}
	
	// truck moving method
	public void doDriveCarTruck(Truck truck)
	{
		truck.doHandling();
		truck.useAccel();
		truck.useBreak();
	}
	
	// sportscar moving method	
	public void doDriveCarSportsCar(SportsCar sc)
	{
		sc.doHandling();
		sc.useAccel();
		sc.useBreak();
	}
	
	public void doDriveCar(ICarUsable icu)
	{
		icu.doHandling();
		icu.useAccel();
		icu.useBreak();
	}

}

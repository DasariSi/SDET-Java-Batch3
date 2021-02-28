package inheritance;

public class Car extends Vehicle {

	int numOfSeats=4;
	
	
	/**
	 * Default constructor is automatically called but for calling parametrised
	 * constructor of Parent class mention super() keyword in child class constructor first statement
	 */
	public Car()
	{
		super(10);
		System.out.println("Car class Constructor");
		
	}
	
	public void getVehicleSeats()
	{
		System.out.println("Number of seats in car is "+numOfSeats);
	}
	
	public static void main(String[] args) {

	Car obj = new Car();
	
	obj.start();
	obj.getVehicleSeats();
	obj.stop();
		
	
	Vehicle obj1 = new Vehicle(10);
	obj1.start();
	obj1.getVehicleSeats();
	obj1.stop();
	
	//Bike obj2 = new Vehicle();
	Vehicle obj3 = new Bike();
	obj3.start();
	obj3.getVehicleSeats();

	
	
	}

}

package inheritance;

public class Bike extends Vehicle{

	
	public void getVehicleSeats()
	{
		System.out.println("Number of seats in Bike is 1");
	}
	
	
	public static void main(String[] args) {

		Bike obj = new Bike();
		obj.start();
		//System.out.println(obj.numOfSeats);
		obj.getVehicleSeats();
		
		
		
	}

}

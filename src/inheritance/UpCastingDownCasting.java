package inheritance;

public class UpCastingDownCasting {

	public static void main(String[] args) {
		
		
		//UpCasting is child class cast to parent class
		
		Bike objBike = new Bike();
		Vehicle vobj = objBike; // upcasting allowed since bike is subclass of vehicle 
		vobj.start();
		vobj.stop();
		vobj.getVehicleSeats();
		
		
		//Car vcar = objBike;//Casting not possible as bike is not instance of Car
		
		
		//DOwncasting is parent class cast to child class
		Bike bobj = (Bike)vobj; //downcasting
		bobj.getVehicleSeats();
		bobj.start();
		bobj.stop();

		
	
	}
	

}

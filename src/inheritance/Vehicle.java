package inheritance;


/**
 * Parent Class
 * @author YOGESH RANA
 *
 */
public class Vehicle {

	public Vehicle()
	{
		System.out.println("Vehicle class Constructor");
	}
	
	public Vehicle(int x)
	{
		System.out.println("Parametrised Constructor of Vehicle CLass");
	}
	
	public void start()
	{
		System.out.println("Vehicle Engine Starts");
	}
	
	public void stop()
	{
		System.out.println("Vehicle Engine Stops");
	}
	
	public void getVehicleSeats()
	{
		System.out.println("vehicle seats can vary from 1 to 5");
	}
	

	
}

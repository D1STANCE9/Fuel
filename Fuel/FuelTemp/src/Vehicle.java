import javax.swing.JOptionPane;

public class Vehicle {
	private static double eightySeven = 3.45;
	private static double eightyNine = 3.77;
	private static double ninetyThree = 4.16;
	private static double diesel = 4.18;
	
	//constructor
	private String vehicleName;
	private double mpg;
	private double tankSize;
	private double fuelType;
	
	
	public Vehicle(String name, double milesPerGallon, double size, double type) {
		vehicleName=name;
		mpg=milesPerGallon;
		tankSize=size;
		fuelType=type;
	}
	
	public int trip(double distance) {
		
	}
}


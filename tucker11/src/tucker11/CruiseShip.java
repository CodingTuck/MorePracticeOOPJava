package tucker11;
//Mitchell Tucker SPC ID#2429488
//class that inherits Ship class
public class CruiseShip extends Ship {
	//declare private fields
	private int passengers;
	private String zone;
	
	//declare public method with 5 parameters
	public CruiseShip(String name, int year, boolean isAfloat, int shipPassengers, String shipZone) {
		//referencing parent class parameters
		super(name, year, isAfloat);
		//initialize private fields with parameters
		this.passengers = shipPassengers;
		this.zone = shipZone;
	}
	//getter
	public int getPassengers() {
		return passengers;
	}
	//getter
	public String getZone() {
		return zone;
	}
	//getter that displays superclass parameters with cruiseship private fields
	public String toString() {
		return super.toString() +"\n" + this.passengers + " passenger capacity, operating in the " + 
	this.zone;
	}
		
	
}

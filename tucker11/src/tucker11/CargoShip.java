package tucker11;
//Mitchell Tucker SPC ID#2429488
//class that inherits Ship class
public class CargoShip extends Ship {
	//declare private fields
	private String cargo;
	private int capacity;
	//public class method with 5 parameters
	public CargoShip(String name, int year, boolean isAfloat, String shipCargo, int shipCapacity) {
		//referencing parent class parameters
		super(name, year, isAfloat);
		this.cargo = shipCargo;
		this.capacity = shipCapacity;
	}
	//getter that returns super parameters with filled cargoship class parameters
	public String toString() {
		return super.toString() + "\n" + "Capacity of " + this.cargo + " is " + this.capacity;
	}
	//getter
	public int getCapacity() {
		return capacity;
	}
}

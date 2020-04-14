package tucker11;
//Mitchell Tucker SPC ID#2429488
//class that inherits Ship class
public class WarShip extends Ship {
	//declare private fields
	private String type;
	private String nation;
	//declare public class method with 5 parameters
	public WarShip(String name, int year, boolean isAfloat, String shipType, String shipNation) {
		//referencing super class parameters
		super(name, year, isAfloat);
		//initializes private fields with added parameters
		this.type = shipType;
		this.nation = shipNation;
	}
	//getter that displays super class parameters with warship parameters
	public String toString() {
		return super.toString() + "\n" + "Type: " + this.type + " operated by " + this.nation;
	}
}

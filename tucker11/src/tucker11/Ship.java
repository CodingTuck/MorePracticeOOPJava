package tucker11;

public class Ship {
//Mitchell Tucker SPC ID#2429488
	
	//declare fields
	private String name;
	private int year;
	private boolean isAfloat;


	//public method Ship
	public Ship(String shipName, int shipYear, boolean shipIsAfloat) {
		//calls the private fields and initializes them with the parameters of Ship method
		this.name = shipName;
		this.year = shipYear;
		this.isAfloat = shipIsAfloat;
	}
	
	//getter
	public boolean isAfloat() {
		return isAfloat;
	}
	//setter
	public void setAfloat(boolean shipIsAfloat) {
		this.isAfloat = shipIsAfloat;
	}
	//getter
	public String getName() {
		return name;
	}
	//getter
	public int getYear() {
		return year;
	}
	//getter: displays the parameters with their filled fields
	public String toString() {
		return "Ship Name: " + name + ", year launched: " + year + ", is afloat: " + isAfloat;
	}
}
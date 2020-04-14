package tucker11;
//Mitchell Tucker SPC ID# 2429488
import java.util.Arrays;
import java.util.ArrayList;

//test class
public class ShipTest {

	public static void main(String[] args) {
		//declare objects
		Ship cruiseShip1 = new CruiseShip("Magic", 1998, true, 2700, "Caribbean");
		Ship cruiseShip2 = new CruiseShip("Titanic", 1912, false, 1300, "Atlantic Ocean");
		Ship cargoShip1 = new CargoShip("El Faro", 1974, false, "containers", 391);
		Ship cargoShip2 = new CargoShip("Seawise Giant", 1979, false, "crude oil", 564763);
		WarShip warShip1 = new WarShip("USS Nimitz", 1972, true, "Super Carrier", "United States Navy");
		
		
		//array initializer holding class arrays
		Ship[] fleet = {cruiseShip1, cruiseShip2, cargoShip1, cargoShip2, warShip1};
		System.out.println("AN ARRAY OF SHIPS IN MAIN");
		//for loop going through the array of classes
		for(int count = 0; count < fleet.length; count++) {
			System.out.println(fleet[count].toString());
		}
		//declare arraylist of Ship from the fleet array of classes
		ArrayList<Ship> showFleet = new ArrayList<Ship>(Arrays.asList(fleet));
		
		System.out.println("ARRAYLIST OF SHIPS FROM A METHOD");
		//declares shipcount with the shipShow method and holds the arraylist
		int shipCount = shipShow(showFleet);
		//outputs the number of ships sank
		System.out.println(shipCount + " of these ships sank!");
		
	}
		//method that returns an int of number of ships sank
		public static int shipShow(ArrayList<Ship>showFleet) {
			int notAfloat = 0;
			//for loop that deletes one of the cargoships if it isn't afloat
			for(int i = 0; i < showFleet.size(); i++) {
				Ship deleteShip = showFleet.get(i);
				if(deleteShip instanceof CargoShip) {
					showFleet.remove(i);
				}
				
			}
			//creates an object that adds another warship instance in the arraylist.
			WarShip newShip = new WarShip("USS John Warner", 2015, true, "attack submarine", "United States Navy");
			showFleet.add(newShip);
			//foreach that iterates through the arraylist and prints data for each ship
			for (Ship deleteShip: showFleet) {
				System.out.println(deleteShip.toString());
				//counts the number of ships that are not afloat and returns it to the main.
				if(deleteShip.isAfloat() == false) {
					notAfloat++;
				}
		}
		return notAfloat;
		
	}

}

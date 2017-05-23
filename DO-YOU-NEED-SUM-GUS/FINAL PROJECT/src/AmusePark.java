
import java.util.ArrayList;

public class AmusePark {

	public static void main(String[] args) {
		ArrayList<Rides> listI = new ArrayList<Rides>();
		GAS gasI = new GAS("Tutti", 25000, "GAS", "overcast", 100);
		listI.add(gasI);
		Gravitron gravI = new Gravitron("Alapotel", 20000, "SpaceFlight", 70.3, 50, 10);
		listI.add(gravI);
		HauntedHouse hhI = new HauntedHouse("Nanona", 30000, "Haunted House", 30, 20, 10);
		listI.add(hhI);
		Comet cometI = new Comet("Floofla", 19600, "Comet", 1001, 5, 10);
		listI.add(cometI);
		FerrisWheel fwI = new FerrisWheel("Ehnanoona", 18700, "Wheel of Fun", 20, 25, 15);
		listI.add(fwI);
		
		System.out.println("GAS Information: ");
		System.out.println("Employee Name: " + gasI.getName() + 
				"  Employee Salary: " + gasI.getSalary());
		gasI.isSafe();
		gasI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Gravitron Information: ");
		System.out.println("Employee Name: " + gravI.getName() + 
				"  Employee Salary: " + gravI.getSalary());
		gravI.force();
		gravI.safeGs();
		gravI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Haunted House Information: ");
		System.out.println("Employee Name: " + hhI.getName() + 
				"  Employee Salary: " + hhI.getSalary());
		hhI.scary();
		if(hhI.popup()) {
			System.out.println("BOO!");
			hhI.playSound();
		}
		hhI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Comet Information: ");
		System.out.println("Employee Name: " + cometI.getName() + 
				"  Employee Salary: " + cometI.getSalary());
		cometI.scareRating();
		cometI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Ferris Wheel Information: ");
		System.out.println("Employee Name: " + fwI.getName() + 
				"  Employee Salary: " + fwI.getSalary());
		fwI.distance();
		fwI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Ride Names: ");
		for(int i = 0; i<listI.size(); i++) {
			System.out.print(listI.get(i).getRname() + ", ");
		}
	}
}

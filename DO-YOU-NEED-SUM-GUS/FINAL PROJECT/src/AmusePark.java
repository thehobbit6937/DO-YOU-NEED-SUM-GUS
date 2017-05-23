
import java.util.ArrayList;

public class AmusePark {

	public static void main(String[] args) {
		ArrayList<Rides> listI = new ArrayList<Rides>();
		GAS gasI = new GAS("Tutti", 25000, "overcast", 100, "GAS");
		listI.add(gasI);
		Gravitron gravI = new Gravitron("Alapotel", 20000, 70.3, 50, 10, "SpaceFlight");
		listI.add(gravI);
		HauntedHouse hhI = new HauntedHouse("Nanona", 30000, 30, 20, 10);
		listI.add(hhI);
		Comet cometI = new Comet(1001, 5, 10, "Comet");
		listI.add(cometI);
		FerrisWheel fwI = new FerrisWheel(20, 25, 15, "Wheel of Fun");
		listI.add(fwI);
		
		System.out.println("GAS Information: ");
		System.out.println("Employee Name: " + gasI.getName() + 
				"  Employee Salary: " + gasI.getSalary());
		gasI.printAttributes();
		gasI.isSafe();
		
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
		hhI.popup();
		hhI.scary();
		hhI.playSound();
		hhI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Comet Information: ");
		cometI.scareRating();
		cometI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Ferris Wheel Information: ");
		fwI.distance();
		fwI.printAttributes();
		


	}

}

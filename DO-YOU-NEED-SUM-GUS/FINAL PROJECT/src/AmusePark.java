
import java.util.ArrayList;

public class AmusePark {
	
	public String comma(double x) {
		ArrayList<String>let = new ArrayList<String>();
		String y = new Double(x).toString();
		for(int i = 0; i<x.length(); i++) 
			let.add(y.subtring(i, i+1));
		for(int k = let.size()-4; k>=0; k-=3) {
			if(let.get(k) == 0)
				let.add(k-1, ",")
		}		
	}

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
		Pharoah pI = new Pharoah("Mookalook", 30000, "Pendulum of Death", 30, 50, 5, 1000);
		listI.add(pI);
		FoodAndDrinks yum = new FoodAndDrinks();
		Shops stuff = new Shops();
		Ticket tI = new Ticket();
		People pplI = new People(5.7, 18);
		People pplII = new People(2.9, 5);
		Entry entry = new Entry();
		entry.setPop(50000);
		
		System.out.println("Ticket Purchase: ");
		System.out.println("Fast Pass Price: " + tI.getFPPrice());
		System.out.println("Regular Ticket Price: " + tI.getTixPrice());
		tI.buyTix();
		tI.getNumSold();
		
		System.out.println(" ");
		System.out.println("GAS Information: ");
		System.out.println("Employee Name: " + gasI.getName() + 
				"  Employee Salary: " + gasI.getSalary());
		gasI.isSafe();
		if(pplI.getAge() > gasI.getMinAge() && pplI.getHeight() > gasI.getMinHeight())
			System.out.println("Person 1 may ride this ride.");
		else
			System.out.println("Person 1 may not ride this ride.");
		gasI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Gravitron Information: ");
		System.out.println("Employee Name: " + gravI.getName() + 
				"  Employee Salary: " + gravI.getSalary());
		gravI.force();
		gravI.safeGs();
		if(pplII.getAge() > gravI.getMinAge() && pplII.getHeight() > gravI.getMinHeight())
			System.out.println("Person 2 may ride this ride.");
		else
			System.out.println("Person 2 may not ride this ride.");
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
		if(pplI.getAge() > hhI.getMinAge() && pplI.getHeight() > hhI.getMinHeight())
			System.out.println("Person 1 may ride this ride.");
		else
			System.out.println("Person 1 may not ride this ride.");
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
		if(pplII.getAge() > fwI.getMinAge() && pplII.getHeight() > fwI.getMinHeight())
			System.out.println("Person 2 may ride this ride.");
		else
			System.out.println("Person 2 may not ride this ride.");
		fwI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Ride Names: ");
		for(int i = 0; i<listI.size(); i++) {
			if(i == (listI.size()-1))      
				System.out.println(listI.get(i).getRname() + ".");
			else
				System.out.print(listI.get(i).getRname() + ", ");
		}
		
		System.out.println(" ");
		System.out.println("Pharoah Information: ");
		System.out.println("The position you are at is: " + pI.distance() + " m");
		pI.velocity();
		pI.acceleration();
		System.out.println("The total energy you have is: " + pI.energyT() + " J");
		System.out.println("The total kinetic energy at the position is: "
				+ pI.energyK() + " J");
		pI.energyP();
		if(pplI.getAge() > pI.getMinAge() && pplI.getHeight() > pI.getMinHeight())
			System.out.println("Person 1 may ride this ride.");
		else
			System.out.println("Person 1 may not ride this ride.");
		
		System.out.println(" ");
		System.out.println("Food Information: ");
		yum.HBCost();
		yum.HDCost();
		yum.WCost();
		yum.SCost();
		yum.total();
		
		System.out.println(" ");
		System.out.println("Shop Information: ");
		stuff.buyMerch();
		stuff.buyCup();
		stuff.buyPics();
		stuff.buyShirt();
		stuff.buySWP();
		stuff.total(stuff.getCupPrice(), stuff.getHoodPrice(), 
				stuff.getPicPrice(), stuff.getShirtPrice(), stuff.getSWPPrice());
		
		System.out.println(" ");
		System.out.println("Total Profits: ");
		double numFP = .2 * entry.getPop();
		double numReg = entry.getPop() - numFP;
		double spent = yum.totalCosts() + stuff.total(stuff.getCupPrice(), stuff.getHoodPrice(), 
				stuff.getPicPrice(), stuff.getShirtPrice(), stuff.getSWPPrice()) 
					+ stuff.getMerch();
		double profit = (spent * entry.getPop()) + (numFP * tI.getFPPrice()) + 
				(numReg * tI.getTixPrice());
		System.out.println("The total profit of the day is " + comma(profit));
		
		
	}
}

import java.util.ArrayList;

public class AmusePark {
	
	public static String comma(double x) {
		ArrayList<String>let = new ArrayList<String>();
		String n = "";
		String y = new Double(x).toString();
		for(int i = 0; i<y.length(); i++) 
			let.add(y.substring(i, i+1));
		for(int k = let.size()-4; k>=0; k-=3) {
			if(let.get(k).equals("0"))
				let.add(k-1, ",");
		}	
		for(int j = 0; j<let.size(); j++)
			n += let.get(j);
		return n;
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
		WaterSlide yes = new WaterSlide("Person", 56000, "Water Slide", 50, 1000);
		listI.add(yes);
		WaterPlayground we = new WaterPlayground("Bob", 20000, "Water Playground", 78, 3437, false);
		listI.add(we);
		Hurricane knights = new Hurricane("Mikel", 20000, "Hurricane", 9, 300);
		listI.add(knights);
		WavePool of = new WavePool("Man", 42000, "Wave Pool", 8, 5.7, 6.9, 15);
		listI.add(of);
		LogFlume NE = new LogFlume("Female", 634521, "Log Flume", 2, 234235);
		listI.add(NE);
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
		System.out.println("Ride Names: ");
		for(int i = 0; i<listI.size(); i++) {
			if(i == (listI.size()-1))      
				System.out.println(listI.get(i).getRname() + ".");
			else
				System.out.print(listI.get(i).getRname() + ", ");
		}
		
		System.out.println(" ");
		System.out.println("Indoor Ride Information: ");
		
		System.out.println(" ");
		System.out.println("GAS Information: ");
		
		System.out.println("Employee Name: " + gasI.getName() + 
				"  Employee Salary: " + comma(gasI.getSalary()));
		gasI.isSafe();
		if(pplI.getAge() > gasI.getMinAge() && pplI.getHeight() > gasI.getMinHeight())
			System.out.println("Person 1 may ride this ride.");
		else
			System.out.println("Person 1 may not ride this ride.");
		gasI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Gravitron Information: ");
		
		System.out.println("Employee Name: " + gravI.getName() + 
				"  Employee Salary: " + comma(gravI.getSalary()));
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
				"  Employee Salary: " + comma(hhI.getSalary()));
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
				"  Employee Salary: " + comma(cometI.getSalary()));
		cometI.scareRating();
		cometI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Ferris Wheel Information: ");
		System.out.println("Employee Name: " + fwI.getName() + 
				"  Employee Salary: " + comma(fwI.getSalary()));
		fwI.distance();
		if(pplII.getAge() > fwI.getMinAge() && pplII.getHeight() > fwI.getMinHeight())
			System.out.println("Person 2 may ride this ride.");
		else
			System.out.println("Person 2 may not ride this ride.");
		fwI.printAttributes();
		
		System.out.println(" ");
		System.out.println("Pharoah Information: ");
		System.out.println("Employee Name: " + pI.getName() + 
				"  Employee Salary: " + comma(pI.getSalary()));
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
		System.out.println("Outdoor Ride Information: ");
		
		System.out.println(" ");
		System.out.println("Water Slide Information: ");
		
		System.out.println("Employee Name: " + yes.getName() + 
				"  Employee Salary: " + comma(yes.getSalary()));
		yes.printSlide();
		
		
		System.out.println(" ");
		System.out.println("Water Playground Information: ");
		
		System.out.println("Employee Name: " + we.getName() + 
				"  Employee Salary: " + comma(we.getSalary()));
		we.fillTheBucket();
		we.pourTheBucket();
		System.out.print("\n");
		we.printPlay();
		
		System.out.println(" ");
		System.out.println("Hurricane Information: ");
		
		System.out.println("Employee Name: " + knights.getName() + 
				"  Employee Salary: " + comma(knights.getSalary()));
		knights.printDank();
		knights.changeDank(3);
		
		System.out.println(" ");
		System.out.println("Wave Pool Information: ");
		
		System.out.println("Employee Name: " + of.getName() + 
				"  Employee Salary: " + comma(of.getSalary()));
		of.decreaseHeight(4);
		of.increaseHeight(2);
		of.printWaves();
	
		System.out.println(" ");
		System.out.println("Log Flume Information: ");
		
		System.out.println("Employee Name: " + NE.getName() + 
				"  Employee Salary: " + (NE.getSalary()));
		NE.contractLog();
		NE.expandLog();
		NE.expandLog();
		NE.decreaseWaterFLow(245);
		NE.increaseWaterFlow(357);
		NE.printLogFlume();
		
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
		double util = 0;
		double spent = yum.totalCosts() + stuff.total(stuff.getCupPrice(), stuff.getHoodPrice(), 
				stuff.getPicPrice(), stuff.getShirtPrice(), stuff.getSWPPrice()) 
					+ stuff.getMerch();
		double profit = (spent * entry.getPop()) + (numFP * tI.getFPPrice()) + 
				(numReg * tI.getTixPrice());
		util = .1 * profit;
		System.out.println("The total profit of the day is " + comma(util));
		
		
	}
}

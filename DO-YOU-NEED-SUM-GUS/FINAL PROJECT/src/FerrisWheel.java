
public class FerrisWheel extends Rides {
	private int numCars;
	private int radius;
	private int rounds;
	
	public FerrisWheel() {
		super();
		numCars = 0;
		radius = 0;
		rounds = 0;
	}
	public FerrisWheel(String n, double sal, String rn, int c, int r, int ro) {
		super(n, sal, rn);
		numCars = c;
		radius = r;
		rounds = ro;
	}

	public void distance() {
		double circum = Math.PI * 2 * radius;
		double dist = circum * rounds;
		System.out.println("You have travelled  " + dist + "  meters on the Ferris Wheel.");
		System.out.println("There are  " + numCars + "  on the Wheel.");
	}
	
	public void printAttributes() {
		System.out.println("Number of Cars: " + numCars + "  Radius: " + radius + 
				"  Number of rounds: " + rounds);
	}
}

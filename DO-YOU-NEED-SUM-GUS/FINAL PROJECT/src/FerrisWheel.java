
public class FerrisWheel extends Rides {
	private int numCars;
	private int radius;
	private int rounds;
	private String rname;
	
	public FerrisWheel() {
		numCars = 0;
		radius = 0;
		rounds = 0;
		setRname("");
	}
	public FerrisWheel(int c, int r, int ro, String rn) {
		numCars = c;
		radius = r;
		rounds = ro;
		setRname(rn);
	}
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
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


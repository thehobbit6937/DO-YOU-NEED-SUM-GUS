
public class Comet extends Rides {
	private double height;
	private int numLoops;
	private int numTwists;
	
	public Comet() {
		super();
		height = 0;
		numLoops = 0;
		numTwists = 0;
	}
	
	public Comet(String n, double sal, String r, double h, int l, int t) {
		super(n, sal, r);
		height = h;
		numLoops = l;
		numTwists = t;
	}

	public void scareRating() {
		if (height > 1000 || numLoops > 3 || numTwists > 5) {
			System.out.println("This ride has a high scare rating!");
		}
		else
			System.out.println("This ride is easy to handle!");
		
	}
	public void printAttributes() {
		System.out.println("Height: " + height + "  Number of Loops: " + numLoops + 
				"  Number of Twists: " + numTwists);
	}
}

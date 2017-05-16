
public class HauntedHouse extends Rides {
	private int numGhosts;
	private int numBodies;
	private int numZombies;
	
	public HauntedHouse() {
		super();
		numGhosts = 0;
		numBodies = 0;
		numZombies = 0;
	}
	public HauntedHouse(String name, double salary, int g, int b, int z, int r) {
		super(name, salary);
		numGhosts = g;
		numBodies = b;
		numZombies = z;
	}
	
	public int scary() {
		return 0;
	}
}

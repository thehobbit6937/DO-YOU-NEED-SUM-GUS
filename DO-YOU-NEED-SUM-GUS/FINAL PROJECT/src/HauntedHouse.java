import java.util.Random;

public class HauntedHouse extends Rides {
	private int numGhosts;
	private int numBodies;
	private int numZombies;
	private String rname;
	
	public HauntedHouse() {
		super();
		numGhosts = 0;
		numBodies = 0;
		numZombies = 0;
		setRname("");
	}
	public HauntedHouse(String name, double salary, int g, int b, int z, String r) {
		super(name, salary);
		numGhosts = g;
		numBodies = b;
		numZombies = z;
		setRname(r);
	}
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public void scary() {
		if(numGhosts >= 10 && numBodies >= 10 && numZombies >= 10)
				System.out.println("Scary Factor is High!");
	}
	
	public void popup() {
		Random random = new Random();
		int x = random.nextInt(11);
		if (x == 7)
			System.out.println("BOO!");
	}
	
	public void printAttributes() {
		System.out.println("Number of Ghosts: " + numGhosts + "  Number of Bodies: " + numBodies 	
				+ "  Number of Zombies: " + numZombies);
	}
}

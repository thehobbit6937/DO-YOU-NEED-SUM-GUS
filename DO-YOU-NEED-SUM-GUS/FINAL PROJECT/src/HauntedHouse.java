import java.util.Random;

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
	public HauntedHouse(String name, double salary, String rn, int g, int b, int z) {
		super(name, salary, rn);
		numGhosts = g;
		numBodies = b;
		numZombies = z;
	}

	public void scary() {
		if(numGhosts >= 10 && numBodies >= 10 && numZombies >= 10)
				System.out.println("Scary Factor is High!");
	}
	
	public boolean popup() {
		boolean danger = false;
		Random random = new Random();
		int x = random.nextInt(11);
		if (x == 7)
			danger = true;
		return danger;
	}
	
	public void printAttributes() {
		System.out.println("Number of Ghosts: " + numGhosts + "  Number of Bodies: " + numBodies 	
				+ "  Number of Zombies: " + numZombies);
	}
}

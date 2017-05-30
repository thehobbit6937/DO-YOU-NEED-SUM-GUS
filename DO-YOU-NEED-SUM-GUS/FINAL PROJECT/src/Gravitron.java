
public class Gravitron extends Rides {
	private double velocity;
	private int riderMass;
	private double radius;
	private int minAge = 9;
	private double minHeight = 3.4;
	
	public Gravitron() {
		super();
		velocity = 0;
		riderMass = 0;
		radius = 0;
	}
	
	public Gravitron(String name, double salary, String rn, double v, int m, double r) {
		super(name, salary, rn);
		velocity = v;
		riderMass = m;
		radius = r;
	}
	
	public int getMinAge() {
		return minAge;
	}
	
	public double getMinHeight() {
		return minHeight;
	}

	public double force() {
		double cent = (riderMass * velocity * velocity)/(radius);
		return cent;
	}
	
	public void safeGs() {
		if(((riderMass * velocity * velocity)/(radius))/9.81 >= 4)
			System.out.println("DANGER! DANGER! SLOW DOWN IMMEDIATELY");		
	}
	
	public void printAttributes() {
		System.out.println("Rider Mass: " + riderMass + "  Velocity: " + velocity
					+ "  Radius of Gravitron: " + radius);
	}
}

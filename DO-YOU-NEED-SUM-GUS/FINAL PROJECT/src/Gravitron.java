
public class Gravitron extends Rides {
	private double velocity;
	private int riderMass;
	private double radius;
	private String rname;
	
	public Gravitron() {
		super();
		velocity = 0;
		riderMass = 0;
		radius = 0;
		setRname("");
	}
	
	public Gravitron(String name, double salary, double v, int m, double r, String rn) {
		super(name, salary);
		velocity = v;
		riderMass = m;
		radius = r;
		setRname(rn);
	}
	
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
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
					+ "Radius of Gravitrons: " + radius);
	}
}

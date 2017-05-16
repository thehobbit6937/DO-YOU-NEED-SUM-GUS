
public class Gravitron extends Rides {
	private double velocity;
	private int riderMass;
	private double radius;
	
	public Gravitron() {
		super();
		velocity = 0;
		riderMass = 0;
		radius = 0;
	}
	
	public Gravitron(String name, double salary, double v, int m, double r) {
		super(name, salary);
		velocity = v;
		riderMass = m;
		radius = r;
	}
	
	public double force() {
		double cent = (riderMass * velocity * velocity)/(radius);
		return cent;
	}
	
	public void safeGs() {
		if(((riderMass * velocity * velocity)/(radius))/9.81 >= 4)
			System.out.println("DANGER! DANGER! SLOW DOWN IMMEDIATELY");
			
	}
}

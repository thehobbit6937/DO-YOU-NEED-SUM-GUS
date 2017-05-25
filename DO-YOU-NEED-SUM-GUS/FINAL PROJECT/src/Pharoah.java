public class Pharoah extends Rides{
	private int period;
	private int amplitude;
	private int time;
	private int mass;
	
	public Pharoah() {
		super();
		period = 0;
		amplitude = 0;
		time = 0;
		mass = 0;
	}
	
	public Pharoah(String n, double sal, String r, int p, int a, int t, int m) {
		super(n, sal, r);
		period = p;
		amplitude = a;
		time = t;
		mass = m;
	}
	
	public double distance() {
		double angFreq = (2*Math.PI) / period;
		double position = amplitude * Math.sin(angFreq * time);
		return position;
	}
	
	public void velocity() {
		double angFreq = (2*Math.PI) / period;
		double velocity = angFreq * amplitude * Math.sin(angFreq * time);
		System.out.println("Your velocity is " + velocity + " m/s");
	}
	
	public void acceleration() {
		double angFreq = (2*Math.PI) / period;
		double acceleration = angFreq * angFreq * amplitude * Math.sin(angFreq * time);
		System.out.println("Your acceleration is " + acceleration + " m/s^2");
	}
	
	public double energyT() {
		double angFreq = (2*Math.PI) / period;
		double total = .5 * mass * angFreq * angFreq * amplitude * amplitude;
		return total;
	}
	
	public double energyK() {
		double angFreq = (2*Math.PI) / period;
		double k = .5 * mass * angFreq * angFreq * 
				((amplitude * amplitude) - (distance() * distance()));
		return k;
	}
	
	public void energyP() {
		double p = energyT() - energyK();
		System.out.println("The potential energy at that position is " + p + " J");
	}
}


public class GAS extends Rides{
	private String weather;
	private float velocity;
	private int minAge = 14;
	private double minHeight = 5.3;
	
	public GAS() {
		super();
		weather = "";
		velocity = 0;
	}
	
	public GAS(String nam, int sala, String rn, String we, float v) {
		super(nam, sala, rn);
		weather = we;
		velocity = v;
	}
	
	public int getMinAge() {
		return minAge;
	}
	
	public double getMinHeight() {
		return minHeight;
	}

	public void isSafe() {
		if(weather.compareTo("sunny")!=0 || weather.compareTo("drizzle")!=0 
				|| weather.compareTo("overcast")!=0)
			System.out.println("The ride is safe to use.");
		else
			System.out.println("The ride is UNsafe to use.");
	}
	public void printAttributes() {
		System.out.println("Weather: " + weather + "  Velocity: " + velocity);
	}
}

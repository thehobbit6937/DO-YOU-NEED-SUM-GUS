
public class GAS extends Rides{
	private String weather;
	private float velocity;
	
	public GAS() {
		super();
		weather = "";
		velocity = 0;
	}
	
	public GAS(String nam, int sala, String we, float v) {
		super(nam, sala);
		weather = we;
		velocity = v;
	}
	
	public boolean isSafe() {
		boolean danger = false;
		if(weather.compareTo("sunny")!=0 || weather.compareTo("drizzle")!=0 
				|| weather.compareTo("overcast")!=0)
			danger = true;
		return danger;
	}
	public void printAttributes() {
		System.out.println("Weather: " + weather + "  Velocity: " + velocity);
	}
}

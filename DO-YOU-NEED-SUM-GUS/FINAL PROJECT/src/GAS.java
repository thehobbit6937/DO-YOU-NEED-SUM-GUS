
public class GAS extends Rides{
	private String weather;
	private float velocity;
	private String rname;
	
	public GAS() {
		super();
		weather = "";
		velocity = 0;
		setRname("");
	}
	
	public GAS(String nam, int sala, String we, float v, String r) {
		super(nam, sala);
		weather = we;
		velocity = v;
		setRname(r);
	}
	
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public void isSafe() {
		if(weather.compareTo("sunny")!=0 || weather.compareTo("drizzle")!=0 
				|| weather.compareTo("overcast")!=0)
			System.out.println("The ride is safe to use.");
		System.out.println("The ride is safe to use.");
	}
	public void printAttributes() {
		System.out.println("Weather: " + weather + "  Velocity: " + velocity);
	}
}


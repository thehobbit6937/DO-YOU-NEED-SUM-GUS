public class WaterSlide extends Rides 
{
	private double speed;
	private int gallonsperhour;
	public WaterSlide()
	{
		super();
		speed = 0;
		gallonsperhour = 300;
	}
	public WaterSlide(String enam, double sal, String name, double sp, int gal)
	{
		super(enam, sal, name);
		speed = sp;
		gallonsperhour = gal;
	}
	public void setSpeed(double x)
	{
		speed = x;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setGallonsperhour(int r)
	{
		gallonsperhour = r;
	}
	public int getGallonsperhour()
	{
		return gallonsperhour;
	}
	public void printSlide()
	{
		System.out.println("Name : " + getRname());
		System.out.println("Average Speed of person on slide : " + speed + " m/s");
		System.out.println("Gallons Per Hour : " + gallonsperhour + " G/h");
	}
}


public class WaterSlide extends Rides 
{
  private double speed;
	public WaterSlide()
	{
		super();
		speed = 0;
	}
	public WaterSlide(String enam, double sal, String name, double sp)
	{
		super(enam, sal, nam);
		speed = sp;
	}
	public void setSpeed(double x)
	{
		speed = x;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void printSlide()
	{
		System.out.println("Name : " + getRname());
		System.out.println("Average Speed of person on slide : " + speed + " m/s");
	}
}

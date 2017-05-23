
public class WaterSlide extends Rides 
{
  private double speed;
	public WaterSlide()
	{
		super();
		speed = 0;
	}
	public WaterSlide(String Nam, int gal, double sp)
	{
		super(Nam,gal);
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
		System.out.println("Name : " + getRideName());
		System.out.println("Gallons of water per  hour : " + getRideGallonsPerHour() + " G/h");
		System.out.println("Average Speed of person on slide : " + speed + " m/s");
	}
	public void printEmpSlide()
	{
		for(Employees d: getEmpInfo())
		{
			System.out.println(d.getEmpName());
			System.out.println(d.getSalary());
		}
	}
}

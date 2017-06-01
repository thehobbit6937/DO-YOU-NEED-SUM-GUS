public class Hurricane extends Rides // a ride that shoots you down than you back and forth
	{
	private int dankness, gallonsperhour;//dank = how cool it is out of 10
  
	public Hurricane()
	{
		super();
		dankness = 9;// Hurricane is high on the dankometer 
		gallonsperhour = 1000;
	}
	public Hurricane(String enam, double sal, String nam, int dank, int gal)
	{
		super(enam, sal, nam);
		dankness=dank;
		gallonsperhour = gal;//gallons per hour
	}
	public void changeDank(int r)
	{
		dankness =dankness+ r;//changes how awesome the ride is
	}
	public void setGallonsperhour(int r)
	{
		gallonsperhour = r;
	}
	public int getGallonsperhour()
	{
		return gallonsperhour;
	}
	public void printDank()
	{
		System.out.println("Name : " + getRname());
		System.out.println("Dankness level : " + dankness);
		System.out.println("Gallons Per Hour : " + gallonsperhour + " G/h");
	}
}

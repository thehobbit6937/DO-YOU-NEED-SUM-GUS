
public class WaterPlayground extends Rides
{
	private int maxkids, gallonsperhour;//maxkids: the amount of kids on the ride, gallonsperhuor: how many gallons perhour
	private boolean isbucketfull;//the "bucket" is a giant a pale of water over the whole playground the drops ever so often
  
  public WaterPlayground()
	{
		super();
		maxkids = 0;
		gallonsperhour = 0;
		isbucketfull = false;// false means that it is not yet full yet
	}
	public WaterPlayground(int max, int gal, boolean poo)
	{
		super(?);
		maxkids = max;
		gallonsperhour = gal;
		isbucketfull = poo;
	}
	public void fillTheBucket()
	{// will set the isbucketfull boolean to true
		isbucketfull = true;
		System.out.println("It's FILLING UP!!!");
	}
	public void pourTheBucket()
	{
		if(isbucketfull == false)
			System.out.println("Needs to be filled");
		else
			System.out.println("It's COMING DOWN!!!!");
      isbucketfull =false;//Changes to false so the program will need the fill the bucket again
	}
}

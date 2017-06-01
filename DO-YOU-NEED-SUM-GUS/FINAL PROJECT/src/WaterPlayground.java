public class WaterPlayground extends Rides
{
	private int maxkids, gallonsperhour;//maxkids: the amount of kids on the ride, 
										//gallonsperhuor: how many gallons perhour
	private boolean isbucketfull;//the "bucket" is a giant a pale of water over the 
								 //whole playground the drops every so often
	
	public WaterPlayground()
	{
		super();
		maxkids = 0;
		gallonsperhour = 0;// how many gallons of water per hour
		isbucketfull = false;// false means that it is not yet full yet
	}
	public WaterPlayground(String em, double sal, String r, int max, int gal, boolean poo)
	{
		super(em, sal, r);
		maxkids = max;
		gallonsperhour = gal;
		isbucketfull = poo;
	}
	public int getMax()
	{
		return maxkids;
	}
	public void setAmp(int x)
	{
		maxkids = x;
	}
	public void setGallonsperhour(int r)
	{
		gallonsperhour = r;
	}
	public int getGallonsperhour()
	{
		return gallonsperhour;
	}
	public void fillTheBucket()
	{// will set the isbucketfull boolean to true
		isbucketfull = true;
		System.out.println("It's FILLING UP!!!");
	}
	public void pourTheBucket()//pours the bucket and makes the bucket now empty 
							   //by setting it to false
	{
		if(isbucketfull == false)
			System.out.println("Needs to be filled");
		else
			System.out.println("It's COMING DOWN!!!!");
	}
	public void printPlay()
	{
		System.out.println("Name : " + getRname());
		System.out.println("Maximum amount of kids : " + maxkids);
		System.out.println("Gallons Per Hour : " + gallonsperhour + " G/h");
	}
}

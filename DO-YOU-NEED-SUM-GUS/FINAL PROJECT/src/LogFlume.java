public class LogFlume extends Rides //Log Flume is practically a water slide 
									//except you are in a log 
{
 	private int peopleinride;// amount of people that can fit in a log
 	private int gallonsperhour;
  
 	public LogFlume()
 	{
 		super();
 		peopleinride = 2;
 		gallonsperhour = 1000000;
 	}
 	public LogFlume(String ename, double sal, String name, int pe, int gal)
 	{
 		super(ename, sal, name);
 		peopleinride = pe;
 		gallonsperhour = gal;
 	}
 	public void increaseWaterFlow(int x)//increase water flow
 	{
 		gallonsperhour= gallonsperhour+x;
 	}
 	public void decreaseWaterFLow(int y)//decrease water flow
 	{
 		gallonsperhour= gallonsperhour-y;
 	}
 	public void expandLog()//increases the seating capacity by 1
 	{
 		peopleinride= peopleinride + 1;
 	}
 	public void contractLog()//decreases the seating capacity by 1
 	{
 		peopleinride= peopleinride - 1;
 	}
 	public void printLogFlume()
 	{
 		System.out.println("Name : " + getRname());
 		System.out.println("People in the log : " + peopleinride);
		System.out.println("Gallons per Hour : " + gallonsperhour + " G/h");
 	}
}


public class LogFlume extends Rides 
{
  private int peopleinride;
  private int gallonsperhour;
  
  public LogFlume()
  {
    super();
    peopleinrides = 2;
    gallonsperhour = 1000000;
  }
  public LogFlume(String ename, double sal, String name, int urmom)
  {
    super(ename, sal, name);
    gallonsperhour = urmom;
  }
  public void increaseWaterFlow(int x)
  {
    gallonsperhour+=x;
  }
  public void decreaseWaterFLow(int y)
  {
    gallonsperhour=-y;
  }
  public void printLogFlume()
  {
    System.out.println("Name : " + getRname());
		System.out.println("Gallons per Hour : " + gallonsperhour + " G/h");
  }
}

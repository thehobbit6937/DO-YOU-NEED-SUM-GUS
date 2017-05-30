
public class Hurricane extends Rides 
{
 private int dankness,int gallonsperhour;//dank = how cool it is out of 10
  
 public Hurricane()
 {
   super();
   dankness = 9;// Hurricance is high on the dankometer 
   gallonsperhour = 1000;
 }
  public Hurricane(String enam, double sal, String name, double dank,int gal)
 {
   super(enam, sal, nam);
   dankness=dank;
   gallonsperhour = gal;//gallons per hour
 }
 public changeDank(int r)
 {
   dankness =+ r;//changes how awesome the ride is
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
    System.out.println("Gallons Per Hour : " + gallonsperhour);
 }
}

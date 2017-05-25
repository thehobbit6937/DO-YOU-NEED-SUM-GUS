
public class WavePool extends Rides 
{
  private double amplitude, period, wavelength, frequency;
  private int perbtw;
  
  public WavePool()
  {
    super();
    amplitude = 7;
    wavelength = 0;
    frequency = 0;
    perbtw = 0;
  }
  public WavePool(double amp, double wavlen, double freq, int perbtw)
  {
    super(?);
    amplitude = amp;
    wavelength = wavlen;
    frequency = freq;
    perbtw = perbtw;
  }
  public void increaseHeight(double add)
  {
    amplitude =+add;
  }
  public void decreaseHeight(double sub)
  {
    amplitude=-sub
  }
  public double findPeriod()
  {
    return (2*Math.PI)/frequency;
  {
  public void setTimeBetweenWave(int time)
  {
    perbtw = time;
  }
  public void printWaves()
  {
    System.out.println("Height of Wave : " + amplitude);
    System.out.println("Distance Between Waves : " + wavelength);
    System.out.println("Frequency of Waves : " + frequency);
    System.out.println("Time Between Waves and no Waves : " + perbtw);
    System.out.println("Period of Wave : " + findPeriod);
  }
}

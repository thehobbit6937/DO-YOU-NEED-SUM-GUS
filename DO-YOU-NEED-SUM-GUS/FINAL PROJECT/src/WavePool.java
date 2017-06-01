public class WavePool extends Rides 
	{
		private double amplitude, wavelength, frequency;
		private int perbtw;
  
	public WavePool()
	{
		super();
		amplitude = 7;// how high the wave gets in meters
		wavelength = 0;// distance between the tips of the waves
		frequency = 0; // how often the waves occurs
    	perbtw = 0; // time between waves and rest
	}
	public WavePool(String em, double sal, String r, double amp, double wavlen, double freq, int per)
	{//Constructor 
		super(em,sal,r);
    	amplitude = amp;
    	wavelength = wavlen;
    	frequency = freq;
    	perbtw = per;
	}
	public double getAmp()
	{
		return amplitude;
	}
	public void setAmp(double x)
	{
		amplitude = x;
	}
	public double getWave()
	{
		return wavelength;
	}
	public void setWave(double x)
	{
		wavelength = x;
	}
	public double getFreq()
	{
		return frequency;
	}
	public void setFreq(double x)
	{
		frequency = x;
	}
	public int getPer()
	{
		return perbtw;
	}
	public void setPer(int x)
	{
		perbtw = x;
	}
	public void increaseHeight(double add)
	{
		amplitude =amplitude+add;// increases the height
	}
	public void decreaseHeight(double sub)
	{
	   	amplitude=amplitude-sub;//decreases the height of the waves
	}
	public double findPeriod()
	{
		return (2*Math.PI)/frequency;// calculates time it take for one wave to elapse by doing 2 pi over frequency
	}
	public void setTimeBetweenWave(int time)
	{
		perbtw = time;// sets time
	}
	public void printWaves()
	{
		System.out.println("Name : " + getRname());
		System.out.println("Height of Wave : " + amplitude + "m");
		System.out.println("Distance Between Waves : " + wavelength + "m");
		System.out.println("Frequency of Waves : " + frequency);
		System.out.println("Time Between Waves and no Waves : " + perbtw);
		System.out.println("Period of Wave : " + findPeriod());
		System.out.println("There is " + perbtw + " minutes between waves");
	}
}

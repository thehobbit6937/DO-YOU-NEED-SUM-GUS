
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Rides implements EmpInfo {
	private String empName, name;
	private double empSalary;
	
	public Rides() {
		empName = "";
		empSalary = 0;
		name = "";
	}
	
	public Rides(String em, double sal,String nam) {
		empName = em;
		empSalary = sal;
		name = nam;
	}

	public double getSalary() {
		return empSalary;
	}

	public void setSalary(double s) {
		empSalary = s;
	}

	public String getName() {
		return empName;
	}
	
	public String getRideName() {
		return name;
	}
	public void setName(String n) {
		empName = n;
	}
	
	public void setRideName(String HallyIsSux){
		name = HallyIsSux;
	}
	
	public void playSound() {
    	try{
            AudioInputStream ais = AudioSystem.getAudioInputStream
            		(new File("/Users/heliotropesicilia/Desktop/boo.wav"));
            Clip test = AudioSystem.getClip();  

            test.open(ais);
            test.start();

            while (!test.isRunning())
                Thread.sleep(10);
            while (test.isRunning())
                Thread.sleep(10);

            test.close();
        }catch(Exception ex){
            ex.printStackTrace();
     }
}
}

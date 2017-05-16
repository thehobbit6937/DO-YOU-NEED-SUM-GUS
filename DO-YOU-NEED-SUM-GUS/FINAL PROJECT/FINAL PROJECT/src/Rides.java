
public class Rides implements EmpInfo {
	private String empName;
	private double empSalary;
	
	public Rides() {
		empName = "";
		empSalary = 0;
	}
	
	public Rides(String em, double sal) {
		empName = em;
		empSalary = sal;
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

	public void setName(String n) {
		empName = n;
	}
}

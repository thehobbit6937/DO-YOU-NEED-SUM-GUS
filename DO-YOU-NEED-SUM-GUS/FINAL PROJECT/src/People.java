
public class People {
	private double height;
	private int age;
	
	public People() {
		setHeight(0);
		setAge(0);
	}
	
	public People(double h, int a) {
		setHeight(h);
		setAge(a);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}

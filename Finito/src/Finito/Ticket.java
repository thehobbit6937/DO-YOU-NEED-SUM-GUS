package Finito;

public class Ticket extends Entry {
	private int numsold;
	private int fastPass;
	private int regTix;
	public Ticket() {
		super();
		numsold=0;
		fastPass=0;
		regTix=0;
	}
	public int getNumSold() {
		return getPop();
	}
	public int getTixPrice() {
		return regTix;
	}
	public int getFPPrice() {
		return fastPass;
	}
	public void setTixPrice(int p) {
		regTix=p;
	}
	public void setFPPrice(int p) {
		fastPass=p;
	}
}
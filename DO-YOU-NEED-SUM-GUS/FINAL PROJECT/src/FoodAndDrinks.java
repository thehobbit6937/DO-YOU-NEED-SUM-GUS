import java.util.Scanner;
public class FoodAndDrinks
{
	//declaring food/drink variables
	private int hamburger, hotdog, soda, water;
	private int chamburger, chotdog, csoda, cwater;
	Scanner scan=new Scanner(System.in);
	//constructor setting food equal to individual prices
	public FoodAndDrinks()
	{
		hamburger=5;
		hotdog=4;
		water=2;
		soda=3;
		chamburger=0;
		chotdog=0;
		cwater=0;
		csoda=0;
	}
	//accessor methods
	public int getHBPrice()
	{
		return(chamburger);
	} 
	public void setCHB(int h) {
		chamburger = h;
	}
	public int getHDPrice()
	{
		return(chotdog);
	}
	public void setCHD(int hd) {
		chotdog = hd;
	}
	public int getWPrice()
	{
		return(cwater);
	}
	public void setCW(int w) {
		cwater = w;
	}
	public int getSPrice()
	{
		return(csoda);
	}
	public void setCS(int s) {
		csoda = s;
	}
	//methods to return the price for each item
	//cost of hamburgers
	public int HBCost()
	{
		System.out.println("How many hamburgers are you buying? ");
		//setting variable equal to user input
		int ha=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=ha*hamburger;
		setCHD(cost);
		return(cost);
	}
	//cost of hot dogs
	public int HDCost()
	{
		System.out.println("How many hotdogs are you buying? ");
		//setting variable equal to user input
		int hd=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=hd*hotdog;
		setCHB(cost);
		return(cost);
	}
	//cost of water bottles
	public int WCost()
	{
		System.out.println("How many water bottles are you buying? ");
		//setting variable equal to user input
		int w=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=w*water;
		setCW(cost);
		return(cost);
	}
	//cost of soda bottles
	public int SCost()
	{
		System.out.println("How many soda bottles are you buying? ");
		//setting variable equal to user input
		int s=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=s*soda;
		setCS(cost);
		return(cost);
	}
	//returning total cost by adding each individual cost
	public void total()
	{
		System.out.println("Your total is " + (getHBPrice()+getHDPrice()+
				getWPrice()+getSPrice()) + " dollars.");
	}
	
	public double totalCosts()
	{
		return getHBPrice()+getHDPrice()+getWPrice()+getSPrice();
	}
}

package food;
import java.util.Scanner;
public class FoodAndDrinks extends Shops
{
	//declaring food/drink variables
	private int hamburger, hotdog, soda, water;
	//constructor setting food equal to individual prices
	public FoodAndDrinks()
	{
		hamburger=5;
		hotdog=4;
		water=2;
		soda=3;
	}
	//accessor methods
	public int getHBPrice()
	{
		return(hamburger);
	}
	public int getHDPrice()
	{
		return(hotdog);
	}
	public int getWPrice()
	{
		return(water);
	}
	public int getSPrice()
	{
		return(soda);
	}
	//methods to return the price for each item
	//cost of hamburgers
	public int HBCost()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many hamburgers are you buying? ");
		//setting variable equal to user input
		int ha=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=ha*getHBPrice();
		scan.close();
		return(cost);
	}
	//cost of hot dogs
	public int HDCost()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many hotdogs are you buying? ");
		//setting variable equal to user input
		int hd=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=hd*getHDPrice();
		scan.close();
		return(cost);
	}
	//cost of water bottles
	public int WCost()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many water bottles are you buying? ");
		//setting variable equal to user input
		int w=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=w*getWPrice();
		scan.close();
		return(cost);
	}
	//cost of soda bottles
	public int SCost()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many soda bottles are you buying? ");
		//setting variable equal to user input
		int s=scan.nextInt();
		//computing cost, closing scanner, and returning price
		int cost=s*getSPrice();
		scan.close();
		return(cost);
	}
}

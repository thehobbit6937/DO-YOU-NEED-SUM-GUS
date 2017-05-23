package food;
import java.util.Scanner;
public class FoodAndDrinks extends Shops
{
	//declaring cost variable
	private double cost;
	//constructor without cost as argument
	public FoodAndDrinks()
	{
		cost=0.0;
	}
	//constructor with cost
	public FoodAndDrinks(double c)
	{
		cost=c;
	}
	//setter method, setting cost equal to value from argument
	public void setCost(double c)
	{
		cost=c;
	}
	//getter method, returning cost
	public double getCost()
	{
		return cost;
	}
	//determining the price
	public double price()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How much of this item will you be purchasing? ");
		//setting variable equal to user input
		int n=scan.nextInt();
		//computing cost, closing scanner, and returning price
		double cost=(double)n*getCost();
		scan.close();
		return(cost);
	}
}

package food;
import java.util.Scanner;
public class FoodAndDrinks
{
	private double cost;
	public FoodAndDrinks()
	{
		cost=0.0;
	}
	public FoodAndDrinks(double c)
	{
		cost=c;
	}
	public void setCost(double c)
	{
		cost=c;
	}
	public double getCost()
	{
		return cost;
	}
	public double price()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How much of this item will you be purchasing? ");
		int n=scan.nextInt();
		double cost=(double)n*getCost();
		scan.close();
		return(cost);
	}
}

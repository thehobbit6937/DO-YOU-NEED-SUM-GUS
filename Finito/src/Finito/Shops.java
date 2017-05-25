package Finito;

import java.util.Scanner;

public class Shops {
	//private data that represents merchandise that can be sold
	Scanner scan=new Scanner(System.in);
	private int shirt;
	private int sweatpants;
	private int hoodie;
	private int cup;
	private int pictures;
	//Shops constructor
	public Shops() {
		shirt=15;
		sweatpants=20;
		hoodie=35;
		cup=5;
		pictures=5;
	}
	//returns the price of a shirt
	public int getShirtPrice() {
		return shirt;
	}
	//method to buy a shirt
	public int buyShirt() {
		int cost=0;		
		System.out.println("How many shirts would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getShirtPrice());
		return cost;
	}
	//returns the price of sweatpants
	public int getSWPPrice() {
		return sweatpants;
	}
	//method to buy sweatpants
	public int buySWP() {
		int cost=0;		
		System.out.println("How many sweatpants would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getSWPPrice());
		return cost;
	}
	//returns the price of a hoodie
	public int getHoodPrice() {
		return hoodie;
	}
	//method to buy a hoodie
	public int buyHood() {
		int cost=0;
		System.out.println("How many hoodies would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getHoodPrice());
		return cost;
	}
	//returns the price of a cup
	public int getCupPrice() {
		return cup;
	}
	//method to buy a cup
	public int buyCup() {
		int cost=0;
		System.out.println("How many cups would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getCupPrice());
		return cost;
	}
	//returns the price of a picture
	public int getPicPrice() {
		return pictures;
	}
	//method to buy pictures
	public int buyPics() {
		int cost=0;
		System.out.println("How many pictures would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getPicPrice());
		return cost;
	}
	//method to find the total cost
	public int total(int a, int b, int c, int d, int e) {
		int sum=a+b+c+d+e;
		return sum;
	}
	//method to buy merchandise
	public void buyMerch() {
		int i=0;
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		while(i>=0) {
			System.out.println("What would you like to buy? 1-shirt, 2-sweatpants, 3-hoodie, "
					+ "4-cup, 5-pictures");
			int n=scan.nextInt();
			if(n==1)
				c1=buyShirt();
			if(n==2)
				c2=buySWP();
			if(n==3)
				c3=buyHood();
			if(n==4)
				c4=buyCup();
			if(n==5)
				c5=buyPics();
			System.out.println("Would you like to buy anything else? 1-yes, 2-no");
			int num=scan.nextInt();
			if(num==1)
				i++;
			else
				break;
		}
		System.out.println("Your total cost is: $" + total(c1, c2, c3, c4, c5));
	}
}

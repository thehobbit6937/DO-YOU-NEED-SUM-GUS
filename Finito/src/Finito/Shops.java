package Finito;

import java.util.Scanner;

public class Shops {
	//private data that represents merchandise that can be sold
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
	public void buyShirt(int cost) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many shirts would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getShirtPrice());
		System.out.println("Your cost is: $" + cost);
	}
	//returns the price of sweatpants
	public int getSWPPrice() {
		return sweatpants;
	}
	//method to buy sweatpants
	public void buySWP(int cost) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many sweatpants would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getSWPPrice());
		System.out.println("Your cost is: $" + cost);
	}
	//returns the price of a hoodie
	public int getHoodPrice() {
		return hoodie;
	}
	//method to buy a hoodie
	public void buyHood(int cost) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many hoodies would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getHoodPrice());
		System.out.println("Your cost is: $" + cost);
	}
	//returns the price of a cup
	public int getCupPrice() {
		return cup;
	}
	//method to buy a cup
	public void buyCup(int cost) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many cups would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getCupPrice());
		System.out.println("Your cost is: $" + cost);
	}
	//returns the price of a picture
	public int getPicPrice() {
		return pictures;
	}
	//method to buy pictures
	public void buyPics(int cost) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many pictures would you like to buy?");
		int n=scan.nextInt();
		cost=cost+(n*getPicPrice());
		System.out.println("Your cost is: $" + cost);
	}
	//method to buy merchandise
	public void buyMerch() {
		Scanner scan=new Scanner(System.in);
		int i=0;
		int c=0;
		while(i>=0) {
			System.out.println("What would you like to buy? 1-shirt, 2-sweatpants, 3-hoodie, "
					+ "4-cup, 5-pictures");
			int n=scan.nextInt();
			if(n==1)
				buyShirt(c);
			if(n==2)
				buySWP(c);
			if(n==3)
				buyHood(c);
			if(n==4)
				buyCup(c);
			if(n==5)
				buyPics(c);
			System.out.println("Would you like to buy anything else? 1-yes, 2-no");
			int num=scan.nextInt();
			if(num==1)
				i++;
			else
				break;
		}
	}
}


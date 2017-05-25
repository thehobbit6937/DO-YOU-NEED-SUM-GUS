package Finito;

import java.util.Scanner;

public class Ticket extends Entry {
	Scanner scan=new Scanner(System.in);
	//private data--numsold is the amount of tickets that have been currently sold
	private int numsold;
	//fastpass is a type of ticket that allows you to go on all the rides but you do not need to wait as long on the line
	private int fastPass;
	//regTix is a type of ticket that allows you to go on all the rides
	private int regTix;
	//Ticket constructor, the price of a fast pass is $130, the price of a regular ticket is $75
	public Ticket() {
		super();
		numsold=0;
		fastPass=130;
		regTix=75;
	}
	//gettor that returns the number sold
	public int getNumSold() {
		return numsold;
	}
	//gettor that returns the price of a regular ticket
	public int getTixPrice() {
		return regTix;
	}
	//gettor that returns the price of a fast pass
	public int getFPPrice() {
		return fastPass;
	}
	//settor that sets how many tickets have currently been sold
	public void setNumSold(int n) {
		numsold=n;
	}
	//method that is used when someone wants to purchase tickets
	public void buyTix() {
		int i=0;
		int cost1=0;
		int cost2=0;
		int totalcost=0;
		//while loop used to start sequence if someone wants to purchase tickets
		while(i>=0) {
			System.out.println("What type of ticket would you like to purchase? 1-regular, 2-fast pass");
			int n=scan.nextInt();
			if(n==1) {
				System.out.println("How many would you like to purchase?");
				int nu=scan.nextInt();
				cost1=getTixPrice()*nu;
				totalcost=totalcost+cost1;
				System.out.println("Would you like to buy more tickets? 1-yes, 2-no");
				int num=scan.nextInt();
				if(num==1) 
					i++;
				else
					break;
			}
			else {
				System.out.println("How many would you like to purchase?");
				int numbr=scan.nextInt();
				cost2=getFPPrice()*numbr;
				totalcost=totalcost+cost2;
				System.out.println("Would you like to buy more tickets? 1-yes, 2-no");
				int number=scan.nextInt();
				if(number==1) 
					i++;
				else
					break;
			}
		}
		System.out.println("Your total cost is: $" + totalcost);
	}
}

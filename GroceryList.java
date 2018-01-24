package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String first, second, third;

		int itemNumber1, itemNumber2, itemNumber3;

		float cost1, cost2, cost3, total;

		out.println("Please list three items on your grocery shopping list.");

		out.print("Item 1? ");
		first = keyboard.nextLine();
		//keyboard.skip("\n");

		out.print("Item 2? ");
		second = keyboard.nextLine();


		out.print("Item 3? ");
		third = keyboard.nextLine();


		out.println("\nNow, please enter the quantity of each item.");

		out.print("How many " + first +"? ");
		itemNumber1 = keyboard.nextInt();

		out.print("How many " + second + "? ");
		itemNumber2=keyboard.nextInt();

		out.print("How many " + third + "? ");
		itemNumber3=keyboard.nextInt();

		out.println("\nNow, please enter the price of each item.");

		out.print("How much does one "+ first + " cost?");
		cost1=keyboard.nextFloat();

		out.print("How much does one " + second + " cost?");
		cost2=keyboard.nextFloat();

		out.print("How much does one " + third + " cost?");
		cost3=keyboard.nextFloat();

		out.println("\nCalculating your grocery bill.");

		total= ((float)cost1*itemNumber1)+((float)cost2*itemNumber2)+((float)cost3*itemNumber3);

		out.print("Your total cost is " + total + ".");

	}
}



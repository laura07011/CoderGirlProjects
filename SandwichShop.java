package com.company;

import java.util.Scanner;

import static java.lang.System.nanoTime;
import static java.lang.System.out;

public class SandwichShop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int goalForVeggies = 50;
		int goalForBurgers = 250;
		int goalForSubs = 180;
		int goalForSoup = 70;

		int veggies, burgers, subs, soup;

		out.println("Checking sales goals.");
		out.println("The sales goal for veggie sandwiches is " + goalForVeggies+".");
		out.println("How many veggie sandwiches were sold today?");
		veggies = keyboard.nextInt();

		if (veggies >= goalForVeggies) {
			out.print("Made goal for veggies.\n\n");
		} else {
			out.print("Fell short for veggies.\n\n");
		}

		out.println("The sales goal for burgers is " + goalForBurgers + ".\nHow many burgers were sold today?");
		burgers = keyboard.nextInt();

		if (burgers >= goalForBurgers) {
			out.print("Made goal for burgers.\n\n");
		} else {
			out.print("Fell short on burgers.\n\n");
		}

		out.println("The sales goal for subs is " + goalForSubs + ".\nHow many subs were sold today?");
		subs = keyboard.nextInt();

		if (subs >= goalForSubs) {
			out.print("Made goal for subs.\n\n");
		} else {
			out.print("Fell short on subs.\n\n");
		}

		out.println("The sales goal for soup is " + goalForSoup + ".\nHow many soups were sold today?");
		soup = keyboard.nextInt();

		if (soup >= goalForSoup) {
			out.print("Made goal for soup.\n\n");
		} else {
			out.print("Fell short on soup.\n\n");
		}

		if (burgers>=goalForBurgers && soup>=goalForSoup && subs>=goalForSubs && veggies>=goalForVeggies) {
			out.print("Made goal for everything! ");
		}


	}

}


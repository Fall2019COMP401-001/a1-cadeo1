package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemsinstore = scan.nextInt();
		String[] itemname = new String[itemsinstore];
		Double[] itemprice = new Double[itemsinstore]; 
		for (int i = 0; i < itemsinstore; i++) {
			itemname[i] = scan.next();
			itemprice[i] = scan.nextDouble();
		}
		int numberofcustomers = scan.nextInt();
		String[] fname = new String[numberofcustomers];
		String[] lname = new String[numberofcustomers];
		int[] itemsbought = new int[numberofcustomers];
		int[] quantity = new int[numberofcustomers];
		Double[] indtotal = new Double[numberofcustomers];
		String[] purchaseditem = new String[numberofcustomers];
		Double combinedtotal = 0.0;
		for (int i = 0; i < numberofcustomers; i++) {
			fname[i] = scan.next();
			lname[i] = scan.next();
			itemsbought[i] = scan.nextInt();
			Double sum = 0.0;
			for (int h = 0; h < itemsbought[i]; h++) {
				quantity[h] = scan.nextInt();
				purchaseditem[h] = scan.next();
				for (int g = 0; g < itemsinstore; g++) {
					if (purchaseditem[h].equals(itemname[g])) {
						sum = sum + quantity[h] * itemprice[g];
					}
			}
		}
			
			indtotal[i] = sum;
			combinedtotal = combinedtotal + indtotal[i];	
		}
		Double min = indtotal[0];
		for (int i = 1; i < numberofcustomers; i++) {
			if (indtotal[i] < min) {
				min = indtotal[i];
			}
		}
		Double max = indtotal[0];
		for (int i = 1; i < numberofcustomers; i++) {
			if (indtotal[i] > max) {
				max = indtotal[i];
			}
		}
		String bigname = fname[0] + " " + lname[0];
		for (int i = 1; i < numberofcustomers; i++) {
			if (indtotal[i] == max) {
				bigname = fname[i] + " " + lname[i];
			}
		}
		String smallname = fname[0] + " " + lname[0];
		for (int i = 1; i < numberofcustomers; i++) {
			if (indtotal[i] == min) {
				smallname = fname[i] + " " + lname[i];
			}
		}
		Double average = combinedtotal / numberofcustomers;
		System.out.println("Biggest: " + bigname + " (" + String.format("%.2f", max) + ")" );
		System.out.println("Smallest: " + smallname + " ("  + String.format("%.2f", min) + ")" );
		System.out.println("Average: " + String.format("%.2f", average));
	}
}

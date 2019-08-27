package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] quantity = new int[numberofcustomers*numberofcustomers];
		String[] purchaseditem = new String[numberofcustomers*numberofcustomers];
		int[] countofeach = new int[itemsinstore];
		int[] customercount = new int[itemsinstore];
		for (int i = 0; i < numberofcustomers; i++) {
			fname[i] = scan.next();
			lname[i] = scan.next();
			itemsbought[i] = scan.nextInt();
			for (int g = 0; g < itemsbought[i]; g++) {
				quantity[g] = scan.nextInt();
				purchaseditem[g] = scan.next();
				for (int h = 0; h < itemsinstore; h++) {
				if (itemname[h].contentEquals(purchaseditem[g])) {
					customercount[h] += 1;
					countofeach[h] += (quantity[g]);
				}
			}
		}
		}
		for (int i = 0; i < itemsinstore; i++) {
			if (customercount[i] == 0) {
				System.out.println("No customers bought " + itemname[i]);
			} else {
			System.out.println(customercount[i] + " customers bought " + countofeach[i] + " " + itemname[i]);
		}
	}
}
}	
	


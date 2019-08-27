package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
				int totalCustomers = scan.nextInt();
				String[] fName = new String[totalCustomers];
				String[] lName = new String[totalCustomers];
				int[] amountOfItems = new int[totalCustomers * totalCustomers];
				int[] quantity = new int[totalCustomers * totalCustomers];
				String[] itemName = new String[totalCustomers * totalCustomers];
				Double [] price = new Double[totalCustomers * totalCustomers];
				Double [] total = new Double[totalCustomers];
				for (int i = 0; i < totalCustomers; i++) {
					fName[i] = scan.next();
					lName[i] = scan.next();
					amountOfItems[i] = scan.nextInt();
					Double sum = 0.0;
					for (int h = 0; h < amountOfItems[i]; h++) {
						quantity[h] = scan.nextInt();
						itemName[h] = scan.next();
						price[h] = scan.nextDouble();
						sum = sum + price[h] * quantity[h];						
					}
					total[i] = sum;
					System.out.println(fName[i].charAt(0) + ". " + lName[i] + ": " + String.format("%.2f", total[i]));
					}
				
			}
		}

				


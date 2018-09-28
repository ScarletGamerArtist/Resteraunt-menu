package MenuJava;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * Kylee Prescott
 * Cloeh Spilker
 * Ailsa Mensinger
 * Kyra
 * 9/18
 */
public class RestaurantMenu {

	public static void main(String[] args) {
		//Display a menu
		Scanner input = new Scanner(System.in);
		
			System.out.println("\t ~ ~ M E N U ~ ~");
			System.out.println("    1 Hamburger  | $4.00 ");
			System.out.println("    2 Hotdog     | $3.25 ");
			System.out.println("    3 Spaghetti  | $5.50 ");
			System.out.println("    4 Taco       | $2.50 ");
			System.out.println("    5 Soup       | $2.30 ");
			System.out.println("    6 Salad      | $1.50 ");
			System.out.println("    7 Pizza      | $5.00 ");
	System.out.println();
	System.out.println();
	System.out.println("Choose three items from the menu. ");

	int items = 0;
	double total = 0;
	
	while (items < 3) {
		
		System.out.println("What would you like to eat?:");
		int choice = input.nextInt();
		
		if (choice == 1) {
			total += 4.00;
		} else if (choice == 2) {
			total += 3.25;
		} else if (choice == 3) {
			total += 5.50;
		} else if (choice == 4) {
			total += 2.50;
		} else if (choice == 5) {
			total += 2.30;
		} else if (choice == 6) {
			total += 1.50;
		} else if (choice == 7) {
			total += 5.00;
		}
		
		items ++;
		
	}
		
		double salesTax = .047;
		
		double SubTotalWT = total + (salesTax * total);
	    
		
		System.out.println("Enter the amount of tip that you want to pay: ");
		
		int tip = input.nextInt();
		double totalTip = ((tip / 100) * SubTotalWT);
		
		double fullTotal = SubTotalWT + totalTip; 
		
		
		System.out.println("Your total price is: ");
		System.out.printf("$%.2f\n", fullTotal); 
		

	}

}

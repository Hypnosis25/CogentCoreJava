import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of pizzas: ");
		int numPizza = scan.nextInt();
		
		if(numPizza < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		System.out.println("Enter the number of puffs: ");
		int numPuffs = scan.nextInt();
		
		if(numPuffs < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		System.out.println("Enter the number of cool drinks: ");
		int numDrinks = scan.nextInt();
		
		if(numDrinks < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		double pizzaTotal = numPizza * 100;
		double puffsTotal = numPuffs * 20;
		double drinksTotal = numDrinks * 10;
		double totalPrice = pizzaTotal + puffsTotal + drinksTotal;
		
		System.out.println("Thank you for placing your order, Your total price is $" + new DecimalFormat("0.00").format(totalPrice));
		
		
	}

}

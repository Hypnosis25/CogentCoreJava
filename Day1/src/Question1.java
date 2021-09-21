import java.util.Scanner;
import java.text.DecimalFormat;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the quantity of diesel to fill up the tank: "); 
		
		double quantity = scan.nextDouble();
		
		if(quantity <= 0.0) {
			System.out.println("Invalid Input");
			System.exit(0);
		} 
		
		System.out.println();
		
		System.out.println("What is the distance covered until the gas is empty?: ");
		
		double distance = scan.nextDouble();
		
		if(distance <= 0.0) {
			System.out.println("Invalid Input");
			System.exit(0);
		} 			
		
		double kmpl = (quantity/distance) * 100;
		double mpg = ((distance*0.6214)/ (quantity*0.2642));
		System.out.println("Liter/100kilometers");
		System.out.println(new DecimalFormat("0.00").format(kmpl));
		
		System.out.println();
		
		System.out.println("Fuel/Distance");
		System.out.println(new DecimalFormat("0.00").format(mpg));
	}

}

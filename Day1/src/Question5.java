import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		float discount = .10F;
		float specialC = .02F;
		int kTicket = 75;
		int qTicket = 150;
		int refreshment = 50;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want a refreshmetn?");
		String answer = scan.nextLine();
		
		System.out.println();
		
		System.out.println("Do you have a coupon?");
		String answer2 = scan.nextLine();
		
		System.out.println();

		System.out.println("What class ticket are you purchaing, a K or Q class?");
		String ticket = scan.nextLine();
		
		System.out.println("Enter the amount of tickets you want to purchase: ");
		int numTickets = scan.nextInt();
		
		if(numTickets < 5 || numTickets > 40) {
			System.out.println("Invalid input: Minimum of 5 & Maximum of 40");
			System.exit(0);
		}
		else if(numTickets > 5 || numTickets < 40) {
			System.out.println("You purchased this amount of tickets: " + numTickets);
		}
		
		System.out.println();
		
		float totalDiscounts = ((numTickets * kTicket) + refreshment) * (discount + specialC);
		float total = (((numTickets * kTicket) + refreshment));
		
		System.out.println(total - totalDiscounts);
	}

}

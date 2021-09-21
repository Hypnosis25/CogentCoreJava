import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		float discount = .10F;
		float specialC = .02F;
		int kTicket = 75;
		int qTicket = 75;
		int perMember = 50;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount of tickets you want to purchase: ");
		int numTickets = scan.nextInt();
		
		if(numTickets < 5) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else if(numTickets >= 20) {
			System.out.println ("You qualify for a discount");
		}
		else if(numTickets == 40) {
			System.out.println("Maximum Value");
		}
		
		System.out.println("What class ticket are you purchaing, a K or Q class?");
		String ticket = scan.nextLine();
		
	}

}

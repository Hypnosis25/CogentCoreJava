import java.util.Scanner;
import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {

		char c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any digit: ");
	
		int num = input.nextInt();
		
		c = (char) num; 
		
		
		System.out.println("This is the output for your digit : " + num + "-" + c);
		
		System.out.println();
		
		System.out.println("Enter another digit: ");
		
		int num2 = input.nextInt();
		
		c = (char) num2;
		
		System.out.println("This is the output for your digit : " + num2 + "-" + c);

		System.out.println();
		
		System.out.println("Enter another digit: ");
		
		int num3 = input.nextInt();
		
		c = (char) num3;
		
		System.out.println("This is the output for your digit : " + num3 + "-" + c);
		
		System.out.println();
		
		System.out.println("Enter your final digit: ");
		
		int num4 = input.nextInt();
		
		c = (char) num4;
		
		System.out.println("This is the output for your last digit : " + num4 + "-" + c);
	}
		

}

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students placed in CSE: ");
		int studentsCse = input.nextInt();
		
		
		if (studentsCse < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		} 
		
		System.out.println("Enter the number of students placed in ECE: ");
		int studentsEce = input.nextInt(); 
		
		if (studentsEce < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}		
		
		System.out.println("Enter the number of students placed in Mech: ");
		int studentsMech = input.nextInt();
		
		if (studentsMech < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}
}

import java.util.Scanner; 

public class Factorial {

	public static void main(String[] args) {

		int number = 153;
		int digit = 0;
		int factorial = 1;
		int sum = 0;
		int temp = number;

		while (number > 0) {
			digit = number%10;
			// 145 % 10 = 5
			System.out.println(digit);
			number /= 10; //short hand notation
			// number = number/10
			for (int i = 1; i<=digit; i++) {
				factorial *= i;
		}
			System.out.println(factorial);
			sum += factorial;
			factorial = 1;
		}	
		System.out.println(sum == temp);
		System.out.println(number);
	}
}

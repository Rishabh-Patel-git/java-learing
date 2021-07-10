package calculator;
import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		// after taking integer input we cant directy take string input due to enter.
		
		int result = 0;
		
		System.out.println("Enter the Opertion");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);   //char of first initial
		
		switch (operation) {
		
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*' :
			result = a * b;
			break;
		case '/' :
			result = a / b;
			break;
		default:
				System.out.println("Invalid operation");
		}
		System.out.println("your result is " + result);
		
		
		
		
		
		
}

}

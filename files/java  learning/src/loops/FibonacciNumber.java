package loops;
import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {

		// Fibonacci number next number is the sum of previous two numbers
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;
	
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for (int i = 0; i < n-2; i++) {
			int c = a + b;
			System.out.print(c+ " ");
			a = b;
			b = c;
		
		}
		
	}

}

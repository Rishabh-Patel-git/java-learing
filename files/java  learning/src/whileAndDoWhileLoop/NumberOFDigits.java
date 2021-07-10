package whileAndDoWhileLoop;

import java.util.Scanner;

public class NumberOFDigits {

	public static void main(String[] args) {

		// Program to find number of digits of a number
		
		// no of digits of a number = log10(n)+1
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int NumberOfDigits = (int)Math.log10(n) + 1;
		System.out.println(NumberOfDigits);
		
		
	}

}

package whileAndDoWhileLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		// palindrome number : in reverse order it remains same eg 12321
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reverseNumber = 0;
		while(temp > 0) {
			int lastDigit = temp % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			temp/=10;
		} 
		if(reverseNumber == n) {
			System.out.println( n + " is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

}

package whileAndDoWhileLoop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// while loop is used when we dont know how many illterations will be there;
		// program to find the sum of all the digits of a given number;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp > 0) {
			int lastDigit = temp%10;
			temp /= 10;
			
			 sum += lastDigit;
			
		}
		System.out.println("the sum of the digits of the number "+ n + " is "+ sum);
	}

}

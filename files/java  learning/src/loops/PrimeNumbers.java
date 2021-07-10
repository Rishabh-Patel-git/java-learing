package loops;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		
		// 1 is not a prime number 
		// factor can be from 1 to root n;
		
		Scanner sc = new Scanner(System.in);
		 
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {             // modulus fucntion gives remainder;
				isPrime = false;
				break;
				
			}
				
		}
		if(n<2) isPrime = false;         //for single statement in if condition curly braces are not necessary;
		System.out.println(" Number is prime " +isPrime);

	}

}

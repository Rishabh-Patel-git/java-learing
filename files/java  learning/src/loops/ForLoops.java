package loops;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {

		/* for(statement 1; statement 2; statement 3){
		 * code to be executed under given conditions
		 * }
		 * statement1 initiation 
		 * statement 2 checking 
		 * statement 3 what to do 
		 */
		
//		for (int i = 0; i <= 3; i = i + 1) {
//			System.out.println("HelloWorld " + i);
//		}
		
		// sumation of n number of integers
//		int sum = 0;
//		int n = 5;
//		for (int i = 1; i<= 5; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		
//		for (int i = 100; i >= 0; i--) {
//			System.out.println(i);
//		}
		// for writing tables
//		int tableOf = 4;
//		for (int i = 1; i <=10; i++) {
//			System.out.println(tableOf * i);
//			
//		}
		// program to find factorial of a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int n = sc.nextInt();
		int factorial = 1;
		
		for (int i = n; i >= 1; i-- ) {
			factorial = factorial * i;
		}
		System.out.println("your factorial is " + factorial);
		
		
	}

}

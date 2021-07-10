package loops;
import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	// program to find power of given number
	int result = 1;
	for (int i = 0; i < b; i++) {
		result *= a;
	}
	System.out.println(result);
}
}

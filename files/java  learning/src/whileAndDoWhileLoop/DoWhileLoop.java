package whileAndDoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		//do { } while(condition)
		// It will atleast run one time whether the condition is true or not
	Scanner sc = new Scanner(System.in);
	int n = 1;
	do {
	 n = sc.nextInt();
	 System.out.println(n);
	}while (n != 0);
	
	}

}

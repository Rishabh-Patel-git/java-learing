package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // type this then import 
		
		for(;;) { 
			int n = sc.nextInt();             //for infinite loop
			if (n < 0) {                      //skip curly brace for single statement
				break;          // for stopping the loop
			}
		}
		
		
	}

}

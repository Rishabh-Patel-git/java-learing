package conditionalStatement;

import java.util.Scanner;
public class ConditionalStatement {

	public static void main(String[] args) {

		
		//Conditional Statement if; else; else if;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//if statement;
		if (a >= 18) {
			System.out.println("you can vote");
			
		}
		else  {
			System.out.println("you can't vote");
		}
		
		//else if
		
		if (a<=10) {
			System.out.println("a is less than 10");
		
			
		}
		else if (a>10 && a<20) {
			System.out.println("a is between 10 and 20");
			
		}
		else if (a>30) {
			System.out.println("a is greater than 30");
		}
		else {
			System.out.println("a is between 20 and 30");
		}
		
	}

}
// yeah!! mr. white yeah!!science ~ jesse pinkman







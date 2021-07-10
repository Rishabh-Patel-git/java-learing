package conditionalStatement;
import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		/* switch (variable/expression) {
		 *           case value1:
		 *                   statemnets
		 *           break;
		 *           case value2:
		 *                   statements
		 *           break;
		 * 
		 *            default:
		 *                    statements
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		int dayOfWeek = sc.nextInt();
		
		switch(dayOfWeek) {
		case 1:
			System.out.println("Breaking Bad");
			break;
			
		case 2:
			System.out.println("Mr Robot");
			break;
			
		case 3: 
			System.out.println("Peaky Blinders");
			break;
			
		default:
				System.out.println("Go outside & play something. dumbass");
		}

		// in this we can also use if statment multiple times but it will become messy;
		
		
	}

}

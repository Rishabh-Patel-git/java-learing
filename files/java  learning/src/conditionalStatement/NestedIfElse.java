package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {

		// program to find largest number among given three number with the help of nested if else
		int a = 5, b = 4, c = 3;
		int max = 0;
		
		if(a>b) {
			if (a>c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if (b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		System.out.println("largest of three no. is " + max); //result in form of string;
	}

}
// fuck yeah i have to work on my typing skills;

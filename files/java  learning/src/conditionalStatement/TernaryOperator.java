package conditionalStatement;

public class TernaryOperator {

	public static void main(String[] args) {

		
		int a = 3;
		int b = 2;
		int maxOfBothNumber = 0;
		
		// Ternary operator 
		// variable = (condition)? expressionTrue : expressionFalse; shortcut for if else;
//		if (a < b) {
//			maxOfBothNumber = b;
//		}
//		else {
//			maxOfBothNumber = a;
//		}
//		System.out.println(maxOfBothNumber);      to write full variable name use ctrl + space;
		
		//or
		
		maxOfBothNumber = a > b ? a:b;  // if a is Greater than b then execute a;
		System.out.println(maxOfBothNumber);
		
		
		
		
		
	}

}

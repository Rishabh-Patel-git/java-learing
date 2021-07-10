package nestedForLoop;

public class Pattern8 {
	public static void main(String[] args) {
		
		int n = 3;
		System.out.println("* ");
		for(int i = 1; i<= n-1; i++) {
			System.out.print("* ");
			for(int j = 1; j<= i-1; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i  = 1; i<= n+1; i++) {
		System.out.print("* ");
		}
	}

}
// something went wrong i don't want to fix it n = 5 but no of rows = 6


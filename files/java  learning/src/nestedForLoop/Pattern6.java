package nestedForLoop;

public class Pattern6 {
	public static void main (String[] args) {
		
		int n = 4;
		int number = 1;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<= n-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= i; j++) {
				System.out.print(number++ +"   ");
				//or after sysout add number++ instead in parenthesis;
				}
			System.out.println();

			}
		}
	}
	
	



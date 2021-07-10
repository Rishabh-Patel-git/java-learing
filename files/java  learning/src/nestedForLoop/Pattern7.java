package nestedForLoop;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 2*n-1;
		for(int i = 1; i<= row; i++) {
			if(i<=n) {
			for(int j = 1; j<= i; j++) {             //for ith row print ith no. of stars
				System.out.print("* ");
			}
			}else {
				for(int j= 1; j<= row-i+1; j++) {                  // after that print row-i+1 stars
					System.out.print("* ");
					
				}
			}System.out.println();
		}
		
	}
	}
//not copied 

		

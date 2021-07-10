package arrays;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		// Average marks of students using arrays
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students ");
				int n = sc.nextInt();
				
				int[] marks = new int[n];
				System.out.println("Enter the marks now");
				for(int i = 0; i<n; i++) {
					marks[i] = sc.nextInt();
				}
				double average = 0;
				for( int i = 0 ; i< n ; i++) {
					average += marks[i];
				}
				average /= n;
				System.out.println("the average marks are " + average);
				
	}

}

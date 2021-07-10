package twoPointerAlgo;

import java.util.Scanner;

public abstract class Tritplet {

	public static void main(String[] args) {
           // time complexity is O(n^3)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i<n-2; i++) {
			for(int j =i+ 1; j<n-1; j++) {
				for(int k = i+2; k<n; k++) {
					if(a[i] + a[j] + a[k] == 0) {
						 flag = true;
					}
				}
			}
		}
		if(flag) System.out.println("1");
		else System.out.println("0");
	}

}

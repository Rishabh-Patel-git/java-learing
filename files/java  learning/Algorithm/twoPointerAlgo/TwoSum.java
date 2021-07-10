package twoPointerAlgo;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		/* two pointer algorithm
		 * so lets take an array
		 * 2 4 -1 3 -4 0 3
		 * we need to find two numbers whose sum = 5
		 * now first sort the array
		 * -4 -1 0 2 3 3 4
		 * so now take two pointers i and j on -4 and 4 respectively
		 * i + j = 3
		 * first -4+4 = 0 < 5 so we move i pointer towards right up-to 2 then sum > 5 so now we move j pointer towards left then we will do so until 
		 * i+j = 3 its time complexity is o(n^2) 
		 */
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n ; i++) {
			a[i] = sc.nextInt();
		}
           Arrays.sort(a);
           int i = 0;
           int j = n-1;
           while(i<j) {
        	   if(a[i]+a[j] < x) i++;
        	   else if (a[i] + a[j] > x) j--;
        	   else {
        		   System.out.println("we got x " + a[i] +" "+a[j]);
        		   break;
        	   }
           }
	}

}

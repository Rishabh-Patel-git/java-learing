package twoPointerAlgo;

import java.util.Arrays;

public class OptimizedTriplet {
	public boolean twoSum(int a[], int x, int i) {
		Arrays.sort(a);
		int j = a.length -1;
		while(i<j) {
			if(a[i] + a[j] < x) i++;
			else if(a[i] + a[j] >x) j--;
			else {
				return true;
			}
		} return false;
	}
	public boolean triplet(int a[], int n) {
		for(int i = 0; i<n-2; i++) {
		return true; 
		} return false;
	}

	public static void main(String[] args) {
			
			
	}

}

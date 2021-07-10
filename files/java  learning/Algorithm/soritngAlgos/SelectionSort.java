package soritngAlgos;

public class SelectionSort {

	public static void main(String[] args) {
 
		// smallest element will be swapped with first element and then after that another smaller element it will be swapped with 2nd element
		int a[] = {2, 3, 5, -8, 0, -5, -1, 1};
		int n = a.length;
		for(int i= 0; i<n-1; i++) {	
			int minInd = i;
			for(int j = i; j<n; j++) {
				if(a[j]<a[minInd]) {
					minInd = j;
				}
			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;          // why a[midInd]
			
		}
		
		for(int e: a) {
			System.out.print(e + " ");
		}
	}

}

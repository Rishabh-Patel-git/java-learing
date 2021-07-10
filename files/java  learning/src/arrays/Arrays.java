package arrays;

public class Arrays {

	public static void main(String[] args) {
		// Arrays is a data structure used to store multiple values in a single variable
		// instead of declaring separate variables for each value;
		
		//In java array can only store one type of data type
		
		int[] marks = new int[5];
		System.out.println(marks[4]);
		// or int marks[], classes; and int [] marks,classes;
		
		double[] age = {1.0, 3.14, 5.55}; 	 // initialiation array
		
		age[1] = 4.44;         		// update value of one element
		for(int i = 0; i< age.length; i++) {
	System.out.println(age[i]);          // getting value of particular array
		}	
		}

}

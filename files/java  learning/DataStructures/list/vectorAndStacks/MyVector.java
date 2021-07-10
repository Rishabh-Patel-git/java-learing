package list.vectorAndStacks;

import java.util.*;

public class MyVector {

	public static void main(String[] args) {
		
		List<Integer> vl = new Vector<>();
		// vector is similar to arraylist the only difference is it is synchronized and have locking of threads which is not normally used
		// due to synchronization it is not prferred over arraylist
		
		// it have all the methods similar to arraylist
		
		vl.add(33);
		vl.add(3);
		
		vl.set(1, 4);
		
		System.out.println(vl);

	}

}

package list.LInkedLIst;

import java.util.*;

public class TLinkedList {
	
	static void getTimeDiff(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() +" " + (end - start));
	}

	public static void main(String[] args) {

		// linked list data structure: it is similar to array list
		// linked list are linear data structures where the elements are not stored in contiguouts locations 
		// and every element is a separate objext with a data part and address part.
		// Each element is known as node ;
		
		List<Integer> ll = new LinkedList<>();
		ll.add(34);
		ll.add(23);
		System.out.println(ll);
		// same functions as array list
		
		List<Integer> al = new ArrayList<>();	
		al.add(45);
		ll.addAll(al);
		ll.set(1, 67);
		ll.contains(45);
		System.out.println(ll);
		getTimeDiff(al);
		getTimeDiff(ll);
	}

}

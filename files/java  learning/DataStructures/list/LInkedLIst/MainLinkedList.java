package list.LInkedLIst;

public class MainLinkedList {

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList();
		
		ll.add(66);
		ll.add(64);
		ll.add(89);
		for(int i= 0; i<33; i++) {
			ll.add(i);
		}
		
		
		ll.get(9);
	}

}

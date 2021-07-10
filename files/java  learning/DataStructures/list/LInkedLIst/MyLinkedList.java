package list.LInkedLIst;

public class MyLinkedList {             // creating my own linked list
	
	Node head;                         // node is a static class so it can be used without making the objects of it
	                                   // initially the head is null 
	
	public void add(int data) {
		Node toAdd = new Node(data);
		// for null pointer exception error
		if(head == null) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {        // we need to find the last node so we use next functions
			temp = temp.next;             
		}
		temp.next = toAdd;                 // adding new element to the last
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
	
	int get(int index) {
		Node temp = head;
		int count = 0;
		while(temp != null) {
		
			if(count == index)	{
				System.out.println(temp.data);
				return temp.data;
				
			}
			count++;
			temp = temp.next;	
		}
		return 0;
		
		
	}
	public int removeLast() {
		Node temp = head;
		if(temp.next == null) {          //corner case
			Node toRemove =  head;
			head = null;
					return toRemove.data;
		}
		
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next  = null;
		return toRemove.data;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {        // for ilterating in the list
			System.out.print(temp.data + " ");
			temp = temp.next;             
		}

		
		                                // temp.next does not include last element temp includes
	}
	public int getLast() throws Exception {
		Node temp = head;
		if(temp == null) {
			throw new Exception("empty list");
		}
		while(temp.next != null) {
		temp = 	temp.next;
		}
		return temp.data;
	}
	
	static class Node{                  // Node is a self referential class and have an object next which refers to the next location of node
		int data;
		Node next;                      // node next takes address(reference) of the next node and it always sets to null for last node  
		
		public Node(int data) {           // constructor to take data and reference 
			this.data = data;
			next = null;                 // node next works as a pointer
			
		}
		
	}

}

package list.vectorAndStacks;

import list.LInkedLIst.MyLinkedList;

public class MyStack {
	
	private MyLinkedList ll = new MyLinkedList();
	
	void push(int data) {
		ll.add(data);
	}
	
	int pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping from empty stack is not allowed");
			
		}
			return ll.removeLast();
		
		
	}
	int peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping from empty stack is not allowed");
			
		}
		return ll.getLast();
	}
	
}

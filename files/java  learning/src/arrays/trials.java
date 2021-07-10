package arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class trials {

	public static void main(String[] args) {
		
	              List<Integer> ll = new LinkedList<>();
	              ll.add(1);
	              ll.add(2);
	              ll.add(3);
	              Node head = new Node(1);
	              Node current = head;
	                int count = 0;
	                while(current != null){
	                    count++;
	                    current = current.next;
	                }
	                Node temp = head;
	                Node key = new Node(3);
	                
	                while(temp != null){
	                    if(count%2 == 0){
	                        temp.next = key;
	                        
	                    }
	                    
	                    temp = temp.next;
	                }
	                while(head != null) {
	                System.out.print(head.data);
	                head = head.next;
	                }
	                
	}
}	

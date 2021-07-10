package list.vectorAndStacks;
import java.util.*;

public class Stackex {

	public static void main(String[] args) {
		// take the example of plates over each other the last plate will be used first 
		// stack is a class which extends vector, vector implements list interface which extends collection framework
		
		Stack<Integer> s = new Stack<>();
		
		// it have three main methods 
		// 1. push
		s.push(33);
		s.push(44);
		s.push(55);
		
		//2. pop: it will remove and give last element
		System.out.println(s.pop());
		
		//3. peek: it will show the last element after popping it is 44;
		System.out.println(s.peek());
		//that's it 
		

	}

}

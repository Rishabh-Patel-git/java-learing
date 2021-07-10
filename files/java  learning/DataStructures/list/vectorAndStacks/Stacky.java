package list.vectorAndStacks;

public class Stacky {

	public static void main(String[] args) throws Exception {

		MyStack ss = new MyStack();
		ss.push(45);
		ss.push(33);;
		ss.push(22);;
		
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		
	}

}

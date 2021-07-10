package oops;

public class MethodsIntroduction {
	// syntax
		// public static int or void method name(){
		//    } public static are optional
		static int maxOf(int a,int b) {  //It will return int value
			if(a>b) {
				return a;                // take int as input
			}else {
				return b;
			}
		}
		static void sayHi(){
			System.out.println("hi good morning");
		}

	public static void main(String[] args) {
		
         int first = 43;
         int second = 34;
         int result = maxOf(first, second);
         System.out.println(result);
         
         sayHi();
         // void doesnt return anything
	}
	

}

package oops;

public class StaticKeyword {
      static class Person {
    	   int age;
    	   String name;
    	   static  String breed = "homo sapien";       //Static keyword is for classes not for objects/instances and used for declaring similar variables, methods,blocks
       }
      static { 
    	  System.out.println(" block 1");
      }
	public static void main(String[] args) {
//		//static { 
//			System.out.println("block2");
//		}
			
		Person student = new Person();
		student.name = "tom";
		System.out.println(student.name);
		
		
		/* static keyword is used in three things
		 * 1. In variables to fix a value of variable which will not change
		 * 2. In classes, if we have nested classes like A, B,C so if we use static keyword in c class we can create an object of c w/o creating the object of a class
		 * 3. In blocks, blocks are the codes which execute first 
		 * syntax static{ code} 
		 */
		
	}

}
		
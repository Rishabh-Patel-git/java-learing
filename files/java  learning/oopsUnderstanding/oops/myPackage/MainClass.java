package oops.myPackage;

import oops.myPackage.module.*;          // use * for multiple classes in same package

public class MainClass {

	public static void main(String[] args) {
			
		Student obj = new Student("tom"); 
		// error becoz name is private in student class       access modifier
		Teachers ho = new Teachers();
		
	}

}

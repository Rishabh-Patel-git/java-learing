package abstraction;

public abstract class Car {
	
	 public abstract void accelerate();
		
	 
	 public abstract void brake(); 
		 
	 
	 // instead of using curly braces as the function is defined by children class we can use abstract keyword 
	 // abstraction hides the complexity in the program for user in this case repeting the value of different cars is done by car class
}

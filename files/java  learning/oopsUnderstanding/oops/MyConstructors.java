package oops;

class vehicle{
	int wheels;
	String colour;
	
	vehicle(){        // no argument constructor no parameters
		wheels = 4;        // if things for object are constant like headlights in vehicles
		colour = "red";
	}
	vehicle(int noOfwheels){    // Parameterized constructors 
		this.wheels = noOfwheels;
	}
	// vehicle(int wheels){
	// this.wheels = wheels;}
	
}
public class MyConstructors {
		MyConstructors() {
			System.out.println("object is now created");
		}
	public static void main(String[] args) {
	
				MyConstructors obj = new MyConstructors();
				vehicle car = new vehicle();
				vehicle scooty = new vehicle(2);
				System.out.println(scooty.wheels +"   "+ car.wheels);
				// constructor overloading
				
	}

}

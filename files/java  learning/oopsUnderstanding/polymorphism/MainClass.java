package polymorphism;

public class MainClass {
	public void geetings() {
		System.out.println("hi oh yeah");
	}
	public static void geetings(String s) {
		System.out.println(s);
	
	}
	public static void geetings(String s, int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(s);                              // variables never override and methods can override
		}								                        // bye bye
	}
	public static void main(String[] args) {

		Dog d = new Dog();               // runtime polymorphism     same name different class slower
		Pet p = d;
		Animal a = new Animal();
		
		d.walk();
		p.walk();
		//a.walk();     method not defined in animal class
		
		geetings("hi there fuck off");                // compile time polymorphism      same name same class differnt parameters faster
		geetings("hello",4);
	}

}

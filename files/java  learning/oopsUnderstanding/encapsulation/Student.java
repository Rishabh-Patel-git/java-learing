package encapsulation;

public class Student {
	
	private String name;
	private int age;
           // getter function
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 30) {
			System.out.println("you are not eligible");
		}else {
		this.age = age;}
		
	}// auto generated getters and setters as follows
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

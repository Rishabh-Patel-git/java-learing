package string;

public class StringIntroduction {

	public static void main(String[] args) {

		//string are non primitive data types
		
 
		String name = "Rishabh";
		String name2 = "Rishabh";
		String anotherName = new String("Rishabh");
		
		/* difference 
		 * In first one the string will be stored in string pool area of memory allocation
		 * in second it will be stored in heap area where other variables are stored 
		 * java developers created string pool area for memory optimization as same strings can have same address 
		 * string animal1 = "cat";
		 * string animal2 = "cat";
		 * IN new string 2 different strings will be created
		 */
		
		System.out.println(name == name2);
		System.out.println(name == anotherName);
		// concept cleared;;;
		
		// charAt funtion & length function
		System.out.println(name.charAt(0)+ " "+ name.length());
//	     for(int i = 0; i<name.length(); i++) {
//	    	 System.out.print(name.charAt(i));
//	     }
		
		// substring
		String p = "Rishabh Patel yup";
		System.out.println(p.substring(3,5));
		System.out.println(p.substring(4));
		
		
		// contain fuction
		System.out.println(name.contains("Rishabh"));
		
		// equals 
		System.out.println(name.equals(anotherName));
		
		// empty function
		String empty = "";
		System.out.println(empty.isEmpty());
		
		// concat
		//addition of strings 
		System.out.println(name.concat(p));
		System.out.println(name.concat(" cool"));
		
		//replace      char old to char new;
		System.out.println(name.replace('R', 'A'));
		
		// split
		String cars = "Hyundai, Audi, Ferrari";
		String allCars[] = cars.split(",");
		for(String car: allCars) {
			System.out.println(car);
		}
		
		//index of
		System.out.println(name.indexOf('a'));
		
		// to lower case
		String cans = "            RISHABH           ";
		System.out.println(cans.toLowerCase());
		// same for upper case
		
		
		// trim removes spaces
		System.out.println(cans.trim());
		
		
		// taking input as a string
		//s[] = sc.nextLine();
		
		
	}

}

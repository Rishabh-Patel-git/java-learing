package scannerClass;
import java.util.Scanner;
public class SimpleInterestprogram {

	public static void main(String[] args) {
		//Simple Interest program
		Scanner sc = new Scanner(System.in);
		int Principal = sc.nextInt();
		double Rate = sc.nextDouble();
		short Time = sc.nextShort();
		
		double Interest = Principal*Rate*Time/100;
		System.out.println("Simple Interest is " + Interest);
		//Type Casting
		int x = (int)Interest;
		System.out.println(x);
	}

}

package operators;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {

		//types of operators
		//Arthmetic operator
		
		int a = 33;
		float b = 5.55f;
		double x = a + b;
		System.out.println(x);
		
		// now ++ and --   in b++ increment will be in the next line but in case of ++b increment will happen in that line;
		int z = 10;
				//int c = z++;
				int myc = ++z;
		//System.out.println(c + " "+ z +" ");
				System.out.println(myc + " "+ z);
				
				
				
				//Bitwise operators            and; or;
				int newA = 5; 							//5 in binary
						int newB = 6;					//6 in binary
						int newC = newA & newB; 		 //addition in and operation
						System.out.println(newC);
						
						int newD = newA | newB;
						System.out.println(newD);             //sysout ctrl+space
						
				//Assignment operator    equal is an assignment operator
            int newf = 4;
            newf += 2;   //a = a+ 2
            System.out.println(newf);
            
            newf *=2;
            System.out.println(newf);
            //Same in case of division and other operators
            
            
            // scanner practice
            Scanner sc = new Scanner(System.in);
            
            int g = sc.nextInt();
            int h = sc.nextInt();
            
            int n =  g &  h;
            
            System.out.println(n);
            
            //Syntax is fucking awesome;
            
            //in assignment operator there are other types like right shift and left shift << and >>;
            
            // ComparasionOperator;  greater than>; smaller than<; equal to ==; not equal to!=; greater than equal to>= ; smaller than equal to<=;
            
            int e = 3;
            int u = 2;
            System.out.println( e == u ); // I dont know why this is not working.lol
            
            
            //Logical operator  logical and && ; logical or ||; logical not !
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
				
		
	}

}

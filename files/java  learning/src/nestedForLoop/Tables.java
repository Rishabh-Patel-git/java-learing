package nestedForLoop;

public class Tables {

	public static void main(String[] args) {

		for(int j = 1; j<=10; j++) {
			for(int i = 1; i<=10 ; i++) {
				System.out.print(j*i +" ");     // ln for next line 
			}
			System.out.println();    // for leaving a line
		}
	}

}          // or you can make a variable and then put j in it then new variable*i ;

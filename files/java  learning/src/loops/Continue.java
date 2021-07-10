package loops;

public class Continue {

	public static void main(String[] args) {
           //continue skips that part of the loop then move to next alteration of the loop;
		
		for (int i = 1; i<= 100; i++) {
			if (i >= 40 && i <= 50) {              //skips from 40 to 50 including
				continue;
			} System.out.println(i);
		}
	}

}

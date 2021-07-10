package string;

public class Anagram2 {

	public static void main(String[] args) {

		String a = "cat";
		String b = "act";
		
		boolean anagram = false;
		
		int al[] = new int[256];
		int bl[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
			
		}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			bl[index]++;
		}
		for(int i = 0; i<256; i++) {
			if(al[i] != bl[i])
				anagram = false;
		}
	}

}

package string;

public class AnagramOfStrings {

	public static void main(String[] args) {

		//two strings in which same characters repeat same no of times
		// aab and baa or cdd and dcd
		
		String a = "this";
		String b = "shit";
		
		boolean anagram = false;
		boolean visited[] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
		for(int i = 0; i<a.length(); i++) {
			char c = a.charAt(i);
			anagram = false;
			for(int j = 0; j<b.length(); j++) {
				if(b.charAt(j) == c && !visited[j]) {
					visited[j] = true;
					anagram = true;
					break;
				}
			}
			if(!anagram) break;
			
		}
		}
		if(anagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	
	}

}

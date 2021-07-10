package singletonPattern;

public class Appconfig {
	private Appconfig() {
		
	}
	private static Appconfig obj = new Appconfig();
	public static Appconfig getInstance() {
		return obj;
	}

}

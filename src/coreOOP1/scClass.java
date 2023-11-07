package coreOOP1;

public class scClass extends spClass {

	String name = "Zoro";
	
	public void displayName() {
		super.displayName();
		System.out.println("The name is:" + super.name);
	}
	public scClass() {
		
		System.out.println("I am a child constructor");
	}
	
	
	public static void main(String[] args) {
		
		scClass namy = new scClass();
		namy.displayName();
	}

}

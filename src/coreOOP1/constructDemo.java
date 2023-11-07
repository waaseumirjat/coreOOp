package coreOOP1;

public class constructDemo {

	public constructDemo(int a, int b) {
		
		System.out.println("I am in the parametrized constructor");
	}
	
	public constructDemo() {
		System.out.println("I am a constructor");
	}
	
	public void getData() {
	
		System.out.println("I am a method");
	}
	
	
	
	public static void main(String[] args) {
		//constructDemo ct = new constructDemo();
		//ct.getData();
		constructDemo pc = new constructDemo(4, 5);
		pc.getData();
	}

}

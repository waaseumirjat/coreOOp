package coreOOP1;

public class ChildEmirates extends ParentAircraft{

	public static void main(String[] args) {
		
		ChildEmirates ty = new ChildEmirates();
		ty.safetyGuidelines();
		ty.craftColor();
	}

	public void craftColor() {
		System.out.println("The color of the aircraft is maroon");
		
	}

}

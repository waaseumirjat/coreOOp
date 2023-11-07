package coreOOP1;

public class childClass extends parentClass {

	
	public void engineSpec() {
		System.out.println("new engine");
	}
	public void color() {
		System.out.println(color);
	}
	public void audiosys()
	{
		System.out.println("child audio implemented");
	}
	public static void main(String[] args) {
		childClass cd = new childClass();
		cd.engineSpec();
		cd.color();
		cd.audiosys();
		int art[] = new int[5];
		art[0] = 4;
		art[3] = 5;
		System.out.println(art[0]);
		int art2[] = {5,6,87};
		System.out.println(art2[1]);
		//Multi dimensional array
		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		System.out.println(a[1][0]);
		//int b[][]= {‌{2,4,5},{3,4,7},{5,2,1}};
		//System.out.println(b[2][1]);
	}

}

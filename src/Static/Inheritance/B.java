package Static.Inheritance;

public class B extends A {
	
	
	static int b=20;
	
	static {
		
		System.out.println("Inside static block of B");
	}
	
	static void m2() {
		
		System.out.println("Inside static method of B");
	}
	
	
	public static void main(String args[]) {
		
		
		System.out.println(b);
		System.out.println(b);
		
		m2();
		m1();
		
		
		
	}
	
	

}

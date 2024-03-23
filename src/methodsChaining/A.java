package methodsChaining;

public class A {

	
	//this super==>>>> method ,constructor
		//this() super() =>>>> Constructor
	int a=10;
	
	void m1() {
		
		
		System.out.println("Inside method m1 of A");
		
		
	}
	
	void m2(int a) {
		
		
		this.m1();
		System.out.println("Inside method m2 of A");
	}
	
	


	
}

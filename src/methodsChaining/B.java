package methodsChaining;

public class B extends A{
	
	
	//this super==>>>> method ,constructor
	//this() super() =>>>> Constructor
	
	int a=20;
	
	void m3() {
		
		
		System.out.println(this.a);
		System.out.println(super.a);
		//super.m2(10);
		System.out.println("Inside method M3 of B: "+a);
		
		
	}
	
	void m4(int a) {
		this.a=a;
		System.out.println("Inside method m4 of B: "+a);
		m3();
		
	}
	
public static void main(String args[]) {
		
		B obj=new B();
		obj.m3();
		obj.m4(30);
		
		
	}

	
	
	

}

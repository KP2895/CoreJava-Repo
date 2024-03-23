package Nonstatic.inheritance.qc;

public class C extends B {

	
	C() {
		
		//super() =>parent class che data member
		//this()=> current class che datamembers
		
		System.out.println("Inside constructor C");
	}
	
	
	
	 C(int A) {
		
		 this();
		 System.out.println("Inside paramertised constructor: "+A);
	}



	public static void main (String args[]) {
		
		
		System.out.println("Before objetc creation");
		C obj=new C(10);
		System.out.println("After object creation");
		
		System.out.println(obj.d);
		System.out.println(obj.c);
		obj.m2();
		obj.m1();
		
		
		
		
	}
}

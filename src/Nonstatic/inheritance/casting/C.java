package Nonstatic.inheritance.casting;

public class C extends B {

	
	void m5() {
		System.out.println("Inside m5 method");
	}
	
	public static void main(String args[]) {
		// child class
//		C obj=new C();
//		obj.m1();
//		obj.m2();
//		obj.m3();
//		obj.m4();
//		obj.m5();
//		System.out.println("----------------------");
//		
//		//parent class=>B
//		//upcasting=>>>A=>B=>C
//		
//		B obj1=obj;
//		obj1.m1();
//		obj1.m2();
//		obj1.m3();
//		obj1.m4();
//		System.out.println("----------------------");
//		
//		A obj2=obj;
//		obj2.m1();
//		obj2.m2();
//		System.out.println("----------------------");
		
		//downcasting=>> C=>B=>A A STORES VALUE OF A creating address/// b STORES A,c,b
		
   A obj =new C();
   obj.m1();
   obj.m2();
   
   B obj2 =(B)obj;
  
  obj2.m1();
  obj2.m2();
  obj2.m3();
  obj2.m4();
	
  
   
   
   
		
		
		
		
	}
}

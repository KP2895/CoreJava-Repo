package Corejava_Basics;

public class Static_Member {
	
	//static=>variable, block, method
	//for calling static data membr =>by using classname.data membr & direclty call
	
	static int c=20;
	String s1="Patil";
	
   static void m1() {
	   
	   Nonstatic_Member.m3();
	   System.out.println(Nonstatic_Member.a);
	   
		System.out.println("Inside static method 1");
		
	}
   
 
   
   static void m2() {
	   
	   m1();
	   System.out.println("Inside static method 2");
   }
   
	static {
		
		/*
		 * System.out.println(a); System.out.println("Inside static block1");
		 */
		
	}
	
  static {
		
	  Static_Member.m2();
		System.out.println("Inside static block2");
		
	}
	
		

	public static void main(String[] args) {
		
		Static_Member OBJ=new Static_Member();
		m1();
		m2();
		OBJ.m1();
		OBJ.m2();
		Static_Member.m1();
		Static_Member.m2();	
		

	}

}

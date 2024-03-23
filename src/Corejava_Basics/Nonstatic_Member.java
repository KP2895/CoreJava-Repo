package Corejava_Basics;

public class Nonstatic_Member {

	//Nonstatic/instance/global==> Varibales ,block , method
	

	static String str="KP";
	static int a=10;
	int b=20;
	
	
	static void m3() {
		
		System.out.println(a);
		System.out.println(str);
		System.out.println("Inside Non-static method");
	}
	

	
	
	{
		System.out.println(a);
		m3();
		System.out.println(str);
		System.out.println("Inside non static block");
		
	}
	
	static {
		
		System.out.println("Inside static block");
	}
	
	
	public static void main(String[] args) {
		
		Nonstatic_Member Obj=new Nonstatic_Member();
		
		
		
	}

}

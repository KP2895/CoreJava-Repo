package Corejava_Basics;

public class OBJCREATE {

	
	//Constructor=>Special case of method ,whose name is same as class name , wihtout return type
	//use=>to intilise the obj
	//
	
	OBJCREATE(int a){
		
		System.out.println("Inside Parametrised constructor");
		
	}
	
	OBJCREATE(){
		
		System.out.println("Inside default constructor");
		
	}
	
static void m1() {
		
	System.out.println("Inside non pararmterise method");
		
	}

static void m1(int a) {
	
	System.out.println("Inside pararmterise method");
}
	
	
	public static void main(String[] args) {
		
		
		OBJCREATE obj=new OBJCREATE();
		m1();
		

	}

}

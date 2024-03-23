package ConstructorChaining;

public class C extends B {
	
	int a=50;

	C(){
		
		
		
		System.out.println("Inside constructor C");
		
}
	
	//this();
	
	C(String a){
		
		this();
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		C obj1=new C("KP");

		
		
	}

}

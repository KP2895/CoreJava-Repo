package Polymorphism.overloading;

public class Cat  {
	
	
	//constructor overloading
	
	
	Cat(){
		System.out.println("Inside defalt constructor");
		
	}
	
	Cat(int a){
		
		System.out.println("Inside parmaterised constructor: "+a);
	} 
	
	public static void main (String args[]) {
		
		Cat c=new Cat();
		Cat c1=new Cat(10);
		
	
	
	}
	
	

}

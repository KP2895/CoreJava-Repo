package Polymorphism.overloading;

public class Animal {

	
	//poly=>many morph=>forms =>Ability of object to take many forms

     //1. Compiletime polymorphism =>static binding => Method overloading
	//2.Runtime Polymorphism =>Dynamic binding/Method overriding
	
	//Compile time Polymorphism==>> same class ,same method name but diff paramters
	//Method overloading
	
	void run() {
		
		System.out.println("All animal can run");
	}

	
	void run (int speed) {
		
		
		System.out.println("All animal can run: "+speed);
	}
	
	
	public static void main (String args[]) {
		
	Animal a=new Animal();
	a.run();
	a.run(20);
		
		
	}

	
	
	
	
}

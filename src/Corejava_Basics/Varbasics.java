package Corejava_Basics;

public class Varbasics {

	/*
	 * <<<<<<<<<<<<<<<<<<<<<<=Variables=>>>>>>>>>>>>>>>>>>>>>
	 * 
	 *  1.Global/Instance variables
	 *  2.Static variables 
	 *  3.local varibles
	 */

	// Instance variables>>
	// The variables whose values changes from object to object are called as instance variable.
	//their scope is wrt object=>allocate memory with objec creation nd destruct with object destruction
	//instance varible are stored in heap area
	
	//2 Static Varibles:
	//Static variables are declared inside class but outside method,block,constructor with static keyword
	//Staic variables are class level variables which allocate memmory when class is getting loaded and destruction 
	//with class destruction
	//static variables are stored in
	
	
	int x=10;
	static int  b=16;
	String s1="Leela";
	
	void display() {
		
		System.out.println("In instance method");
		System.out.println("Value of instance variable:"+x); //instance varibale
		x=12;
		System.out.println("Value of instance variable:"+x); //instance varibale
		
		
		System.out.println("Value of static variable:"+b);//static variable
		b=20;
		System.out.println("Value of static variable:"+b);//static variable
		
	}

	public static void main(String[] args) {

		// System.out.println(str);
		Varbasics bb = new Varbasics();
		bb.display();
		
		Varbasics bb1=new Varbasics();
		
		//calling instance varibale=>>>>>>>>>>>>>>>>>>
	   System.out.println("Value of instance variable:"+bb1.x);
	   
	   //calling static varibale=>>>>>>>>>>>
	   System.out.println("Value of static variable:"+b);
	   System.out.println("Value of static variable:"+bb1.b);
	   System.out.println("Value of static variable:"+Varbasics.b);
	}

}

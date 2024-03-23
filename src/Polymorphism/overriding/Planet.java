package Polymorphism.overriding;

public class Planet {

	public static void main(String[] args) {
		
		Chicken ch=new Chicken();
		ch.fly();
		
		//upcasting => Bird=>Hen=>Chicken
		//for method hiding we have to use static keyword => it will hide child class method
		
		Hen bh=ch;
		bh.fly();
		
		Bird b=bh;
		b.fly();

	}

}

package Programs;

import java.util.Scanner;

import ControlStatemnts.ConditionalStatement;

public class Decisionmakingstatement {

	Scanner sc = new Scanner(System.in);

	void even_odd() {

		// wap to check for even and odd no:X

		int a = 16;
		if (a % 2 == 0) {

			System.out.println("a=" + a + " is even number");

		} else {
			System.out.println("Given number is odd: " + a);
		}
	}

	// Taking input from user

	void even_odd1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Given Number " + num + " is even number");

		}

		else {

			System.out.println("Given Number " + num + " is odd number");
		}

	}

	// WAP to check whether inputed number is positive or negative

	void m1() {

		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % num == 1) {

			System.out.println(num + " is Positive number");

		} else {
			System.out.println(num + " is Negative number");
		}
	}

	// WAP to know given numbe is divisible by 3 &7

	void m2() {

		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 3 == 0 && num % 7 == 0) {

			System.out.println(num + " is divisible by 3 & 7");
		}

		else if (num % 3 == 0) {

			System.out.println(num + " is divisible by 3 & not divisible by 7");

		}

		else if (num % 7 == 0) {

			System.out.println(num + " is divisible by 7 & not divisible by 3");
		} else {

			System.out.println(num + " is not divisible by 3 & 7 ");
		}

	}

	// WAP to check cadidate is eligible for vote

	void m3() {

		System.out.println("Enter cadidate  age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= 18) {

			System.out.println("Candidate is adult , he can vote");
		} else {

			System.out.println("Cadidate is minor , he can not vote");
		}

	}

	// WAP to find maximum of four number & print in sequntial =>

	void m4() {

		System.out.println("Enter 1st number numbers :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number numbers :");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number numbers :");
		int c = sc.nextInt();
		System.out.println("Enter 4th number numbers :");
		int d = sc.nextInt();

		if (a > b && a > c && a > d) {

			System.out.println("a is highest number");
		}

		else if (b > a && b > c && b > d) {

			System.out.println("b is highest number");
		}

		else if (c > a && c > b && c > d) {

			System.out.println("c is highest number");
		}

	}

	// WAP to find minimum of three numbers :

	void m5() {

		System.out.println("Enter value of first number :");
		int a = sc.nextInt();
		System.out.println("Enter value of 2nd number :");
		int b = sc.nextInt();
		System.out.println("Enter value of 3rd number :");
		int c = sc.nextInt();

		if (a < b && a < c) {

			System.out.println("a is smallest number");
		}

		if (b < a && b < c) {

			System.out.println("b is smallest number");
		}

		if (c < a && c < b) {

			System.out.println("c is smallest number");

		}

	}

	void m6() {

		// WAP to to calculate marks in 4 subject & display result=>
		// subject less than 35 fail =>also want in which subject student fail
		// subject more than 70 distinction =>also print in which subject got distinction
		// subject upto 50 2nd class =>print in which subject got 2nd class
		// subject between 35 to 50 pass =>

		System.out.println("Marks in subject 1");
		int sub1 = sc.nextInt();

		System.out.println("Marks in sub2");
		int sub2 = sc.nextInt();

		System.out.println("Marks in sub3");
		int sub3 = sc.nextInt();

		System.out.println("Makrs in sub4");
		int sub4 = sc.nextInt();

		int Average = (sub1 + sub2 + sub3 + sub4) / 4;
		System.out.println("Result =>" + Average);

		if (sub1 < 35 || sub2 < 35 || sub2 < 35 || sub4 < 35) {

			System.out.println("candidate is fail");

			if (sub1 < 35) {

				System.out.println("Candidate failed in sub1");
			} 
			if (sub2 < 35) {

				System.out.println("Candidate failed in sub2");
			}
			 if (sub3 < 35) {

				System.out.println("Candidate failed in sub3");
			} 
			 if (sub4 < 35) {

				System.out.println("Candidate failed in sub4");
			}

		}
		
		// subject more than 70 distinction =>also print in which subject got distinction
		if (sub1 >= 70 || sub2 >= 70 || sub2 >= 70 || sub4 >= 70) {

			

			if (sub1 >= 70) {

				System.out.println("Candidate got distinction sub1");
			} 
			if (sub2 >= 70) {

				System.out.println("Candidate got distinction sub2");
			}
			 if (sub3 >= 70) {

				System.out.println("Candidate got distinction sub3");
			} 
			 if (sub4 >= 70) {

				System.out.println("Candidate got distinction sub4");
			}

		}
		

	}
	
	
	//Upper case and lower case
	
	
	


	public static void main(String[] args) {
		Decisionmakingstatement obj = new Decisionmakingstatement();
		// obj.even_odd();
		// obj.even_odd1();
		// obj.m1();
		// obj.m2();
		// obj.m3();
		// obj.m4();
		//obj.m5();
		obj.m6();

	}

}

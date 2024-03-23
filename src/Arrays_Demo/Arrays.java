package Arrays_Demo;

public class Arrays {

	public static void main(String[] args) {
		// Arrays:
		/*
		 * //used to store multiple values in single variable
		 * 
		 * int [] arr1=new int [5];//Declaration arr1[0]=10; arr1[1]=20; arr1[2]=30;
		 * arr1[3]=40; arr1[4]=50;
		 * 
		 * //System.out.println(arr1[0]);
		 * 
		 * //to print whole array list System.out.println("List of array: "); for (int
		 * i=0;i<arr1.length;i++) {
		 * 
		 * 
		 * System.out.println(+arr1[i]+",");
		 * 
		 * }
		 * 
		 * 
		 * String [] str=new String[5]; str[0]="Kiran"; str[1]="Sagar"; str[2]="Roshan";
		 * str[3]="Mayur";
		 * 
		 * String [] str1= {"K" ,"I","N"} ;//Declaration & intitialisation
		 * 
		 * for (int i=0;i<str.length;i++) {
		 * 
		 * System.out.println(str[i]); }
		 */

		// Array values divisible by 2:

		int[] arr3 = { 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Length of array is:" + arr3.length);

		for (int i = 0; i < arr3.length; i++) {

			if (arr3[i] % 2 == 0) {
				System.out.println("Array value is divisible by 2: " + arr3[i]);
				break;

			}

			else {

				System.out.println("Array value is not divisible by 2: " + arr3[i]);
			}

		}

	}

}

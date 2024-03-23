package Arrays_Demo;

public class Array_Basics {

	
	
	public static void main(String[] args) {
	
		int [] arr= {10,20,30,40};
		
		System.out.println("Length of array=>"+arr.length);
		
//		for (int i=0;i<=arr.length-1;i++)
//		{
//			
//			System.out.println(arr[i]);
//		}
		
		
		for( int arr1 : arr) {
			
			System.out.println(arr1);
			
		}
		
		
		
		
		
	}

}

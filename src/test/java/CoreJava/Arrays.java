package CoreJava;

public class Arrays {

	public static void main(String[] args) {
		//Array - fixed length
		// Creating an Array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//another way to create arr
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//Retrieving the values
		System.out.println(arr2[3]);
		
		//retrieving by using for loop
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		//Enhanced for loop
		for(int ele:arr2) {
			System.out.print(ele);
		}
		

	}

}

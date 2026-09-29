package ArrayPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linear Search
		int a[] = {20, 10, 15, 80, 3};
		int temp = 0;
		
		for(int i=0; i<a.length-1; i++) {
			
			for(int j=0; j<a.length-i-1; j++) {
				
				if(a[j] > a[j+1]) {
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}

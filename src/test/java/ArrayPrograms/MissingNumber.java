package ArrayPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		
		/*Approach1: if range of the elements is given 
		 * lets say from 1-10
		 * calculate sum1(10n nums) = n*(n+1)/2
		 * calculate the sum2 of given array
		 * result = sum1 - sum2
		 * */
		
		//Approach2: if no range is given		
		int a[] = {7, 9, 10, 11};
		
		for(int i=0; i<a.length-1; i++) {
			
			//every (i+1)th element should be +1 of the 'i'th element
			if(a[i+1] != a[i]+1) {
				System.out.println(a[i]+1);
			}
		}

	}

}

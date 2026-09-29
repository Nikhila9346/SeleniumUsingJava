package ArrayPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 20, 30, 40, 50};
		
		/*for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}*/
		
		//while loop
		int i = a.length-1;
		while(i>=0) {
			System.out.print(a[i] + " ");
			i--;
		}

	}

}

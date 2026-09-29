package ArrayPrograms;

public class NumberOfDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10, 20, 30, 10, 40, 20, 10};
		
		int num = 20;
		int count = 0;
		
		for(int ele:a) {
			
			if(ele == num) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}

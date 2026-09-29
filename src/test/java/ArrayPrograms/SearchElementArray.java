package ArrayPrograms;

public class SearchElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 20, 30, 40, 50};
		
		int searchNum = 80;
		int flag = 0;
		
		for(int ele:a) {
			
			if(ele == searchNum) {
				
				System.out.println("Element found");
				flag = 1;
				break;
				
			}
		}
		if(flag == 0) {
			
			System.out.println("Element not found");
			
		}
	}

}

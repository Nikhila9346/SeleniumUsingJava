package OOPS;

public class ThisKeyword {
	int x, y; //Class-variables/Instance Variables
	
	void setData(int x, int y) {
		this.x = x; //Local Variables
		this.y = y;
	}
	
	void getData() {
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		tk.setData(10, 20);
		tk.getData();
	}

}

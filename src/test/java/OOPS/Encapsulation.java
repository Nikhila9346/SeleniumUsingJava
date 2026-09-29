package OOPS;

public class Encapsulation {
	
	private int accNo;  //variables should be private
	private String name;
	private double amount;

	//getter and setter methods
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		e.setAccNo(111);
		e.setName("Nikhila");
		e.setAmount(987654.3);
		
		System.out.println(e.getAccNo());

	}

}

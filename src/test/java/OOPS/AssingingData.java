package OOPS;

public class AssingingData {
	
	int sid;
	String sname;
	char sgrade;
	
	void printStudentDetails() {
		System.out.println(sid + " "+ sname+ " "+sgrade);
	}
	
	/*
	void studentDetails(int id, String name, char grade) {
		sid = id;
		sname = name;
		sgrade = grade;
	}
	*/
	
	AssingingData(int id, String name, char grade){
		sid = id;
		sname = name;
		sgrade = grade;
	}

	public static void main(String[] args) {
		//3. using constructor
		AssingingData ad1 = new AssingingData(2, "Nikhilaa", 'A');
		ad1.printStudentDetails();
		
//		AssingingData ad = new AssingingData();
		//2. assigning data using a user defined method
		//ad.studentDetails(1, "NIkhila", 'A');

		//1. assigning data using object reference
		/*ad.sid = 1;
		ad.sname = "Nikhila";
		ad.sgrade = 'A';
		*/
		
	}

}

package constructor;

public class Student {
	int id;
	String name;
	
	Student(int stdId,String stdName) {
		id = stdId;
		name =stdName;
	}
	
	void display() {
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student(10, "Maulik");
		//std.setData(10, "Maulik");
		std.display();
	}

}

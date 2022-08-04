package HashCodeinternal;

public class Student {

	String studentName;
	int rollno;
	
	public Student(String studentName, int rollno) {
		this.studentName = studentName;
		this.rollno = rollno;
	}
	
	public int hashCode() {
		int code =0;
		char[] arr = this.studentName.toCharArray();
		for(char ch:arr) {
			code += ch;
		}
		code = code & 15;	
		return code;
		
	}
	
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		return this.studentName.equals(std.studentName) && this.rollno==std.rollno;
	
		
	}
	
	
	
}

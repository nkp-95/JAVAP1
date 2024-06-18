package array;

public class Student {
	private int serialNum;
	private String name;
	
	
	public Student() {}
	
	public Student(int serialNum, String name) {
		this.serialNum = serialNum;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(serialNum + ", " + name);
	}

}

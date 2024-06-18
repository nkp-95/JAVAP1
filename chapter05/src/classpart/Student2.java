package classpart;

public class Student2 {
	//멤버 변수 : 속석
	int studentID; //학번
	String studentName; //학생이름
	int grade; //학년
	String address;
	
	//메서드 : 기능
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.studentName = "이순신";
		studentLee.address = "통영";
		
		studentLee.showStudentInfo();
	}
}

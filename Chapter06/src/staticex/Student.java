package staticex;

public class Student {
	//스태틱 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	public static int serialNum = 1000;  //클래스 변수
	//멤버 변수 = 인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	//메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

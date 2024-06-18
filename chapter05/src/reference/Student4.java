package reference;

public class Student4 {
	//멤버변수
	int studentID;
	String studentName;
	//참조 자료형
	Subject2 korean;
	Subject2 math;
	
	//생성자
	public Student4(int id, String name) {
		studentID = id;
		studentName = name;
		
		korean = new Subject2();
		math = new Subject2();
	}
	//메소드
	public void setKorean(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
		
	}
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	public void showStudentInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
	
	
}

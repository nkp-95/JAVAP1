package reference;

public class Student3 {
	int studentID;
	String studentName;
	//참조 자료형
	Subject korean;
	Subject math;
	
	public Student3() {
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
		
	}
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
	
}

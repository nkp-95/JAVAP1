package array;

public class StudentArray2 {

	public static void main(String[] args) {
		//학생배열
		Student[] students = new Student[3];
		students[0] = new Student(1001, "James");
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");
		//여기에 출력하는 코드와 별도의 student 클래스 작성
		//출력메서드 showStudentInfo()
		
		
		
		
		//2차 배열
		
		String[][] student = new String [3][2];
		
		student[0][0] = "1001";
		student[0][1] = "James";
		
		student[1][0] = "1002";
		student[1][1] = "Tomas";
		
		student[2][0] = "1003";
		student[2][1] = "Edward";
		
	for(int i=0; i<student.length; i++) {
		System.out.printf("ID: %s, 이름: %s\n",student[i][0], student[i][1]);
	}
		
	
	
	}

}

package array;

public class StudentArray {

	public static void main(String[] args) {
		//학생배열
		Student[] students = new Student[3];
		students[0] = new Student(1001, "James");
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");
		
		//여기에 출력하는 코드와 별도의 student 클래스 작성
		//출력메서드 showStudentInfo()
		for(int i=0; i<students.length; i++) {
			students[i].showStudentInfo();
			System.out.println(students[i]);
		}
	}

}

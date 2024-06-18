package staticex;

public class SttudentTest1 {

	public static void main(String[] args) {
		// 정적(static)변수 연습
		Student studentLee = new Student();
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentHong = new Student();
		studentHong.setStudentName("홍길동");
		
		System.out.println(studentLee.serialNum); //둘다 데이터에 있는 student(1000)공유
		System.out.println(studentHong.serialNum);
	}

}

package staticex;

public class Scope {
	/*해당 변수 유효범위[
	 -지역변수(로컬변수) 
	       함수내부에서만 사용       스택메모리   함수호출시 생성, 함수가 끝나면 소멸
	       ex.)public void setStudentName(String studentName) {에서
	        				studentName 변수 지역변수임
	 -멤버변수(인스턴스변수) 
	 	   클래스 멤버변수선언부      힙메모리    인스턴스가 생성될때 힙에 생성
	 	                                   행당인스턴스 참조가 없으면 가비지컬렉터가 수거
	 	   						private이 아니면 다른 클래스에서 사용가능
	 	   
	 -static변수(클래스변수)]       데이터영역     프로그램이 처음 시작할때 생성, 프로그램 종료시 소멸
	 	   static예약어를 사용(필수)
	 	   클래스 내부에 선언 priave이 아니면
	 	   				  클래스 이름으로 사용 가능
	 
	*/
	//스태틱 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	//클래스 메서드: 인스턴스 생성과 상관없이 먼저 생성됨
	public static int serialNum = 1000;  //클래스 변수
	//멤버 변수 = 인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Scope() {
		//학생이 생성될때마다 일련번호 증가
		serialNum = serialNum + 1;  //serialNum++;
		studentID = serialNum; //증가된 값을 학번 인스턴스변수에 대입
	}
	
	//메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//static 메서드 = 클래스 메서드
	public static int getSerialNum() {
		int i = 10;
//		studentName = "이순신";  //오류발생 클래식 메서드 임으로 인스턴스변수 사용불가
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Scope.serialNum = serialNum;
	}
	
//	public static void main(String[] args) {
//		getStudentName();// 인스턴스 메서드 = 멤버함수 -> 오류발생, 사용 불가
//		getSerialNum(); //스태틱 메서드
//	}
}
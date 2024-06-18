package chepter02;

public class BooleanEx {

	public static void main(String[] args) {
		boolean isMarried = true;
		System.out.println(isMarried);
		
		//지역 변수 자료형 추론 (자바 10)
		var num = 10;  //전수형
		var dNum = 10.0;
		var str = "hello";  //자바 1.8(jdk8) 이하에선 에러
	}

}

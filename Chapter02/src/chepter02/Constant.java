package chepter02;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0;
		
		
		//MAX_NUM = 1000;  // 오류발생: 상수는 값을 변경할 수 없음
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}

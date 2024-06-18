package ifexample;

import java.util.Scanner;

public class MultipulIf03 {

	public static void main(String[] args) {
		/*정수 입력 받아 메시지 출력하는 프로그램 작성
		 1 입력: 가위
		 2 입력: 바위
		 3 입력: 보
		 그 외 입력: 보류
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 입력(1/ 2/ 3): ");
		int n = in.nextInt();
		
		in.close();
		
		String result;
		if(n == 1) {
			result = "가위";
		}else if (n == 2) {
			result = "바위";
			
		}else if(n == 3){
			result = "바위";
		}else {
			result = "오류";
		}
		
		System.out.println(n + "은(는) [ " + result +  "] 입니다");
		
		
		
	}

}

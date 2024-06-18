package switchcase;

import java.util.Scanner;

public class _01_switch {

	public static void main(String[] args) {
		/*정수 입력 받아 메시지 출력하는 프로그램 작성
		 1 입력: 가위
		 2 입력: 바위
		 3 입력: 보
		 그 외 입력: 보류
		 */
		int n;
		System.out.print("정수 입력: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		
		
		switch(n) {  //변수 or 조건 => 불가능 
		case 1:
			System.out.println("1은 가위");
			break;
		case 2:
			System.out.println("2는 바위");
			break;
		case 3: 
			System.out.println("3은 보");
			break;
		default:
			System.out.println("오류");
			
		
		}

	}

}

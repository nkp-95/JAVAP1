package ifexample;

import java.util.Scanner;

public class MultipulIf05 {

	public static void main(String[] args) {
		 
		//대문자 입력 -> 소문자 출력
		//소문자 입력 -> 대문자 출력
		//대문자도  소문자X -> "영문자가 아닙니다"출력
		Scanner in = new Scanner(System.in);
		System.out.print("영문자 입력: ");
		char alpha = in.next().charAt(0);//철자 하나만 긁어옴 (철자자리수 선택 가능)
		in.close();
		
		
		// 범위 && 연산자를 쓴다
		if (alpha >= 'a' && alpha <= 'z') {//소문자인 경우?
			//32 는 대문자 소문자 유니코드값 차이
			alpha = (char)(alpha - 32);
			System.out.println("소문자: " + alpha + "=> 대문자: " + (char)(alpha + 32));
		}else if (alpha >= 'A' && alpha <= 'Z') {  //대문자인 경우
			System.out.println("대문자: " + alpha + "=> 소문자: " +(char)(alpha - 32));
		}else
		
		System.out.println("영문자가 아닙니다.");

	}

}

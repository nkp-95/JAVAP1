package switchcase;

import java.util.Scanner;

public class _03_Switchcase {

	public static void main(String[] args) {
		/*
		 문자를 입력 받아 아래의 메시지를 줄력하는 프로그램 작성
		 단 switch문으로 작성 하시오
		 F 또는 f 입력 시: File menu
		 H 또는 h 입력 시: Help menu
		 E 또는 e 입력 시: Edit menu
		 그 외 입력 시 : Error
		 [추력 예]
		 메뉴 코드 입력: H
		 Help menu
		 */
		char code;
		System.out.println("메뉴 코드 입력: ");
		Scanner in = new Scanner(System.in);
		code = in.nextLine().charAt(0);
		in.close();
		if (code >= 'a' && code <= 'z') {// 소문자라면?
			//대문자로 변환
			code = (char) (code - 32); //a(97) -> (char)(97 - 32) -> A
		}
		switch(code) {
		case 'F': 
		//case 'f': 
			System.out.println("File menu\n");
			break;
		case 'H':
		//case 'h': 
			System.out.println("Help menu\n"); 
			break;
		case 'E': 
		//case 'e': 
			System.out.println("Edit menu\n");
			break;
		default:
			System.out.println("Error\n");
		}
		
		
		
	}

}

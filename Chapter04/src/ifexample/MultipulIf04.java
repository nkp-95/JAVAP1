package ifexample;

import java.util.Scanner;

public class MultipulIf04 {

	public static void main(String[] args) {
		/*
		 문자를 입력 받아 아래의 메시지를 줄력하는 프로그램 작성
		 F 또는 f 입력 시: File menu
		 H 또는 h 입력 시: Help menu
		 E 또는 e 입력 시: Edit menu
		 그 외 입력 시 : Error
		 [추력 예]
		 메뉴 코드 입력: H
		 Help menu
		 */
		System.out.println("메뉴 코드 입력: ");
		
		Scanner in = new Scanner(System.in);
		char menu = in.nextLine().charAt(0);
		in.close();
		
		if(menu == 'F' || menu == 'f') {
			System.out.println("File menu");
		}else if(menu == 'H' || menu == 'h') {
			System.out.println("Help menu");
		}else if(menu == 'E' || menu == 'e') {
			System.out.println("Edit menu");
		}else {
			System.out.println("Error");
			}
		
		
		
		
	}

}

package sc;

import java.util.Scanner;

public class _01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("정수 입력:");
		Scanner in = new Scanner(System.in);//ctrl + shift + o              스캐너 시스템=클래스 = 대문자
		// n = 10, n = 150;
		n = in.nextInt();
		
		in.close();// 입력끝 
		System.out.println("입력 받은 정수는" + n + "입니다");// n-> 콘솔에서 입력
		
		
		
	}

}

package chepter03;

import java.util.Scanner;

public class OperationEx5 {

	public static void main(String[] args) {
		// 두 수 입력 받아 조건 연산자 사용
		// 두 수 중 큰 수는 몇입니다
		int a =10;
		int b = 3;
		double re = (double)(a/b);//그냥 답이 소수점 출력
		System.out.println(re);
		
		double d = (double)a / b;//a가 실수로 바뀐경우
		System.out.println(d);
		
		
		
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.print("두 수 입력 (공백구분) :");
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		
		int bigNum;
		bigNum = (num1 > num2) ? num1 : num2;
			//조건 ? 참값 : 거짓값;
	    System.out.println("두 수중 큰 수는 " + bigNum + "입니다");
	}

}

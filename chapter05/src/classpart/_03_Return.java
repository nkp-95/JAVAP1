package classpart;

import java.util.Scanner;

public class _03_Return {
	
	public static void getSum(int x, int y) {
		System.out.println("두수의 합은 "+ (x + y) + "입니다.");
	}

	public static void main(String[] args) {
		// 파라미터 있는 메서드
		Scanner in = new Scanner(System.in);
		System.out.print("두 수 입력: ");
		int n1, n2;
		n1 = in.nextInt();
		n2 = in.nextInt();
		
		in.close();
		
		getSum(n1, n2);  //메서드 호출

	}

}

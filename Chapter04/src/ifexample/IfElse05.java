package ifexample;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		// 주민번호 입력 받아 성별 판별하는 프로그램
		//남자 : 뒷번호 첫 자리가 1 or 3
		//여자 : 뒷번호 첫 자리가 2 or 4
		//출력 예
		//주민 번호 입력(ex.040722- 3042343) : @@@@@@-3@@@@@@다
		//당신은 남자(여자)입니다.
		
		Scanner in = new Scanner(System.in);
		System.out.print("주민 번호 입력(ex.040722- 3042343) :  ");
		char check;
		check = in.nextLine().charAt(7);
		in.close();
		
		if(check == '1' || check == '3') {
			System.out.println("당신은 남자 입니다.");
		}else {
			System.out.println("당신은 여자 입니다.");
		}

	}

}

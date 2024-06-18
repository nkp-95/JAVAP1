package ifexample;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// 국/영/수 점수 입력 ->전과목 60점 이상이면: 합격
		//한과목이라도 미만이면 불합격(한과목이라도 60점 미만)
		
		Scanner in = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수 연속으로 입력(공백으로 구분) :");
		int kor = in.nextInt();
		int eng = in.nextInt();
		int math = in.nextInt();
		in.close();
		
		
//		if(kor >= 60 && eng >= 60 && math >= 60) {  //합격 조건
//			System.out.println("모든 과목이 60점 이상으로 합격 입니다.");
//		}else {
//			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
//		}
		
		if(kor < 60 || eng <60 || math < 60) {  //불합격 조건
			//(!(kor < 60 || eng <60 || math < 60))반대로 조건만든것
			System.out.println("한 과목 이상 60점 미만 불으로 합격 입니다.");
		}else {
			System.out.println("모든과목이 60점 이상으로 합격입니다.");
		}
		
		
	}

}

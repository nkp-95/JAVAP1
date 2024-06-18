package ifexample;

import java.util.Scanner;

public class MultipulIf01 {

	public static void main(String[] args) {
		// 다중 If문
		//국/ 영/ 수 점수를 입력 받아 평균을 구한 후
		//평균이 90점 이상이면 A등급,평균이 80점 이상이면 B등급
		//평균이 70점 이상이면 C등급
		//평균이 60점 이상이면 D등급
		//아니라면 F등급
		
		//[출력 예문] 평균은 %.2f로 %@등급입니다.
		
		Scanner in = new Scanner(System.in);
		int kor,eng, mat;
		
		System.out.print("국어 영어 수학 점수 입력(공백 구분): ");
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		
		
		in.close();
		
		int total = kor + eng + mat;
		double avr = total / 3.0;
		char change = 'F';
		//다중 if문: 여러개 중 한개 선택
		if(avr >= 90) { change = 'A';}
		else if(avr >= 80) { change = 'B';}
		else if(avr >= 70) { change = 'C';}
		else if(avr >= 60) { change = 'D';}
		else { change = 'F';}
		
		System.out.printf("평균은 %.2f점으로 %c등급 입니다.\n", avr, change);
		  

	}

}

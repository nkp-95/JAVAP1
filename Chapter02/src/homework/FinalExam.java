package homework;

public class FinalExam {

	public static void main(String[] args) {
		//2번
		
//		int Num1 = 97;
//		int Num2 = 79;
//		int Num3 = 65;
//		
//		int Num4 = Num1 + Num2 + Num3;
//		double FNum5 = Num4/3.0;
//		System.out.printf("국어 : %d점\n", Num1);
//		System.out.printf("영어 : %d점\n", Num2);
//		System.out.printf("수학 : %d점\n", Num3);
//		System.out.printf("총점 : %d점\n", Num4);
//		System.out.printf("평균 : %.2f점\n", FNum5);
//		System.out.printf("등급 : B");
//		
		
		
		
		int korea = 90;
		int english = 85;
		int math = 75;
		
		int sum;
		double mean;
		char grade = 'B';
		
		sum = korea + english + math;
		mean = sum / 3.0;
		
		System.out.printf("국어: %d점\n영어: %d점\n수학: %d점\n총점: %d점\n평균: %.2f점\n등급: %c",korea, english, math, sum, mean, grade);
	}

}

package homework;

public class SalaryCalc {

	public static void main(String[] args) {
		//1번
		
		final int iNum1 = 1500000; //pay
		final int iNum2 = 700000; //bonus
		double iNum3 = iNum1*(0.1); //tax
		double total=iNum1 + iNum2 - iNum3;//total
		
		System.out.printf("홍길동군의 실급여액은 %.0f원 입니다", total);
		
		
		
		
		
	}

}
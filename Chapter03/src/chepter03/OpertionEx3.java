package chepter03;

public class OpertionEx3 {

	public static void main(String[] args) {
		// 논리연산자: 단락회로 평가 실습
		int num1 = 10;
		int i = 2;
		
		//논리곱 연산에서 앞의 항이 false면 뒤에 항은 연산 안함(필요성X)
		boolean value = ( (num1 = num1 + 10) < 10) && ((i = i + 2) < 10);  
		//false && => false
		System.out.println(value);  // false
		System.out.println(num1);   // 20
		System.out.println(i); // 2, 연산 안됨
		
		//논리합 연산에서 앞의 항이 true면 결과가 참이므로 뒤에 항은 실행하지 않음
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value); //true
		System.out.println(num1); // 30 
		System.out.println(i); // 2, 연산 안됨
		
		int num = 5;
		int j = 10;
		
		boolean val = ((num = num * 10) > 45) || ((j = j - 5) < 10);
		System.out.println(val); // true
		System.out.println(num); // 50
		System.out.println(j); // 10
		
		//복합 대입연산자
		
		System.out.println("복합 대입연산자");
		
		
		
		
		
		
	}

}

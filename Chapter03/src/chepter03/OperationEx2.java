package chepter03;

public class OperationEx2 {

	public static void main(String[] args) {
		// 증가, 감소 연산자
		System.out.println("증가, 감소 연산자");
		int gameScore = 150;
		int level = 10000;
		
		int lastScore1 = ++gameScore; //대입전 1 증가
		//gameScore = gameScore + 1;
		//lastScore = gameScore;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
//		int lastLevel = level++;//대입후 1 증가
//		//lastLevel = level; //10000
//		//level = level + 1 // 10001
//		System.out.println(lastLevel);
//		System.out.println(level);
		
		//int finalLevel = level--;
		int finalLevel = --level;
		System.out.println(finalLevel);
		//관계연산자
		System.out.println("관계연산자");
		int fatherAge = 45;
		int motherAge = 47;
		boolean value;
		value = fatherAge == motherAge;
		
		System.out.println(value); // true / false
		
		//논리연산자
		System.out.println("논리연산자");
		int num1 = 10;
		int num2 = 20;
		boolean flag = (num1 > 0) && (num2 > 0); // T && T flag 는 참
		System.out.println(flag);//true
		
		flag = (num1 < 0) && (num2 > 0); // F && T  flag 는 거짓 논리곱은 둘다 T일때만 참
		System.out.println(flag);//false
		
		flag = (num1 < 0) ||(num2 > 0); //false || true : 논리합은 둘중 하나만이라도 T 면 T
		System.out.println(flag);//true 
		
		flag = !(num1 > 0); //true!->반대로
		System.out.println(flag);//false
		
		
		
	}

}

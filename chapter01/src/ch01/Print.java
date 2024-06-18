
package ch01;

public class Print {

	public static void main(String[] args) {
		// print 와 println, printf
		System.out.print("apple");//문자열
		System.out.println();
		System.out.print("banana");
		System.out.print("orange");
		System.out.println();  //줄바꿈
		System.out.println(5);//정수
		System.out.println(5.897);//실수
		System.out.println('A');//문자
		                   //리터럴
		
		//연산결과
		System.out.println(3 + 5);
		System.out.println(3.9*5.72);
		System.out.println(10 / 3);//정수/정수=정수,몫(소수x)
		System.out.println(10 / 3.0);//정수 연산 실수= 실수
	    System.out.println(10 % 3); //나머지 값 출력 나머지=1
	    System.out.println();
	    System.out.println("덧셈 결과는 " + (3 + 5));
	    System.out.println("뺄셈 결과는 " + (3 - 5));
	    System.out.println("곱셈 결과는 " + 3 * 5 + "입니다");
	    System.out.println("나누기 결과는 " + 3 / 5.0);
	    
	    
	    //printf(format)
	    //%d: decimal : 10정수
	    //%f: float: 실수(소수점 이하 6자리 출력)
	    //%c: character 문자
	    //%s: string: 문자열
	    System.out.printf("곱셈 결과는 %d 입니다.\n", 3 * 5);
	    System.out.printf("%d + %d = %d\n",3, 5, (3+5));
	    
	    System.out.printf("실수는 %f입니다\n", 3.7189);
	    System.out.printf("실수는 %.2f입니다\n", 3.7189);
	    System.out.printf("실수는 %.3f입니다\n", 3.7189);
	    System.out.printf("실수는 %.1f입니다\n", 3.7189);
	    
	    System.out.printf("문자: %c\n", 'T');//문자상수
	    System.out.printf("문자열 %s\n", "write once");
	    System.out.printf(" %.4f * %d\n", 3.7189, 45);
	    System.out.printf("a * b * c =\t" + (3 * 4 * 5) );
	    System.out.println();

	}

}

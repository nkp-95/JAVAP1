package chepter03;

public class OperationEx {

	public static void main(String[] args) {
		//부호연산자
		int num1 = 10;
		int num2 = -num1;//부호연산자는 값을 바꾸지는 않음
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		num1 = -num1;
		System.out.println("음수화된 num1: "+ num1);
		int A = 1;
				
		int B = ++A;
		
		int C = 2;
		
		int D = C++;
		
		
	}

}

package forexample;

public class ForExample01 {

	public static void main(String[] args) {
		//for문 예제
		int i;
		/*
//		for(초기식, 조건식, 증감식) {
//			반복 실행문;
//		}
		for(i = 1; i <= 10; i++) { //증감식: i += 1, ++i, i= i + 1
			System.out.print(i + " ");//f1
		}
		System.out.println();
		System.out.println("i값: "+ i);//f1에서 벗어남
		
		//10부터 1씩 감소~0까지
		for(i=10;i >=0; i--) {
			System.out.print(i + " ");//f2
		}
		System.out.println();
		System.out.println("i값: "+ i);//f2에서 벗어남
		
		//0부터 90까지 10씩 증가하며 출력
		for(i=0;i<=90;i+=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		//0부터 10까지 3의 배수만 출력
		for(i=3; i<=100; i+=3) {
			System.out.print(i + " ");
		}
		
		/*i 끝값: i+9
		   1 ~ 10
		  11 ~ 20
		  21 ~ 30
		  .
		  .
		  .
		  91 ~ 100
		 */
		
//		for(i=1;i<=91;i+=10) {
//			//System.out.println(i + " ~ " + (i + 9) );
//			System.out.printf("%3d ~ %3d\n", i, i+9);
//		}
		/*    i      i=2; i<=9     "2 * " + i + " = " + (2*i)
		  2 * 1 = 2
		  2 * 2 = 4
		  2 * 3 = 6
		  .
		  .
		  .
		  2 * 9 = 18
		 */
//		for(i=1; i<=9;i++) {
//			System.out.printf("2 * %d = %2d\n",i,(2*i));
//		}
		
		//합계를 구할 변수
//		int sum = 0;
//		//100부터 500까지 합계는 []입니다.(1씩 증가)
//		for(i=100;i<=500;i++) {
//			sum = sum + i;
//		}
//		System.out.println("100부터 500까지 합계는 " + sum + "입니다.");
		
		//1 ~ 100까지의 범위에서 3의배수의 합계는 %d입니다.\n
		int sum = 0;
		int totalCnt = 0;
		for(i=3; i<100; i+=3) {  //3의 배수이면서 
			if(i%2 != 0) {  //2의 배수가 아닌 수의 개수와 합계
			System.out.print(i + " ");
			sum += i;
			totalCnt++;
			}
		}
		System.out.println();
		System.out.printf("1 ~ 100까지의 범위에서 3의배수, 2의 배수가 아닌 수의 합계는 %d입니다.\n",sum);
		System.out.printf("1 ~ 100까지의 범위에서 3의배수, 2의 배수가 아닌 수의 개수는 %d입니다.\n",totalCnt);
		
		
		/*
		 * 0도 ~ 100도까지의 섭시온도를 화씨온도로 변환한 표를 작성
		 * 섭시온도는 5도씩 등가하며 출력한다
		 * 
		 * 화씨온도 = (섭씨온도 * 1.8) +32
		 */
		
		
		int c; //섭시온도
		double fa;
		
		for(c=0; c<=100; c+=5) {
			//System.out.println(c);
			fa = (c * 1.8) + 32;
			
			System.out.printf("%-10d => %-10.2f\n", c, fa); //-@ 외쪽으로 @ 만큼 정렬 (반대= +@)
		}
		
		
		
		
		
		
	}

}

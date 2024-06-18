package chepter07;

public class _02_Average {

	public static void main(String[] args) {
		//배열이용 평균 구하기
		int[] num = new int[1000];
		int total = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10);//0~9
			total += num[i];  // 저장된 정수를 누적
			System.out.printf("%4d", num[i]);
//			if(i==9 || i==19 || i==29) {  //10개씩 개행처리
			if(i%10 == 9) {   //10개씩 개행처리
				System.out.println();
			}
			//System.out.println((int)(Math.random()*51) + 50);
			//random() => 0.000.... ~1 사이 함수
			//*100=> 0~99 
			//*41) + 60 => 60~100 (0+60~40+60)
			//*51) + 50 => 50~100 (0+50~50+50)
			//System.out.println((int)(Math.random()*3) + 1);
			//*3) + 1 => 0~2 (0+1 ~ 2+1)
			//더하기 값을 시작값 ~ 최대값은 =(더하기 값 + 곱하기 값) -1
			//곱하기값 = 100 - 50 + 1  = 최대값 - 더하기값 +1
		}
		System.out.println("\n정수 "+ num.length + "평균은 " +
							(double)total/num.length + "입니다.");

	}

}

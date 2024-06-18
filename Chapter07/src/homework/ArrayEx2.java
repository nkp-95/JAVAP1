package homework;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 0~99 사이의 무작위 숫자를 100개 출력 후, 
	    // 구간의 개수를 카운트 하는 프로그램을 작성해 보자.
		int[] num = new int[100];
		int[] count = new int[10];  //count에 넘겨주기

		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*num.length);   //0~ 99
			System.out.printf("%5d",num[i]);
			//여기에 카운팅하는 코드 작성
			if(i%10 == 9) {
				System.out.println();
			}
		}
		for(int j=0; j<count.length; j++) {
			for(int i=0; i<num.length; i++) {
				if(num[i]/10 ==j) {
					count[j] += 1;
				}
			}
		}
		System.out.println("===================================================");
		for(int j=0; j<count.length; j++) {
			
			System.out.printf("%s ~ %s까지의 정수는 %2d개 입니다.\n", j*10, (j*10)+9,count[j]);
			}
		}

	}

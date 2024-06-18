package homework;

public class ArrayEx03 {

	public static void main(String[] args) {
		//로또 당첨번호 출력하기
		int[] lotto = new int[6];
		
		System.out.println("===이번주 당첨 번호===");
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)((Math.random()*45) + 1);  //(0 ~ 44) + 1
			boolean ck = false;
			
			//중복 방지 핵심 로직 작성
			
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					ck = true;
					break;
				}
			}
			if(ck) {
				i--;
			}else {
				System.out.print(lotto[i] + " ");
			}
		}
	}
}



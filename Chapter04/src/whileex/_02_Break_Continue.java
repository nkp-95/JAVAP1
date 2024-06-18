package whileex;

public class _02_Break_Continue {

	public static void main(String[] args) {
		int i = 1;
		while(true) {    //무한루프
			System.out.print(i + " ");
			i++;
			if(i > 10) {
				break; //반복문 탈출
			}
			if(i > 5) {
				continue; //continue조건문 만나면 다음 수행문 스킵
			}			
			System.out.println("@@@@@@@@@@@@@");
		}

	}

}

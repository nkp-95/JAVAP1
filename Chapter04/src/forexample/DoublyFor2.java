package forexample;

public class DoublyFor2 {
		
	public static void main(String[] args) {
        //전자시계
		for(int i=14; i<=23; i++) {    //시간 00 ~ 23
			
			for(int j=0; j<=59; j++) { //분
				System.out.printf("%2d시 %2d분\n", i, j);
				
			}
			System.out.println();
		}
//		int n = 9;
//		for(int i=1; i<=n; i++) {
//			//System.out.println("***");
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}

	}

}

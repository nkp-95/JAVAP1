package forexample;
/*
             i    j  <=starCnt = i
  *          1    1
  **         2    2
  ***        3    3
  ****       4    4
  *****      5    5
  
  
 =============================*/
public class DoublyforStar01 {

	public static void main(String[] args) {
		int starCnt = 1;
		for(int i = 1; i<=5; i++) {
			starCnt = i;
			for(int j = 1; j<=starCnt; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}

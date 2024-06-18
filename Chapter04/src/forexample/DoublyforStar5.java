package forexample;
/*
             i    $    $dCnt     *     sCnt = (2*i)-1
   $$$$*     1    4  = 5-i       1   =  2*i-1   
   $$$***    2    3  = 5-i       3   =  2*i-1 
   $$*****   3    2  = 5-i       5   =  2*i-1 
   $*******  4    1  = 5-i       7   =  2*i-1 
   ********* 5    0  = 5-i       9   =  2*i-1 

 =============================*/
public class DoublyforStar5 {

	public static void main(String[] args) {
		int dCnt = 1;
		int sCnt = 1;
for(int i = 1; i<=5; i++) {
	dCnt = 5-i; //4->3->2->1->0
	sCnt = 2*i -1;
	for(int j = 1; j<= dCnt; j++) {
		System.out.print(" ");
		
	}for(int k = 1; k<=sCnt; k++) {
	System.out.print("*");
	
		}
	System.out.println();
	}
}
}
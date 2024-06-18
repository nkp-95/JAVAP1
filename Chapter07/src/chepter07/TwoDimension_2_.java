package chepter07;

public class TwoDimension_2_ {

	public static void main(String[] args) {
		// 이차원 배열 초기화 하기
//		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println(); //행 출력후 한줄 띄움
//		}
		
		//알파벳 소문자를 13행 2열로 출력하는 프로그램 이차원배열로 구현
//		char[][] alphabets = new char[13][2];
//		char ch = 'a';
//		
//		for(int i=0; i<alphabets.length; i++) {
//			for(int j=0; j<alphabets[i].length; j++) {
//				alphabets[i][j] = ch;
//				System.out.print(alphabets[i][j] + " ");
//				ch++;
//			}
//			System.out.println();
//		}
		
		char[][] alphabetstwo = new char[4][13];
		char al = 'a';
		char al2 = 'A';
		for(int i=0; i<alphabetstwo.length; i++) {
			for(int j=0; j<alphabetstwo[i].length; j++) {
				alphabetstwo[i][j] = al;
				if(i%2 == 1) {
					alphabetstwo[i][j]= al2;
					System.out.print(alphabetstwo[i][j] + " ");
					al2++;
					}else {
				System.out.print(alphabetstwo[i][j] +" ");
				al++;
					}
			
			}
			System.out.println();
		}
		
		
		
		
	}

}

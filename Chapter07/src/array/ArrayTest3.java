package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열 길이만큼 출력하기
		double[] num = new double[5];
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);  //num[0], num[1], num[2].....num[9]
		}
		
	}

}

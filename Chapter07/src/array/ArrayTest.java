package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 초기화하고 출려하기
		//int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};//O   int[] num = new int[10];O    int[] num = new int[10] {1,2,3,4,5,6,7,8,9,10};X  
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);  //num[0], num[1], num[2].....num[9]
		}
		
	}

}

package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// 향상된 for문 사용하기
//		String[] strArray = {"Java", "Android", "C", "JavaScript", "python"};
//		
//		for(String lang : strArray) {
//			System.out.println(lang);
//		}
		
//		int[] numArray = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//for(int i=0; i<numArray.length; i++){
		//System.out.println(numArray[i])
//		for(int lang : numArray) {
//			System.out.println(lang);
//		}
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int num: nums) {
			System.out.println(num);
		}
		

	}

}

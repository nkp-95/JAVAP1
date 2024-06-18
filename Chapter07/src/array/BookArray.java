package array;

public class BookArray {

	public static void main(String[] args) {
		//객체타입의 배열
		//Book클래스 형으로 객체 배열 생성 
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}

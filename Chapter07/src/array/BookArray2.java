package array;

public class BookArray2 {

	public static void main(String[] args) {
		//객체타입의 배열
		//Book클래스 형으로 객체 배열 생성 
		Book[] library = new Book[5];
		library[0] = new Book("태백산맥", " 조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐베리");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		System.out.println();
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}

package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		//얕은 복사
		// 객체 배열 복사하기
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백", "조정래");
		bookArray1[1] = new Book("데미안", "헤세");
		bookArray1[2] = new Book("어떻게", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		//대상배열 출력
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		//원본배열 수정
		bookArray1[0].setBookName("나목");//원본 0번 배열 바뀜
		bookArray1[0].setAuthor("박완서");
		System.out.println("=== bookArray1 ===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		
		
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}

}

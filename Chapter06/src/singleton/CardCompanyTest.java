package singleton;

public class CardCompanyTest {

	public static void main(String[] args) {
		/*카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다.
		 *  06-3의 학번 생성하기〉예제를 참고하여 카드가 생성될 때마다 
		 *  카드 번호가 자동으로 증가할 수 있도록 
		 *  카드 클래스를 만들고 생성해 보세요  
		 */
		//카드회사(싱글톤클래스), 메서드(카드인스턴스)creatCard
		
		CardCompany cardCompany = CardCompany.getInstance();
		
		Card card = cardCompany.createCard();
		Card card1 = cardCompany.createCard();
		
		System.out.println(card.getCardNumber());
		System.out.println(card1.getCardNumber());
	}

}

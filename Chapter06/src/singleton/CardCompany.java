package singleton;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	private CardCompany() {}//[생성자]
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard() {
			//실행할때마다 일련번호 증가
		return  new Card();
	}

}

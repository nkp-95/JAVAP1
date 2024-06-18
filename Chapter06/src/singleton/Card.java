package singleton;

public class Card {
	private int cardNumber;
	private static int cardSerialNum = 1001;
	
	Card (){  //클래스와 똑같은 이름(대문자)  소문자로 해버리면 void필요(void 들어가면 그냥 메서드로 인식[작동은 됨])
		cardSerialNum++;
		cardNumber = cardSerialNum;
	}
	public int getCardNumber() {
		
		return cardNumber;
	}

}

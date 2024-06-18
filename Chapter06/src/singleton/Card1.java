package singleton;

public class Card1 {
	private int cardNumber;
	private static int cardSerialNum = 1001;
	
	Card1 (){
		cardSerialNum++;
		cardNumber = cardSerialNum;	
	}
	public int getCardNumber() {
		
		return cardNumber;
	}

}

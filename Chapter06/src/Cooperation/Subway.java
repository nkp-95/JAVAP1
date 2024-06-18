package Cooperation;

public class Subway {
	//멤버변수
	String linenumber;  //노선
	int passengerCount; //승객수
	int money; //지하철 수입
	
	//생성자
		public Subway(String linenumber) {
			this.linenumber = linenumber;
		}
	
	
	
	

	public void take(int money) {
		this.money += money;  //지하철 수익 증가
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println("버스 "+ linenumber + "번의 승객은 "+
					passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

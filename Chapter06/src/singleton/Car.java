package singleton;

public class Car {
	//클래스 변수
	private static int serialNum = 10000;
	//멤버 변수 = 인스턴스 변수
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
}

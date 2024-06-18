package singleton;

public class CarFactory {
	private static  CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory(); //방어코드
		}
		return instance;
		
	}

	public Car createCar() {
//		Car car = new Car();  //***
//		return car;
		
		return new Car();// 윗줄이랑 같은 내용
	}
}

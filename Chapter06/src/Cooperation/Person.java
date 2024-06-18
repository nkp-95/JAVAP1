package Cooperation;

public class Person {
	//멤버 변수
	public String name;
	public int money;
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//메서드
	public void buyStarCoffee(StarCoffee starCoffee, int pay) {
		String msg = starCoffee.brewing(pay);
		if(msg != null) {
			System.out.println(name + "님이 " + pay + "원을 내고 " + msg);
			this.money -= pay;
		}
	}

	public void buyBeanCoffee(BeanCoffee beanCoffee, int pay) {
		//BeanCoffee beanCoffee = new BeanCoffee();
		//A a = new A();
		
		String msg = beanCoffee.brewing(pay);		
		System.out.println(name + "님이 콩다방에서" + pay + "원을 내고 " + msg);		
	}
	

}

package Cooperation;

public class DrinkCoffee {

	public static void main(String[] args) {
		//김씨는 4000원을 내고 별다방에서 아메리카노를 사 마셧습니다.
		//이씨는 콩다방에서 4500원을 내고 라데를 사 마셨습니다.
		Person kim = new Person("Kim", 10000);
		StarCoffee starCoffee = new StarCoffee();
		kim.buyStarCoffee(starCoffee, 4000);
		
		Person lee = new Person("Lee", 100000);
		BeanCoffee beanCoffee = new BeanCoffee();
		lee.buyBeanCoffee(beanCoffee, 4500);

	}


}

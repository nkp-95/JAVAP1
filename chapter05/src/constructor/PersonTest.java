package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// 생성자 실습
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		
		Person personLee = new Person("이순신", 175, 75);
		
		//생성자 오버로딩(한개 클래스에 생성자 여러개)
		Person personKang = new Person("강감찬");
		
	}

}

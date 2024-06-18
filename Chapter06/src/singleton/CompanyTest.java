package singleton;

public class CompanyTest {

	public static void main(String[] args) {
//		Company myCompany1 = new Company();
//		Company myCompany2 = new Company();
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);   //같으면 인스턴스 1개라는뜻: true
		
	}

}

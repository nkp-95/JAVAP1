package chepter02;

import java.math.BigDecimal;

public class DoudleEx2 {

	public static void main(String[] args) {
//		double dnum = 1;
//		
//		for(int i=0; i<10000; i++) {
//			dnum = dnum + 0.1;
//		}
//		
//		System.out.println(dnum);
//-----------------------------------
//		1001.000000000159
		
		BigDecimal dnum = new BigDecimal("1");
		BigDecimal addNum = new BigDecimal("0.1");
		
		for(int i=0; i<10000; i++) {
			dnum = dnum.add(addNum);
		}
		
		System.out.println(dnum);
		//1001.0
	}

}

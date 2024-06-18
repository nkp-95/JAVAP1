package homework;

import java.util.Scanner;

/*
 * 섭씨(C) 를 화씨(F)로 변환하는 메서드
 *  화씨(F)온도 = (섭씨(C)온도*1.8) + 32
 *  CelToFah(celtofah)메서드 : 섭시를 화씨로 변환한후 리턴한후 메서드
 *  
 *  실행 예)
 *  섭씨 입력: 100
 *  섭씨온도 100=> 212도
 */

public class Homework03 {

	//섭씨(C) 를 화씨(F)로 변환하는 메서드
	public static double CelToFah(int celsius) {
		double fah;
		fah = (celsius*1.8)+32;
		return fah;
	}
	
	public static void main(String[] args) {
		int celsius;
		Scanner in = new Scanner(System.in);
		System.out.print("섭씨 입력: ");
		celsius = in.nextInt();
		
		System.out.printf("섭씨 %d도 -> %.0f도\n", celsius, CelToFah(celsius));
		in.close();
		

	}

}

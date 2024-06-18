package whileex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 코스모 소개 프로그램 실습과제
		Scanner in = new Scanner(System.in);
		//메뉴는 반복되고 중지가능해야 하므로 조건변수 정함
		boolean inMainMenu =true;
		
		while(inMainMenu) {
			System.out.println("(I)ntro (C)oures (E)xit : ");
			//String 형태로 입력받음
			switch(in.next()) {
			case "I":
			case "i":
				System.out.println("안녕하세요! 우리는 코스모 입니다.\r\n"
						+"함께 공부합니다.");
				break;
			case "C":
			case "c":
				boolean inCouresMenu = true;
				while(inCouresMenu) {
					System.out.println("코스모 수업을 소개 합니다.\r\n"
							+ "(J)ava (S)QL (P)yhon (B)ack");
					switch(in.next()) {
					case "J":
					case "j":
						System.out.println("java의 기본 문법과 객체지향 프로그램밍을 배웁니다.\r\n" 
					+ "강사: 엄호식\r\n"
					+ "추천 선수과목: 타이핑");
						break;
					case "S":
					case "s":
						System.out.println("최신 SQL 언어를 통해 데이터를 분석할수 있습니다.\r\n"
								+ "강사: 성시경\r\n"
								+ "추천 선수과목: java");
						break;
					case "P":
					case "p":
						System.out.println("Python 언어를 통해 데이터 기초를 배웁니다\r\n"
								+"강사: 강영훈\r\n"
								+"추천 선수과목: java, SQL");
						break;
					case "B":
					case "b":
						inCouresMenu = false;
						break;
						default:
							System.out.println("다시 입력해주세요.");
					}
				}
				
				
				
				
				break;
			case "E":
			case "e":
				System.out.println("안녕히 가세요.");
				inMainMenu = false;
				break;
			default:
				System.out.println("I 나 C 또는 E 를 입력해 주세요.");
			}
		}
		
		
		
		
		
		
		
		in.close();

	}

}

package test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Service {

	private Scanner sc = new Scanner(System.in);
	private List<Test> TestList = new ArrayList<Test>(); 

	public Service() { 
		
		TestList.add(new Test("\r\n"
				+ "		 1.변수 (Variable)\r\n"
				+ "		  - 메모리(RAM)에 값을 기록하는 공간\r\n"
				+ "		  	-> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.\r\n"
				+ "		  \r\n"
				+ "		  - 변수는 여러 종류 존재 (저장되는 값의 형태, 크기가 다름)\r\n"
				+ "		  \r\n"
				+ "		  변수 사용의 장점\r\n"
				+ "		  1. 가독성 증가\r\n"
				+ "		  2. 재사용성 증가(한번 만든 변수를 계속 사용)\r\n"
				+ "		  3. 코드 길이 감소\r\n"
				+ "		  4. 유지보수성 증가(코드 수정이 간단해짐)\r\n"
				+ "\r\n"
				+ "		  논리형 변수 선언\r\n"
				+ "		  boolean isTrue \r\n"
				+ "\r\n"
				+ "		  정수형 변수 선언\r\n"
				+ "		  byte bNum, short sNum\r\n"
				+ "		  int iNum, long iNum\r\n"				
				+ "\r\n"
				+ "		  문자형 변수 선언\r\n"
				+ "		  char ch\r\n"
				+ "\r\n"
				+ "		  문자열 변수 선언\r\n"
				+ "		  String str \r\n"
				+"\r\n"
				+"		  실수형 변수 선언\r\n"
				+"		  float fNum, double dNum\n"));
		TestList.add(new Test("01 변수용 공란2") );
		
		TestList.add(new Test("02 연산자용 공란1") );
		TestList.add(new Test("02 연산자용 공란2") );
		
		TestList.add(new Test("03 제어문용 공란1") );
		TestList.add(new Test("03 제어문용 공란2") );
		
		TestList.add(new Test("04 배열용 공란1") );
		TestList.add(new Test("04 배열용 공란2") );
		
		TestList.add(new Test("05 2차원배열용 공란1") );
		TestList.add(new Test("05 2차원배열용 공란2") );
		
		TestList.add(new Test("06 oop용 공란1") );
		TestList.add(new Test("06 oop용 공란2") );
		
		TestList.add(new Test("07 객체배열용 공란1") );
		TestList.add(new Test("07 객체배열용 공란2") );
		
		TestList.add(new Test("08 상속용 공란1") );
		TestList.add(new Test("08 상속용 공란2") );
		
		TestList.add(new Test("09 다형성용 공란1") );
		TestList.add(new Test("09 다형성용 공란2") );
		
		TestList.add(new Test("10 예외처리 공란1") );
		TestList.add(new Test("10 예외처리 공란2") );
		
		TestList.add(new Test("11 컬렉션 공란1") );
		TestList.add(new Test("11 컬렉션 공란2") );

		
	}

	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("1.변수   2. 연산자  3. 제어문  4. 배열  5. 2차원 배열");
			System.out.println("6.OOP    7. 객체배열  8. 상속  9. 다형성  10. 예외처리");
			System.out.println("11.컬렉션");
			
			System.out.println("\n 직접 검색 98,99  조회100");
			System.out.print("-> 입력 : ");
			
			try {
				
				menuNum = sc.nextInt(); 
				System.out.println();
					
				switch(menuNum) {
				case 1 : Variable(); break;
				case 2 : Operator(); break;
				case 3 : Condition(); break;
				case 4 : Array(); break;
				case 5 : Array2(); break;
				case 6 : Oop(); break;
				case 7 : OopArray(); break;
				case 8 : Inheritance(); break;
				case 9 : Polymorphism(); break;
				case 10 : Exception(); break;
				case 11 : Collection(); break;
				case 0 : System.out.println("프로그램 종료.."); break;
				case 98 : searchName1(); break;
				case 99 : searchName2(); break;
				case 100 : selectAll(); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}

				
			} catch(InputMismatchException e) {
				System.out.println("\nerror: 입력형식이 유효하지 않습니다. 다시 시도해주세요");
				
				sc.nextLine(); 
				menuNum = -1; 
			}
			
			
		} while(menuNum != 0);
		
	}
	
	
//------------------------------------------------------------------------------
	public void Variable() {
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
		int input = -1;
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(0)); break;
			case 2 :System.out.println(TestList.get(1)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Operator() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(2)); break;
			case 2 : System.out.println(TestList.get(3)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Condition() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(3)); break;
			case 2 : System.out.println(TestList.get(4)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(6)); break;
			case 2 : System.out.println(TestList.get(7)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Array2() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			input = sc.nextInt();
			switch(input) {
			case 1 : System.out.println(TestList.get(8)); break;
			case 2 : System.out.println(TestList.get(9)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Oop() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(10)); break;
			case 2 : System.out.println(TestList.get(11)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void OopArray() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(12));; break;
			case 2 : System.out.println(TestList.get(13)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Inheritance() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(14)); break;
			case 2 : System.out.println(TestList.get(15)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Polymorphism() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = -1;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(16)); break;
			case 2 : System.out.println(TestList.get(17)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Exception() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(18)); break;
			case 2 : System.out.println(TestList.get(19)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
	public void Collection() {
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(TestList.get(20)); break;
			case 2 : System.out.println(TestList.get(21)); break;
			case 0 : System.out.println("처음으로 (0번 돌아가기)"); break;
			default : System.out.println("재입력");
			}
		}
	}
//------------------------------------------------------------------------------
	public void selectAll() {
		
		System.out.println("====== 키값 전체 조회 ======");
		if(TestList.isEmpty()) { 
			System.out.println("학생 정보가 없습니다.");
			return; 
		}
	
		int index = 0;
		
		for(Test std : TestList ) {
			System.out.print( "---- "+(index++) + " 번 ------------------------------------------\n");
			System.out.println( std );
			System.out.print( "----------------------------------------------------\n");
		}
		
	}
	public void searchName1() {
		System.out.print("검색할 이름 입력 : ");
		String input = sc.next();
		
		boolean flag = true;
		
		for(Test std : TestList) {
			
			if( input.equals(std.getName()) ) { 
				System.out.println( std ); 
				
				flag = false;
			}
		
		}
		
		if(flag) {
			System.out.println("검색 결과 없음");
		}
		
	}
	public void searchName2() {
		System.out.print("포함되는 검색어 : ");
		String input = sc.next();
		
		boolean flag = true;
		
		for(Test std : TestList) {
	
			if( std.getName().contains(input) ) { 
				System.out.println( std ); 
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("검색 결과 없음");
		}
		
	}
//------------------------------------------------------------------------------
	
	
}

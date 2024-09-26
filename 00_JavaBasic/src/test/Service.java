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
				+ "		   - 메모리(RAM)에 값을 기록하는 공간\r\n"
				+ "		    	-> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.\r\n"
				+ "		  \r\n"
				+ "		   - 변수는 여러 종류 존재 (저장되는 값의 형태, 크기가 다름)\r\n"
				+ "		  \r\n"
				+ "		     변수 사용의 장점\r\n"
				+ "		        1. 가독성 증가\r\n"
				+ "		        2. 재사용성 증가(한번 만든 변수를 계속 사용)\r\n"
				+ "		        3. 코드 길이 감소\r\n"
				+ "		        4. 유지보수성 증가(코드 수정이 간단해짐)\r\n"
				+ "\n돌아가기 0. 입력"));

		
		TestList.add(new Test("\r\n"
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
				+"		  float fNum, double dNum\n"
				+"\n돌아가기 0. 입력"));
		
		
		TestList.add(new Test("\r\n"
				+ "		 2.연산자 (Operator)\r\n"
				+ "		   프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산(operation)이라 한다.\r\n"
				+ "		   연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.\r\n"
				+ "		   연산되는 데이터는 피연산자(operand)라고 한다. 예) 산술연산 +, -, *, /, %\r\n"
				+ "		  \r\n"
				+ "		   연산자의 종류\r\n"
				+ "		  \r\n"
				+ "		     증감연산자           ++, --            1순위\r\n"
				+ "		       증감연산자는 피연산자의 값을 1씩 증가 또는 감소시키는 연산자이다\r\n"
				+ "		       증감 연산자가 변수 앞에 위치하느냐 변수 뒤에 위치하느냐에 따라 결과 값이 달라진다.\r\n"
				+ "		  \r\n"
				+ "		     산술연산자        +, -, *, /, %        2순위\r\n"
				+ "		       가장 기본의 4칙 연산(+, -, *, /)과 나머지 값을 구하는 나머지 연산자(%)가 있다.\r\n"
				+ "		  \r\n"
				+ "		     시프트 연산자      >>, <<, >>>         3순위\r\n"
				+ "		       bit단위의 연산처리를 하며 자료의 가공을 위해 오른쪽 또는 왼쪽으로 이동하여 값에 대한\r\n"
				+ "		       변화를 일으키는 연산자 이다.\r\n"
				+ "		  \r\n"
				+ "		     비교 연산자    >, <. >=, <=, ==, !=    4순위\r\n"
				+ "		       변수나 상수의 값을 비교할 때 쓰이는 연산자로서 결과가 항상 true 또는 false인\r\n"
				+ "		       논리값(boolean)이어야 한다.\r\n"
				+ "		  \r\n"
				+ "		     비트 연산자         &, |, ^, ~    ~만 1순위, 나머지는 5순위\r\n"
				+ "		       피연산자 즉 연산의 대상이 되는 값들을 내부적으로 bit단위로 변경한 후\r\n"
				+ "		       연산을 수행하는 연산자이다.\r\n"
				+ "		  \r\n"
				+ "		       피연산자의 값이 true나 false인 논리 값을 가지고 다시 한번 조건 연산하는 연산자이다.\r\n"
				+ "		  \r\n"
				+ "		     조건(삼항) 연산자        ?, :          7순위\r\n"
				+ "		       하나의 조건을 정의하여 만족 시에는 ‘참값’을 반환하고 만족하지 못할 시에는 ‘거짓값’을\r\n"
				+ "		       반환하여 단순 비교에 의해 변화를 유도하는 연산자이다.\r\n"
				+ "		       피연산자가 3개라 해서 삼항 연산자라고도 부른다.\r\n"
				+ "		  \r\n"
				+ "		     대입 연산자    =, *=, /=, %=, +=, -=   8순위\r\n"
				+ "		       상수 값이나 변수 값 또는 객체를 변수에 전달하여 기억시킬 때 사용하는 연산자이다.\r\n"
				+ "\n돌아가기 0. 입력"));
		
		TestList.add(new Test("\r\n"
				+ "		     증감연산자           ++, --            1순위\r\n"
				+ "		       x++;, ++x;, x--;, --x;\r\n"
				+ "		  \r\n"
				+ "		     산술연산자        +, -, *, /, %        2순위\r\n"
				+ "		       사칙연산 그대로.\r\n"
				+ "		  \r\n"
				+ "		     시프트 연산자      >>, <<, >>>         3순위\r\n"
				+ "		       >>	bit값을 오른쪽으로 이동 (빈 자리는 부호값으로 대입) 한다.\r\n"
				+ "		       <<	bit값을 왼쪽으로 이동 (빈 자리는 0으로 대입) 한다..\r\n"
				+ "		       >>>	bit값을 오른쪽으로 이동 (빈 자리는 0으로 대입) 한다.\r\n"
				+ "		             x >> n = \" + (x >> n)); // 나눗셈, (x / 2^n)\r\n"
				+ "		  \r\n"
				+ "		     비교 연산자    >, <. >=, <=, ==, !=    4순위\r\n"
				+ "		       등부호 그대로\r\n"
				+ "		  \r\n"
				+ "		     비트 연산자         &, |, ^, ~    ~만 1순위, 나머지는 5순위\r\n"
				+ "		       피연산자 즉 연산의 대상이 되는 값들을 내부적으로 bit단위로 변경한 후\r\n"
				+ "		       연산을 수행하는 연산자이다.\r\n"
				+ "		  \r\n"
				+ "		       피연산자의 값이 true나 false인 논리 값을 가지고 다시 한번 조건 연산하는 연산자이다.\r\n"
				+ "		  \r\n"
				+ "		     조건(삼항) 연산자        ?, :          7순위\r\n"
				+ "		       하나의 조건을 정의하여 만족 시에는 ‘참값’을 반환하고 만족하지 못할 시에는 ‘거짓값’을\r\n"
				+ "		       반환하여 단순 비교에 의해 변화를 유도하는 연산자이다.\r\n"
				+ "		       피연산자가 3개라 해서 삼항 연산자라고도 부른다.\r\n"
				+ "		  \r\n"
				+ "		     대입 연산자    =, *=, /=, %=, +=, -=   8순위\r\n"
				+ "		       상수 값이나 변수 값 또는 객체를 변수에 전달하여 기억시킬 때 사용하는 연산자이다.\r\n") );
		
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
	// 
	
	
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("1.변수   2. 연산자  3. 제어문  4. 배열  5. 2차원 배열");
			System.out.println("6.OOP    7. 객체배열  8. 상속  9. 다형성  10. 예외처리");
			System.out.println("11.컬렉션");
			
			System.out.println("\n 단어포함 검색 99  인덱스 조회100");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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
		System.out.println("1. 정의보기  2. 문법보기   0. 처음으로");
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

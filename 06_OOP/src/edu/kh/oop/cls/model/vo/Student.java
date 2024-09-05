package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
//[접근제한자] [예약어] class 클래스명
	
	// 접근제한자 public : 같은 프로젝트 내에서
	//                     어떤 클래스에서든 import 할 수 있음을 나타냄.
	//                  == 어떤 패키지에서든(전체)
	
	// 1. 필드(field) : 객체의 속성을 작성하는 클래스 내부 영역
	// == 멤버 변수 : 메서드 밖에 작성된 변수
	
		// 인스턴스 변수 : 필드에 작성되는 일반 변수
		// ex) private int age;
	
		// 클래스 변수(== static 변수) : 필드에 static 예약어가 작성된 변수
		// ex) public static String schoolName;

	
	// 필드 접근제한자 예제
	// 필드의 접근 제한자 뜻 : 직접 접근 가능한 범위를 나타냄
	
	public int v1 = 10;    // 전체에서 접근가능
	protected int v2 = 20; // 후손클래스내까지 가능
	int v3 = 30;	// (default) 같은패키지내까지 가능
	private int v4 = 40; // 해당클래스내부만 가능
	
	// final 예약어 
	private final int TEMP1 = 100;
		
	// static 예약어
	public static String schoolName = "KH고등학교";
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//-------------------------
	

	// getter 만 만들어진 이유 : final 예약어가 붙은 TEMP1은 상수
	// 재대입 불가함(==setter 굳이 X)
	public int getTEMP1() {
		return TEMP1;
	}

	// 접근제한자 예제
	public void ex() {
		// 클래스 접근제한자 확인하기
		TestVO test = new TestVO(); // 같은패키지에서만 접근가능
		
		// 필드 접근제한자 확인하기
		// v1~v4 까지 전부 Student 클래스 내부에서 생성된 변수이기 때문에
		// 같은클래스 내부인 이곳에서 직접 접근 가능
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}
	
	
	// 2. 생성자(constructor)
	/*
	 * - new 연산자를 통해서 객체를 생성할 때
	 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
	 * 
	 * - 생성자 작성 규칙
	 *  1) 생성자의 이름은 반드시 클래스명과 같아야 한다.
	 *  2) 반환형이 존재하지 않는다.
	 *  
	 * - 생성자 종류
	 * 1) 기본 생성자
	 * 2) 매개변수 생성자
	 * 
	 * 
	 * 
	 * */
	
	
	// 기본생성자
	// [접근제한자] 클래스명() {} 
	public Student() {
		// 객체가 생성될 때 수행할 코드
		System.out.println("기본생성자에 의해서 Student 객체 생성");
	} 
	
	
	
	
	
	
	
	
	// 3. 메서드
	
	
	
	
}

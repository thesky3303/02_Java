package newbie;

import java.util.Scanner;

public class Newbie {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		int input = 99;
		
		while( input != 0 ) { 
			
			System.out.println("1.변수   2. 연산자  3. 제어문  4. 배열  5. 2차원 배열");
			System.out.println("6.OOP    7. 객체배열  8. 상속  9. 다형성  10. 예외처리");
			System.out.print("-> 입력 : ");
			input = sc.nextInt();
			
			switch(input) {
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
			case 0 : System.out.println("종료"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Variable() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Variable1(); break;
			case 2 : db.Variable2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Operator() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Operator1(); break;
			case 2 : db.Operator2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Condition() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Condition1(); break;
			case 2 : db.Condition2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Array() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Array1(); break;
			case 2 : db.Array2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Array2() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Array21(); break;
			case 2 : db.Array22(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Oop() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Oop1(); break;
			case 2 : db.Oop2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void OopArray() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.OopArray1(); break;
			case 2 : db.OopArray2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Inheritance() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Inheritance1(); break;
			case 2 : db.Inheritance2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Polymorphism() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Polymorphism1(); break;
			case 2 : db.Polymorphism2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	public static void Exception() {
		Scanner sc = new Scanner(System.in);
		Data db = new Data();
		System.out.println("1. 예제보기  2. 정의보기   0. 처음으로");
		int input = 99;
		
		while( input != 0 ) { 
			
			input = sc.nextInt();
			
			switch(input) {
			case 1 : db.Exception1(); break;
			case 2 : db.Exception2(); break;
			case 0 : System.out.println("처음으로"); break;
			default : System.out.println("재입력");
			}
		}
	}
	
	
	
	
	
	
	
	
	
}

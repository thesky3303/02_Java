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
			System.out.println("11.Collection");
			
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
			case 11 : Exception(); break;
			case 0 : System.out.println("종료"); break;
			default : System.out.println("재입력");
			}
		}
	}
	

	

	

	
	
	

	

	

	

	

	
	
	
	
	
	
	
	
	
}

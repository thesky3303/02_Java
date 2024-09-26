package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

	private List<Model> Action = new ArrayList<Model>();
	
	public Service() {
		
		Action.add(new Model("놀기",10));
		Action.add(new Model("자기",60));
		Action.add(new Model("먹기",50));
		Action.add(new Model("놀기2",-10));
		Action.add(new Model("놀기3",20));
	}
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void displaymenu() {
		int menuNum = 0;
		do {
		System.out.println("-- 공부시키기 --");
		System.out.println("1. 자동 실행 해보기");
		System.out.println("2. 직접 실행하기 ");
		System.out.println("3. 전체 행동표 조회 ");
		System.out.println("4. 행동 추가 하기 ");
		System.out.println("5. 행동 삭제 하기 ");
		
		System.out.print("\n입력 : ");
		
		try {
			
			menuNum = sc.nextInt();
			switch (menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
			}

		} catch (Exception e) {
			System.out.println("알맞은 입력을 해라...(경고)..");
			e.printStackTrace();
			sc.nextLine(); 
			menuNum = -1;
		}
		
	} while (menuNum != 0);
		
	}

	public void method1() throws Exception{
		int index = 1;
		for(Model Action : Action) {
			index++;
			System.out.println(Action.getKnow());
		}
		
	}
	
	public void method2() throws Exception{
	}
	
	
	public void method3() throws Exception{
		int index = 1;
		for(Model Action : Action) {
			System.out.println(index + ". " + Action);
			index++;
		}
	}
	
	public void method4() throws Exception{
	}
	
	public void method5() throws Exception{
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

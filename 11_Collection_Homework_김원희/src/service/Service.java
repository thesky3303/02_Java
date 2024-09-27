package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

	private List<Model> Action = new ArrayList<Model>();
	
	public Service() {
		
		//순서명 : 행동명, 지식증감수치,  건강증감수치, 행복증감수치, 행동설명
		
		Action.add(new Model("먹기",0,0,30," 은/는 먹기를 선택하여 기분만 매우 좋아졌다"));   
		Action.add(new Model("휴식",0,25,0," 은/는 휴식하여 건강상태만 좋아졌다"));
		Action.add(new Model("잠자기",0,30,30," 은/는 잠자기를 선택하여 기분과 건강상태가 매우 좋아졌다"));
		
		Action.add(new Model("잠깐 놀기",-5,-5,5," 은/는 잠깐 놀아서 기분이 조금 좋아졌다"));
		Action.add(new Model("놀기",-10,-10,10," 은/는 놀았기 때문에 성취도가 낮아졌다"));
		Action.add(new Model("격하게 놀기",-20,-20,20,"은/는 격하게 놀아서 성취도가 매우 낮아졌다"));
		
		Action.add(new Model("잠깐 공부하기",5,-5,-5," 은/는 잠깐 공부하는건 안하는게 나은거 같다"));   
		Action.add(new Model("공부하기",10,-10,-10," 은/는 공부를 하여 지식이 늘어났다."));
		Action.add(new Model("격하게 공부하기",30,-20,-20," 은/는 집중하여 공부를 하였다"));
		Action.add(new Model("카페에서 공부하기",5,0,0," 은/는 카페에서 공부하여 지식이 조금 늘었다"));
		Action.add(new Model("학원에서 공부하기",20,0,0," 은/는 학원에서 지식이 많이 늘었다"));
		Action.add(new Model("집에서 공부하기",5,0,0," 은/는 집에서 지식이 조금 늘었다"));
		
	}
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void displaymenu() {
		int menuNum = 0;
		do {
		System.out.println("-- 수강몬 공부시키기 --");
		System.out.println("1. 자동 실행 해보기");
		System.out.println("2. 전체 행동표 조회 ");
		System.out.println("3. 행동 추가 하기 ");
		System.out.println("4. 행동 수정 하기 ");
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
		System.out.print("\n실행횟수 : ");
		int count = sc.nextInt();          // 반복횟수를 받을 스캐너

		int random = 0;           // 성취도 보조수단(다중결과)   
		int max =0;              // 성취도 보조수단(다중결과)
		
		int days = 0;					 // 행동날짜
		
		int knowledge = 50;             // 학업 성취도
		String k1 = null;	     // 출력수단(문자)
		int k2 = 0;              // 출력수단(정수)
		
		int fatigue = 80;               // 피로도
		String f1 = null;              // 출력수단(문자)
		int f2 = 0;                   // 출력수단(정수)
		
		int happy = 30;                 // 감정
		String h1 = null;               // 출력수단(문자)
		int h2 = 0;                     // 출력수단(정수)
		
		
		String name = "수강몬";			// 이름
		String exp = null;              // 행동 설명용

		String result = null;         // 결과용 1
		String result2 = null;         // 결과용 2
		

		
		System.out.println("\n초기값 " + "건강상태 : " + fatigue + " 학업성취도 : " + knowledge + " 행복도 : " + happy+"\n");
		
		for(int i=0; i<count; i++) {
			
			days++;										// 날짜 증가
			max = Action.size();						// 랜덤 선택용
			random = (int)(Math.random() * max); 		// 랜덤 선택용
			
			
			k2 = Action.get(random).getKnow();    // 성취도 수치화
			knowledge = knowledge += k2;          // 증감된 성취도 기록용
			
			
			h2 = Action.get(random).getFeel();
			happy = happy += h2;   
			
			f2 = Action.get(random).getFatigue();
			fatigue = fatigue += f2;   
			
			exp = Action.get(random).getExplanation(); // 설명  랜덤 변환된거 받아오기
			
			
			if(knowledge > 131) {
				k1 = "뛰어남";
				System.out.println(name+" 은(는) 시험 결과가 매우 좋을것이다.");
			}
			
			if(knowledge >= 100 && knowledge < 130) {
				k1 = "좋음";
			}
			
			else if(knowledge >= 70 && knowledge < 100) {
				k1 = "보통";
			}
			
			else if(knowledge >= 31 && knowledge < 70) {
				k1 = "나쁨";
				System.out.println(name+" 은(는) 시험 결과가 나빠 보인다.");
			}
			else if(knowledge <= 30) {
				k1 = "매우나쁨";
				System.out.println(name +" 은(는) 시험 결과가 매우 나빠보인다.");
			}
			
			
			
			
			if(happy > 131) {
				h1 = "매우 행복함";
			}
			
			if(happy >= 100 && happy < 130) {
				h1 = "행복함";
			}
			
			else if(happy >= 70 && happy < 100) {
				h1 = "보통";
			}
			
			else if(happy >= 31 && happy < 70) {
				h1 = "불행함";
			}
			else if(happy <= 30) {
				h1 = "매우 불행함";
			}
			
			
			
			if(fatigue > 131) {
				f1 = "뛰어남";
				System.out.println(name+" 은(는) 더이상 휴식이 필요 없어보인다.");
			}
			
			if(fatigue >= 100 && fatigue < 130) {
				f1 = "좋음";
			}
			
			else if(fatigue >= 70 && fatigue < 100) {
				f1 = "보통";
			}
			
			else if(fatigue >= 31 && fatigue < 70) {
				f1 = "나쁨";
				System.out.println(name+" 은(는) 휴식이 필요해보인다.");
			}
			else if(fatigue <= 30) {
				f1 = "매우나쁨";
				System.out.println(name +" 은(는) 휴식이 절실하다.");

			}
			
			System.out.println("\n  " + name + "의 상태");
			System.out.println("┌  " + name + exp);
			
			System.out.printf("└  %d일째  건강상태 : %s  학업성취도 : %s  행복도 : %s \n\n",days,f1,k1,h1);
		}
		
		
		if ( fatigue >= 131 && happy >= 131 && knowledge >= 131)
			{ result = "뭐임 어케키움;;;";}
		
		else if	( knowledge >= 100) 
			{ result = "S급 수강몬";}
		
		else if	( knowledge >= 90) 
		{ result = "A급 수강몬";}
		
		else if	( knowledge >= 80) 
		{ result = "B급 수강몬";}
		
		else if	( knowledge >= 70) 
		{ result = "C급 수강몬";}
		
		else if	( knowledge >= 60) 
		{ result = "D급 수강몬";}
		
		else if	( knowledge >= 50) 
		{ result = "E급 수강몬";}
		
		else if	( knowledge >= 11) 
		{ result = "F급 수강몬";}

		else if	( knowledge <= 10) 
		{ result = "폐급 수강몬";
		System.out.println("재수강 추천!!!");}
		
		else {result="귀신 수강몬";}
		
		if ( happy > 70 && happy > knowledge) {
			result2 =  "행복하지만 멍청한 ";
		} else if (fatigue > 70 && fatigue > knowledge) {
			result2= "건강하지만 멍청한 ";
		}
		
			
			
			
			
		else {result2="";}
 		
		
		
		System.out.println("당신이 키운 " + name+"은(는) " + result2+ result + "!!!\n");
		
	}
	
	public void method2() throws Exception{
	int max2 = Action.size();
		
		int random = (int)(Math.random() * max2); // 0 ~ 리스트의 마지막인데스번호
		
		System.out.println( Action.get(random).getAction() );
	}
	
	public void method3() throws Exception{
	}
	
	public void method4() throws Exception{
	}
	
	public void method5() throws Exception{
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

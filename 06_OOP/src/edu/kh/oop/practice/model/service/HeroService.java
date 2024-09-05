package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero h1 = new Hero("이구역짱","전사",200,20,1,0);
		System.out.println("======= 캐릭터 생성 =======" );
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다.\n", h1.getJob(),h1.getNickname());
		System.out.printf("현재 레벨 : %d\n", h1.getLevel());
		System.out.printf("현재 hp : %d\n", h1.getHp());
		System.out.printf("현재 mp : %d\n", h1.getMp());
		System.out.printf("현재 경험치 : %1s\n", h1.getExp());
		
		Hero h2 = new Hero("Zi존위자드","마법사",100,10,1,0);
		System.out.println("======= 캐릭터 생성 =======" );
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다.\n", h2.getJob(),h2.getNickname());
		System.out.printf("현재 레벨 : %d\n", h2.getLevel());
		System.out.printf("현재 hp : %d\n", h2.getHp());
		System.out.printf("현재 mp : %d\n", h2.getMp());
		System.out.printf("현재 경험치 : %1s\n", h2.getExp());
		
		System.out.printf("======= %s 시점 =======\n", h1.getNickname());
		h1.setExp(100);
		get.h1.Attack();
		h1.setExp(150.5);
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치 : %1s\n", h1.getNickname(), h1.getExp());
		h1.setExp(200);
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치 : %1s\n", h1.getNickname(), h1.getExp());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

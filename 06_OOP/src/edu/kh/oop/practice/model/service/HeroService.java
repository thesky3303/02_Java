package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	public void practice() {
		
		Hero h1 = new Hero("이구역짱","전사",200,20,1,0);
		Hero h2 = new Hero("Zi존위자드","마법사",100,100,1,0);

		
		System.out.printf("======= %s 시점 =======\n", h1.getNickname());
		
		h1.attack(100);
		h1.attack(50.5);
		h1.attack(49.5);
		
		h1.dash();
		h1.dash();
		h1.dash();
		
		System.out.printf(h1.toString(),
				h1.getNickname(),
				h1.getLevel(),
				h1.getHp(),
				h1.getMp(),
				h1.getExp());
		
		System.out.printf("======= %s 시점 =======\n", h2.getNickname());
		
		h2.attack(300);
		h2.dash();
		h2.attack(300);
		h2.attack(300);

		System.out.printf(h2.toString(),
				h2.getNickname(),
				h2.getLevel(),
				h2.getHp(),
				h2.getMp(),
				h2.getExp());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

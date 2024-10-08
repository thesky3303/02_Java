package edu.kh.oop.practice.model.vo;

public class Hero {
	                 
	// 속성
	// 필드 == 멤버 변수
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	// 기본생성자
	public Hero() {}
	
	// 매개변수생성자
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.printf(
				"=======캐릭터 생성=======\n"
				+"%s 직업으로 '%s' 님이 생성되었습니다.\n"
				+"현재 레벨 : %d\n"
				+"현재 hp : %d\n"
				+"현재 mp : %d\n"
				+"현재 경험치 : %.1f\n",
				job, nickname, level, hp, mp, exp);
	}
	
	// 기능
	
	// getter/setter
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	
	/*전달받은경험치를현재경험치에
	누적하고,공격했다는메세지출력.
 	(단,현재경험치가300이상이면
	현재레벨을1증가시키고,
	레벨이올랐다는메세지출력)
	 * */

	public void attack(double exp) {
		this.exp += exp;
	
		System.out.printf("'%s' 은/는 공격을 했다!!! 현재 경험치 : %.1f\n", 
				nickname, this.exp);

		if(this.exp >= 300) {
			level += 1;
			System.out.println("레벨이 올랐습니다!! 현재레벨 : " + level);
		}
	}
	
	/* 대시할때마다 현재mp에서 -10씩감소되며
	 * 대시했다는 메세지출력.
	 * (단,현재mp가0이하라면
	 * 마력이 부족하여 대시할수없다는메세지출력
	 * */
	
	public void dash() {
		if(mp <= 0) {
			System.out.println("[마력 부족] 더 이상 대시 할수 없어요~!");
		} else {
			mp -= 10;
			System.out.printf("'%s' 의 엄청 빠른 대시!!! 남은 마력 : %d\n", 
					nickname, mp);
		}
	}

	
	//호출시해당메서드를호출한 객체의현재정보를출력
	@Override
	public String toString() {
		return "======='%s 님의 정보'=======\n"
				+ "- 현재 레벨 : %d\n"
				+ "- 현재 hp : %d\n"
				+ "- 현재 mp : %d\n"
				+ "- 현재 exp : %.1f\n";
	}
	
	
	
}

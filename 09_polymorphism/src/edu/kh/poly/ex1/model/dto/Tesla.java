package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car { // 전기차

	private int batterCapacity; // 배터리 용량
	
	public Tesla() {}

	// 매개변수생성자 + 상속받은것도 포함
	public Tesla(String engine, String fuel, int wheel, int batterCapacity) {
		super(engine, fuel, wheel);
		this.batterCapacity = batterCapacity;
	}

	public int getBatterCapacity() {
		return batterCapacity;
	}

	public void setBatterCapacity(int batterCapacity) {
		this.batterCapacity = batterCapacity;
	}
	
	// Car. toString() 오버라이딩
	@Override
		public String toString() {
			return super.toString() + " / " + batterCapacity;
		}
	
}

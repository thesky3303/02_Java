package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary; // 급여
	private String dept; // 부서
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String information() {
		// "이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0  / 급여 : 2000000 / 부서 : 영업부"
		return super.information() + 
				String.format(" / 급여 : %d / 부서 : %s", salary, dept);
	}

	
	
	
	
	
	
	
}

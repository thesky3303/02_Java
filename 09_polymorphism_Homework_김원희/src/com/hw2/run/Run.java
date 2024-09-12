package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;

public class Run {
	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
		// 부모타입 참조변수 = 자식객체 (업캐스팅)
		
		// 직원 새로 등록하기 2명
		company.addPerson(new Employee("EMP001", "유재석", "기획팀")); // 다향성 업캐스팅 사용
		company.addPerson(new Employee("EMP002", "정형돈", "개발팀")); // 다향성 업캐스팅 사용
		
		// 등록된 직원 모두 조회
		company.displayAllPersons(); // 동적바인딩
		
		System.out.println("==================================================");
		
		// EMP001 id를 가진 직원 삭제
		company.removePerson("EMP001");
		
		company.displayAllPersons(); // 동적바인딩
		
		
		
		
		
	}
	
}

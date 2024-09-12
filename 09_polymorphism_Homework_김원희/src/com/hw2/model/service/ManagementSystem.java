package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {
	
	// 관리 시스템 인터페이스
	
	void addPerson(Person person); // 사람 추가
	void removePerson(String id); // 사람 삭제
	void displayAllPersons(); // 모든 사람 조회
}

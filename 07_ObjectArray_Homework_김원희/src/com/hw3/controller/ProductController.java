package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = null;
	public static int count = 0; // 클래스명.변수명
	
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10];
	}
	
	
	
	public void mainMenu() {
		
		int menu = 0; 
		
		do {
			System.out.println("=====제품 관리 메뉴=====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 0 : System.out.println("프로그램 종료.."); break;
			default : System.out.println("잘못입력함. 다시입력해라");
			
			}
			
			
		} while(menu != 0);
		
		
	}
	
	
	public void productInput() {
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼에 있는 개행문자 제거
		
		System.out.print("제품 이름 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
		
		
	}
	
	
	public void productPrint() {
		
		for(int i=0; i < count; i++) {
			System.out.println( pro[i].information() );
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

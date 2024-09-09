package edu.kh.oop.practice.snak.controlloer;

// Controller : 사용자의 요청을 받아서 처리하고, 그 입력에 따라
// Model(데이터처리, 비즈니스 로직)과 View(화면 출력)를 연결해준느 역할
import edu.kh.oop.practice.snak.model.vo.Snack;

public class SnackController {
	
	// 필드
	private Snack s = new Snack();
			
	// 생성자
	public SnackController() {} // 기본생성자
	
	// 메서드
	// 데이터를 setter를 이용하여 저장하고,
	// 저장완료 결과 반환하는 메소드
	
	public String saveData(String kind, String name, String flavor, 
	int numOf, int price){
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
	
		return "저장 완료 되었습니다. \n"+
				"\n저장한 정보를 확인하시겠습니까?(y/n) : ";
		
	}
	
	public String comfirmData() {
		// 저장된 데이터를 반환함
		return s.information();
	}

	
	
	
	
	
	
	
}

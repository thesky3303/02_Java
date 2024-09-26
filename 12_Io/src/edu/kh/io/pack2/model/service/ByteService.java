package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */
/**
 * 
 */
public class ByteService {

	/*
	 * 스트림(Stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향으로 흐름
	 * 
	 * 
	 * Bye 기반 스트림
	 * 
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * 
	 * - 최상위 클래스 : inputStream, OutputStream
	 * 
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 *   모든것을 입/출력 할 수 있음
	 *   (단, 통로가 좁다보니 속도가 좀 느림, 
	 *   char 형 문자는 깨질 우려가 있음)
	 *   
	 * 
	 * 
	 * */
	
	// IO 관련된 코드 IOException이 발생될 가능성이 높다!
	// -> 거의 모든 메서드가 throws IOException
	// -> IOException 예외처리 구문을 작성하는 것이 필수!
	
	
	/** 바이트 기반 스트림을 이용한 파일 출력
	 * + 데이터 출력
	 */
	public void fileByteOutput() {
		
		// FileOutputStream 참조 변수 선언 ( OutputStream 을 상속 받은 자식 클래스 )
		FileOutputStream fos = null;
		
		try {
			
			// new FileOutputStream("경로") :
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// 단, 폴더는 생성되지 않음
			// -> 기존 파일이 존재하면 내용을 덮어쓰기함
			
			fos = new FileOutputStream("/io_test/20240926/바이트기반_테스트.txt");
			
			// String 불변성 문제를 해결한 객체 -> 가변성
			
			// StringBuilder(비동기) / StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!\n");
			sb.append("12364567890\n");
			sb.append("!@#$%^&*()_+<>?\n");
			sb.append("가나다라마바사아\n");
			sb.append("와 자바 너무 재밌다.\n");
			sb.append("선생님 저 공부 정말 열심히 할게요~!");
			sb.append("진짜로!! 정말로!! 화이팅!!!");
			
			// 출력방법 1: 한 글자 (2Byte)씩 파일로 출력
			// -> 2Byte 범주의 문자(영어, 숫자, 기본 특수문자 제외)는 
			// 바이트 기반 스트림 통과 시
			// 데이터 손실이 발생해서 글자가 깨지는 문제가 발생
			
			// StringBuilder -> String 변환
			String content = sb.toString();
			
			
			/*
			for(int i =0; i < content.length(); i++) {
				
				char ch = content.charAt(i); // i번째 글자 반환
				fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch 쓰기
			}
			*/
			
			// 출력 방법 2: String을 byte[] 변환 후 출력
			
			// ***** 수행 시간 확인 *****
			// 이시점  write() 수행 전 시간
			// System.nanoTime() : 1970.01.01 09:00:00 부터
			// 현재 시간까지의 차이를 ns(nano second)로 반환
			// 1ms (밀리)     == 1/1000초
			// 1us (마이크로) == 1/1000ms
			// 1ns (나노)     == 1/1000us
			
			long startTime = System.nanoTime();
			
			fos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] : " + (endTime - startTime) + "ns");// 81500ns
			
			
			
			
			// 이시점 write() 수행 후 시간
			
			fos.flush(); // 스트림 안에 남아 있는 모든 데이터를 모두 밀어냄
			
			System.out.println("출력 완료!");
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // try 예외 발생 여부 관계 없이 무조건 수행
			
			// 사용완료한 스트팀을 제거 ( 닫기, 메모리반환) 하는 코드 작성
			// -> 메모리 누수 방지
			
			try {
				// 스트림이 정상 생성된 경우
				// 스트림을 닫는다.
				// close() 메서드도 IOException 발생하기 때문에
				// try-catch 이용하여 예외 처리 필수.
				if( fos != null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
		}
		
	}
		
	/**
	 * 버퍼를 이용한 파일 출력
	 * 
	 * + BufferedOutputStream 보조 스트림 이용
	 */
	public void bufferedFileByteOutput() {
		
		/* 버퍼(Buffer) 란?
		 * -데이터를 모아두는 박스, 바구니 같은 메모리 공간
		 * 
		 * * 버퍼링
		 * - 인터넷 속도 낮음 + 스트리밍 코드가 효율이 안좋음
		 * -> 동영상 재생 중에 미리 앞에 재생될 부분을 다운 받아놔서
		 * 영상을 끊김없이 볼 수 있게함
		 * -> 다운 받아서 저장해놓는 공간 == 버퍼
		 * 
		 * 			BufferedOutputStream / BufferedInputStream
		 * 	출력용 보조 스트림(바이트) / 입력용 보조스트림(바이트)
		 * 
		 * - FileOutputStream은 1바이트씩 데이터를 입출력
		 * -> 통로가 좁아서 데이터 입출력이 느림
		 * 
		 * -> 보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한 번에 입출력!
		 * --> 기반 스트림을 이용하는 횟수가 적어짐
		 * -> 성능, 시간 효율 up!
		 * 
		 * */
		
		FileOutputStream fos = null; // 기반 스트림 참조변수 선언
		
		BufferedOutputStream bos = null; // 보조 스트림 참조변수 선언
		
		
		try {
			
			fos = new FileOutputStream("/io_test/20240926/바이트기반_테스트_Buffered.txt");

			bos =  new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!\n");
			sb.append("12364567890\n");
			sb.append("!@#$%^&*()_+<>?\n");
			sb.append("가나다라마바사아\n");
			sb.append("와 자바 너무 재밌다.\n");
			sb.append("선생님 저 공부 정말 열심히 할게요~!");
			sb.append("진짜로!! 정말로!! 화이팅!!!");

			String content = sb.toString();
			
			long startTime = System.nanoTime();
			
			bos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] : " + (endTime - startTime) + "ns"); // 362000
			// 보조스트림 이용 시 수행 시간이 좀 더 빠르다.
			
			bos.flush(); 
			
			System.out.println("출력 완료!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(bos !=null) bos.close();
				
				// 보조스트림(bos) close()시
				// 보조스트림 생성에 사용된 스트림(fos)도 같이 close()됨
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	
	/**
	 * 바이트 기반 파일 입력
	 */
	public void fileByteInput() {
		
		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		
		try {
			
			fis = new FileInputStream("\\io_test\\20240926\\노래가사.txt");
			// InputStream 만들 때는 해당 경로에 실제 파일이 있어야함
			
			// 방법 1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			// -> 2byte 범주의 글자들이 깨지는 문제가 발생
			
			// byte -> 자바에서 정수형
			// 다루기 힘들기 때문에 정수형 기본형이 int로 변환해서 사용
			
			int value = 0; // 읽어온 바이트값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read(); // 1byte씩 읽어오기
				// 단, 더이상 읽어올 값이 없으면 -1 반환
				
				if(value == -1) break; // 다 읽어왔으면 반복 멈춤
				
				sb.append( (char)value ); // char로 강제 형변환 해서 글자 형태로 sb 추가
				
				
			}
			
			System.out.println(sb.toString()); // 읽어온 내용 콘솔에 출력
			
			// InputStream은 flush() 없음
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			//사용완료된 stream 메모리 반환
			try {
				if(fis != null) fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
	/**
	 * 바이트 기반 파일 입력2
	 */
	public void fileByteInput2() {
		
		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("\\io_test\\20240926\\노래가사.txt");
			
			// 방법 2. 파일에 저장된 모든 byte값을 다 읽어와
			//		byte[] 형태로 반환 받기
			// 		-> byte[] 배열을 이용해서 String 객체 생성
			
			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(fis != null) fis. close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/** BufferedInputStream 보조 스트림을 이용한 성능 향상
	 * 
	 * InputStream의 경우 외부 파일을 읽어올 때 사용
	 * -> 읽어오는 파일의 크기가 작으면 보조 스트림의 성능 이점이 크게 눈에띄지 않음.
	 * 
	 * 
	 * 
	 */
	public void bufferedFileByteInput() {
		
		
		FileInputStream fis = null;
		// 파일 입력용 바이트 보조 스트림 선언
		BufferedInputStream bis = null;
		
		try {
			// 기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20240926\\노래가사.txt");
			
			// 보조 스트림 생성
			bis = new BufferedInputStream(fis);
			
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				// 보조 스트림만 close() 해도 기반 스트림도 같이 close() 됨
				if(bis != null) bis. close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/** 파일 복사
	 * 
	 * 파일 경로를 입력 받아
	 * 지정된 파일과 같은 경로에 복사된 파일 출력하기
	 * 
	 * [실행화면]
	 * 파일 경로 입력 : /io_test/20240926/노래가사.txt
	 * 복사 완료 : /io_test/20240926/노래가사_copy.txt
	 * 
	 * 1) 입력된 경로에 파일이 있는지 검사
	 * 
	 * 2) 있으면 파일 내용을 모두 읽어오기 : FileInputStream + BufferedInputStream
	 * 
	 * 3) 읽어온 내용을 같은 경로 위치에 "파일명_copy" 이름으로 출력
	 * 		: FileOutputStream + BufferedOutputStream
	 * + Scanner 대신 BufferedReader 이용
	 * 
	 */
	public void filecopy() {
		
		// 스트림 참조 변수 선언
		BufferedReader br = null; // 문자열 입력용 스트림
		
		FileInputStream fis = null; // 파일 입력 기반 스트림
		BufferedInputStream bis = null; // 파일 입력 보조 스트림
		
		FileOutputStream fos = null; // 파일 출력 기반 스트림
		BufferedOutputStream bos = null; // 파일 출력 보조 스트림
		
		try {
			
			// 키보드 입력을 받기 위한 스트림 객체 생성
			br = new BufferedReader(new InputStreamReader(System.in));
			
			// 경로 입력 받기
			System.out.println("파일 경로 입력 : ");
			String target = br.readLine(); // 입력된 한 줄 읽어오기
			
			// 해당 경로에 파일이 존재하는지 확인
			File file = new File(target);
			
			if(!file.exists()) { // 해당 경로에 파일이 존재하지 않으면
				System.out.println("[해당 경로에 파일이 존재하지 않습니다.]");
				return;
			}
			
			// ------------------------
			
			// 해당 경로에 파일이 존재하면
			// target이 가리키는 파일을 입력 받을 수 있도록
			// 입력용 스트림 생성
			fis = new FileInputStream(target);  // 입력용 기반 스트림 생성
			bis = new BufferedInputStream(fis); // 입력용 보조 스트림 생성
			
			// 입력용 스트림을 이용해서 target 파일의 내용 입력받기
			byte[] bytes = bis.readAllBytes();
			
			// ------------------------------
			
			// 출력할 파일의 경로 + _copy가 붙은 파일 이름
			// target : /io_test/20240926/노래가사.txt
			// copy   : /io_test/20240926/노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target); // "io_test/20240926/노래가사.txt"
			
			// int String.lastIndexOf("문자열")
			// - String 뒤에서부터 검색해서 
			// "문자열"과 일치하는 부분의 인덱스를 반환
			// 없으면 -1 반환
			int insertPoint = target.lastIndexOf("."); // index 22
			
			sb.insert(insertPoint, "_copy");
			
			String copy = sb.toString(); // 복사할 파일의 경로
			
			// 출력용 스트림 생성
			fos = new FileOutputStream(copy); // "/io_test/20240926/노래가사_copy.txt"
			bos = new BufferedOutputStream(fos);
			
			// 읽어왔던 내용 bytes를 bos를 이용해서 출력
			bos.write(bytes);
			bos.flush(); // 스트림에 남아있는 데이터 모두 밀어내기
			
			System.out.println("복사완료 : " + copy);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				// 사용한 스트림 메모리 모두 반환
				if(br != null) br. close();
				if(bis != null) bis. close(); // fis
				if(bos != null) bos. close(); // fos
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

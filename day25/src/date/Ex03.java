package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		// Date 클래스의 setTime(long time) 을 사용하면 날짜 객체의 시간을 조절할 수 있다
		// Date 클래스의 getTime() 을 사용하면 날짜 객체의 시간 정수를 long으로 반환받는다
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		// 날짜 생성(입력)용
		Date d1 = sdf.parse("2023-11-01");
		Date d2 = sdf.parse("2023-11-30");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");  // 날짜 출력용
		
		for(long ln = d1.getTime(); ln <= d2.getTime(); ln += (1000 * 60 * 60 * 24)){	// 1밀리세컨 1000 이면 1초 - 60이면 1분 - 60이면 시간
			Date d = new Date(ln);
			String s = sdf2.format(d);
			if(s.contains("토요일") || s.contains("일요일")) {
				System.out.println(s);
			} 	// 이 if문이 들어가면 토요일과 일요일만 나타낸다. 
		}	// 반복문으로 23년 11월 1일부터 30일까지 요일을 나타낸다.
		
		int n1 = d1.getYear();			// Deprecated, 이전에 사용되었으나 지금은 사용을 권장하지 않는 함수
		int n2 = d1.getMonth();		// 만료되었음
		int n3 = d1.getDate();		// 다만 이전 버전 프로그램과의 호환성을 위해서 남겨두기는 함
		System.out.printf("%04d년 %02d월 %02d일\n", n1 + 1900, n2 + 1, n3);
		
		long ln = d1.getTime();
		System.out.println(ln);
	}
}

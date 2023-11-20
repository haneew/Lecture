package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		
		List<ScheduleDTO> list = null;
		Handler handler = new Handler();
		SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = null;		// java.util.Date는 java.sql.Date의 슈퍼클래스이다.
		int menu = -1;
		ScheduleDTO dto = null;
		String add;
		
		//select sysdate from dual
		// getDate("sysdate")
		Date now = handler.getSysdate();		// 좌변과 우변의 자료형은 같아야 한다
		
		while(menu != 0) {
			System.out.println("=== DB기준 현재 날짜 ===");
			System.out.println(now);
			System.out.println("=====================");
			System.out.println("1. 검색출력");
			System.out.println("2. 월별검색");
			System.out.println("3. 일정 등록");
			System.out.println("4. 일정 삭제");
			System.out.println("123. 버전 확인");
			System.out.println("0. 종료");
			System.out.println("선택 >>>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 123:
			// 오라클 데이터베이스 버전 정보를 문자열로 출력하기
			// select banner from v$version
				String version = handler.checkVersion();
				System.out.println(version);
				break;
			case 1: 
				list = handler.selectAll();
				for(ScheduleDTO ob : list) {
					System.out.printf("%s : %s ~ %s \n",
							ob.getTitle(), ob.getStart_date(), ob.getEnd_date());
				}
				break;
			case 2: break;
			case 3: 
				try {
					dto = getInfo(sc);
				} catch (Exception e) {
					e.printStackTrace();
				}
				int row = handler.insert(dto);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			case 4: break;
			case 0: break;
			} //switch
		} //end of while
	}
	
	static ScheduleDTO getInfo(Scanner sc) throws Exception {
		ScheduleDTO dto = new ScheduleDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println("Title 입력 : ");
		dto.setTitle(sc.nextLine());
		
		System.out.println("시작일 입력(yy-MM-dd) : ");
		java.util.Date d1 = sdf.parse(sc.nextLine());
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
		dto.setStart_date(d2);
		System.out.println("마감일 입력(yy-MM-dd) : ");
		java.util.Date d3 = sdf.parse(sc.nextLine());
		java.sql.Date d4 = new java.sql.Date(d3.getTime());
		dto.setEnd_date(d4);
		return dto;
	}
	
	
	

}

package date;

import java.sql.*;
import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// hr 계정의employees 테이블에서 first_name과 hire_date만 지정하여
		// DTO혹은 hashmap에 저장하여 리스트로 가져온 후 출력하세요
		// 0) DTO 혹은 hashmap을 저장할 수 있는 리스트 미리 생성
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		// 1) 접속할 주소, 계정, 비밀번호 설정
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "hr";
		String password = "hr";
		
	
		 
		// 2) 드라이버 불러오기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 3) sql준비
		String sql = "select first_name, hire_date from employees";
		// 4) 연결
		Connection conn = DriverManager.getConnection(url, user, password);
		// 5) 상태
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 6) 결과
		ResultSet rs = pstmt.executeQuery();
		// 7) while(rs.next)
		
		while(rs.next()) {
			EmployeeDTO dto = new EmployeeDTO();
			dto.setFirst_Name(rs.getString("first_name"));
			dto.setHireDate(rs.getDate("hire_date"));
			list.add(dto);
		}
		list.forEach(ob -> System.out.printf("%s : %s\n", ob.getFirst_Name(), ob.getHireDate()));
		// 8) 불러온 값을 자바 객체에 저장(dto혹은 hashmap)
		// 9) 리스트에 하나씩 추가
		// 10) 반복문이 끝나면 리스트의 내용을 출력하기
		rs.close();
		pstmt.close();
		conn.close();

	}
}
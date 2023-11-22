package employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeesDAO {
	
	ArrayList<EmployeesDAO> list = new ArrayList<>();
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn ;
	private PreparedStatement pstmt ;
	private ResultSet rs ;
	
	private Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("연결 오류 : " + e);
		} return conn;
	}
	
	public void close() {
		try {
			if(rs != null)  rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {}
	}

	public List<EmployeesDTO> getTimediff() throws SQLException {
		ArrayList<EmployeesDTO> list = new ArrayList<>();
		String sql = " select first_name, salary, hire_date, "
				+ "extract(year from sysdate) - extract(year from hire_date) as diff_date "
				+ "from employees order by diff_date ";
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			EmployeesDTO dto = new EmployeesDTO();
			dto.setFirst_name(rs.getString("first_name"));
			dto.setSalary(rs.getInt("salary"));
			dto.setHire_date(rs.getDate("hire_date"));
			dto.setDiff_date(rs.getInt("diff_date"));
			list.add(dto);
		}
		close();
		return list;
		
	}
	
	
	
	
	
	
	
	
	

}

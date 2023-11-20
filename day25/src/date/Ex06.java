package date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		
		
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "hr";
		String password = "hr";
		String sql = "select first_name, department_id from employees";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		
		while(rs.next()) {
			EmployeeDTO dto = new EmployeeDTO();
			dto.setFirst_Name(rs.getString("first_name"));
			dto.setDepartment(rs.getInt("department_id"));
			list.add(dto);
		}
		list.forEach(ob -> System.out.printf("%s %d\n", ob.getFirst_Name(), ob.getDepartment()));
		
		rs.close();
		pstmt.close();
		conn.close();
		
	}
	
	
	
	
}

package employees;

import java.sql.SQLException;
import java.util.List;

public class Handler {

	private EmployeesDAO dao = new EmployeesDAO();
	
	public List<EmployeesDTO> getTimediff() throws SQLException {
		return dao.getTimediff();
	}

}

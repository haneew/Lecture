package schedule;

import java.util.Date;
import java.util.List;

public class Handler {

	private ScheduleDAO dao = new ScheduleDAO();
	
	public List<ScheduleDTO> selectAll() {
		return dao.selectAll();
	}

	public String checkVersion() {
		return dao.checkVersion();
	}

	public Date getSysdate() {
		return dao.getSysdate();
	}

	public int insert(ScheduleDTO dto) {
		return dao.insert(dto);
	}

	

}

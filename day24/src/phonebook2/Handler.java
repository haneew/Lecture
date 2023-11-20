package phonebook2;

import java.util.List;

public class Handler {
	
	
	private PhonebookDAO dao = new PhonebookDAO();

	public List<PhonebookDTO> selectList() throws Exception {
		List<PhonebookDTO> list = dao.selectList();
		return list;
	}

	public int insertPhonebook(PhonebookDTO ob) {
		int row = dao.intsert(ob);
		return row;
	}

	
	
	public int updatePnum(String name, String pnum) {
		int row = dao.updatePnum(name, pnum);
		return row;
	}

	
	
		
	

}

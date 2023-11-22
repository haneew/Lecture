package employees;

import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		
		
		Handler handler = new Handler();
		List<EmployeesDTO> list = handler.getTimediff();
		list.forEach(ob -> System.out.println(ob));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

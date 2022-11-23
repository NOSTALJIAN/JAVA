package task;

import java.time.LocalDate;

public class EmployeeTest {
	
	static EmployeeDAO dao = new EmployeeDAO();
	
	public static void main(String[] args) {
		
		dao.createTable();
		
		dao.insertEmployee(new Employee(133, "강자바", "부장", LocalDate.of(2000, 8, 01)));
		dao.insertEmployee(new Employee(143, "은전기", "차장", LocalDate.of(2003, 1, 01)));
		dao.insertEmployee(new Employee(163, "노전자", "과장", LocalDate.of(2018, 8, 01)));
		dao.insertEmployee(new Employee(173, "권표준", "대리", LocalDate.of(2022, 1, 01)));
		dao.insertEmployee(new Employee(213, "홍정부", "사원", LocalDate.of(2019, 1, 01)));

		dao.printAllEmployee();
	}
}
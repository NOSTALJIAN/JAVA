package mysqll.customer;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DAO dao = new DAO();
		Customer c1 = new Customer("admin","관리자",
							LocalDate.parse("2022-11-17"),0);
//		System.out.println(c1);
//		
//		Customer c2 = new Customer("gdhong", "홍길동");
//		dao.insertCustomer(c2);
		
		List<Customer> list = dao.getCustomers();
		
		dao.insertCustomer(c1);
	}

}
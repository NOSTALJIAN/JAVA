package task;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeMain {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Employee> emp = new HashSet<Employee>();

		
		//종업원 정보 추가_1
		emp.add(new Employee(133, "강자바", "부장", LocalDate.of(2000, 8, 01)));
		emp.add(new Employee(143, "은전기", "차장", LocalDate.of(2003, 1, 01)));
		emp.add(new Employee(163, "노전자", "과장", LocalDate.of(2018, 8, 01)));
		emp.add(new Employee(173, "권표준", "대리", LocalDate.of(2022, 1, 01)));
		emp.add(new Employee(213, "홍정부", "사원", LocalDate.of(2019, 1, 01)));
		
		//종업원 수=?
		System.out.println("총 종업원 수: " + emp.size());
		System.out.println();
		
		//모든 종업원 출력
		Iterator<Employee> iterator = emp.iterator();
		while(iterator.hasNext()) {
			Employee element = iterator.next();
			System.out.println(element);
		}
		System.out.println();
		
		//종업원 정보 추가_2
		emp.add(new Employee(123, "김자바", "부장", LocalDate.of(1998, 1, 01)));
		emp.add(new Employee(163, "노전자", "사원", LocalDate.of(2008, 8, 01)));
		
		//종업원 수=?
		System.out.println("총 종업원 수: " + emp.size());
		System.out.println();
		
		//모든 종업원 출력
		for(Employee e : emp) {
			System.out.println(e);
		}
	}
}
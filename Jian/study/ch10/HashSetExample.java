package study.ch10;

import java.util.HashSet;
import java.util.Set;

/*
 * Set 컬렉션 -> HashSet, LinkedHashSet, TreeSet
 * Set 컬렉션 중 가장 많이 사용되는 HashSet
 * 인덱스로 관리하지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없다
 * Set 컬렉션은 저장 순서가 유지되지 않음
 * 객체 중복 저장 불가
 * 하나의 null만 저장 가능
 * 
 * boolean add(E e) : 주어진 객체를 성공적으로 저장하면 true 리턴, 중복 객체면 false 리턴
 * 
 */
public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
//		Set<String> set = new HashSet<>();
//		Set<> set = new HashSet<>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");		// 중복 객체이므로 저장하지 않음
		set.add("Spring");
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	}
}
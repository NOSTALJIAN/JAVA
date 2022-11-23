package study.ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
	public static void main(String[] args) {
		// Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없음
		
		/* for 문
		Set<E> set = new HashSet<>();
		for (E e : set) {	// ...	} 
		*/
		
		/* Set 컬렉션의 iterator()
		Set<E> set = new HashSet<>();
		Iterator<E> iterator = set.iterator();
		// <E> -> Set 컬렉션에 저장되어 있는 객체의 타입
		while(iterator.hashNext()) {
			E e = iterator.next();
		}
		*/
		
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		//객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			//객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				//가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}
		System.out.println();
		
		//객체 제거
		set.remove("JDBC");
		
		//객체를 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
	}
}
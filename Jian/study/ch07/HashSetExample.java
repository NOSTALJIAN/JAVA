package study.ch07;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();
		
		//Member 객체 저장
		set.add(new Member("서지안", 29));		//
		set.add(new Member("서지안", 29));		//	인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장됨
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수  : " + set.size());
	}
}
package task;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class MemberMain {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<Member> mem = new HashSet<>();
		
		// 회원 정보 추가
		mem.add(new Member("nostal", "0517", "jian", Date.valueOf("1994-05-17"), "nostall.jian@gmail.com", "female", "listening to music, watching movies"));

		// 회원 수 = ?
		System.out.println("총 회원 수: " + mem.size());
		System.out.println();
		
		// 모든 회원 정보 출력
		for(Member m : mem) {
			System.out.println(m);
		}
	}
}
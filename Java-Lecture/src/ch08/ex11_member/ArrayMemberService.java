package ch08.ex11_member;

public class ArrayMemberService implements MemberService {
	private Member[] members = new Member[10];
	
	public void register(String id, String password, String name) {
		Member member = findByID(id);
		if (member != null)	{		// 동일한 id가 이미 존재함
			System.out.println("id가 중복되었습니다.");
			return;
		}
	}
	public void printAllMembers() {
		for (Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}
	public boolean login(String id, String password) {
		Member member = findByID(id);
		if (member == null)			// id에 해당하는 member가 없는 경우
			return false;				
		else {						// id에 해당하는 member를 찾은 경우
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 환영합니다.");
				return true;
			} else					// 패스워드가 틀린 경우
				return false;
		}
	}
	public void logout(String id) {
		Member member = findByID(id);
		System.out.println(member.getName() + "님 로그아웃 되셨습니다.");
	}
	public Member findByID(String id) {
		for (Member member : members) {
			if (member == null)		// id 에 해당하는 member를 못찾고 끝까지 간 경우
				break;
			if (id.equals(member.getId()))		// id에 해당하는 member를 찾은 경우
				return member;
		}
		return null;
	}
}

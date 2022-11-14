package together.ch08.ex11_member;

public interface MemberService {
	void register (String id, String password, String name);
	void printAllMembers();
	Member findByID(String id);
	boolean login(String id, String password);
	void logout(String id);
}

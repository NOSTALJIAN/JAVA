package task;

public class MemberTest {
	static MemberDAO dao = new MemberDAO();

	public static void main(String[] args) {
		dao.createTable();
	}
}
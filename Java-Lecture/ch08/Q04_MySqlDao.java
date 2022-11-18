package ch08;

public class Q04_MySqlDao implements Q04_DataAccessObject {

	public void select() {
		System.out.println("jdbc DB에서 검색");
	}
	public void insert() {
		System.out.println("jdbc DB에 삽입");
	}
	public void update() {
		System.out.println("jdbc DB를 수정");
	}
	public void delete() {
		System.out.println("jdbc DB에서 삭제");
	}
}

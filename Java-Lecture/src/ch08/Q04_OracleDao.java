package src.ch08;
/*
 * Oracle Data Access Object
 */
public class Q04_OracleDao implements Q04_DataAccessObject {

	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

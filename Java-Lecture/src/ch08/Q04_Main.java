package ch08;

public class Q04_Main {

	public static void main(String[] args) {
		dbWork(new Q04_OracleDao());
		dbWork(new Q04_MySqlDao());		//	아래 만든 메소드 dbWork를 부름

	}

	private static void dbWork(Q04_DataAccessObject dao) {		//	dbWork 라는 메소드를 만듬
		dao.select();
		dao.insert();		//	추상 메소드들을 부름
		dao.update();
		dao.delete();
	}
}

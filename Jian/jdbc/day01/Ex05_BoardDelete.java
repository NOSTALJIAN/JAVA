package jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 데이터 삭제
 */
public class Ex05_BoardDelete {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava",
					"nostal",
					"dbsdud94"
					);

			//매개변수화된 SQL 문 작성
			String sql = "DELETE FROM boards WHERE bwriter=?";

			//PreparedStatement 얻기 및 값 결정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "snow");

			//SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수 : " + rows);

			//PreparedStatement 닫기
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
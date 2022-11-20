package jdbc.day03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class PlayerDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	PlayerDAO() {
		try {
			// .properties 파일 이용, 계속 입력할 필요 없게
			InputStream is = new FileInputStream("/Users/NOSTALJIAN/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {							// try 했는데 예외 발생하면 catch
			e.printStackTrace();						// catch하면 콘솔에 출력
		}
	}
	
	//DB 접속
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc.mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//선수 방출
	public void deletePlayer(int backNo) {
		Connection conn = myGetConnection();
		String sql = "" +
				"UPDATE player SET isDeleted=0" +
				"WHERE backNo=?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, backNo);
			
			// Delete - UPDATE 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//선수 업데이트
	public void updatePlayer(PlayerDTO p) {
		Connection conn = myGetConnection();
		String sql = "" +
				"UPDATE player SET name=?, position=?, birthDay=?, height=?, isDeleted=? " +
				"WHERE bno=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setString(2, p.getPosition().toString());
			pstmt.setString(3, p.getBirthDay().toString());
			pstmt.setInt(4, p.getHeight());
			pstmt.setInt(5, p.getIsDeleted());
			pstmt.setInt(6, p.getBackNo());
			
			//UPDATE 실행
			
		} catch (Exception e) {
			
		}
	}
}
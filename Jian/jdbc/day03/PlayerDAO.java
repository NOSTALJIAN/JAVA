package jdbc.day03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
	public Connection myGetConnection() {				// 	myGetConnection 메소드 생성
		Connection conn = null;
		try {
			String connStr = "jdbc.mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//선수 탈퇴
	public void deletePlayer(int backNo) {
		Connection conn = myGetConnection();			//	위에 만들어 둔 myGetConnection 메소드 실행
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
	
	//정보 수정
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
			e.printStackTrace();
		}
	}
	
	//선수 리스트 정보 가져와서
	public PlayerDTO getPlayer(int backNo) {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM player " +
				"WHERE bno=?";
		PlayerDTO p = new PlayerDTO();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, backNo);
			
			//SELECT 실행
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				p.setBackNo(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(Position.valueOf(rs.getString(3)));
				p.setBirthDay(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	//선수 리스트 만들기
	public List<PlayerDTO> getPlayers() {
		Connection conn = myGetConnection();
		List<PlayerDTO> list = new ArrayList<>();
		String sql = "" +
				"SELECT * FROM player " +
				"WHERE isDeleted=0 " +
				"ORDER BY FIELD(`position`, '투수', '포수', '내야수', '외야수');";
		try {
			Statement stmt = conn.createStatement();
			
			//SELECT 실행
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				PlayerDTO p = new PlayerDTO();
				p.setBackNo(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(Position.valueOf(rs.getString(3)));
				p.setBirthDay(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
				list.add(p);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//선수 등록 메소드
	public void insertPlayer(PlayerDTO p) {
		Connection conn = myGetConnection();
		String sql = "" +
				"INSERT INTO player VALUES (?, ?, ?, ?, ?, DEFAULT);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getBackNo());
			pstmt.setString(2, p.getName());
			pstmt.setString(3, p.getPosition().toString());
			pstmt.setString(4, p.getBirthDay().toString());
			pstmt.setInt(5, p.getHeight());
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//테이블 생성 메소드
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "" +
				"CREATE TABLE if NOT EXISTS player ( " +
				"backNo INT PRIMARY KEY, " +
				"name VARCHAR(8) NOT NULL, " +
				"position VARCHAR(8) NOT NULL, " +
				"birthDay DATE, " +
				"height INT, " + 
				"isDeleted INT DEFAULT 0 " +
				");";
		try {
			Statement stmt = conn.createStatement();
			
			stmt.execute(sql);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
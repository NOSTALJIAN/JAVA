package task;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MemberDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	//Constructor
	MemberDAO() {
		try {
			//properties 정보 가져오기
			InputStream is = new FileInputStream("/Users/NOSTALJIAN/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결하기
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(
					connStr,
					user,
					password
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	//employee 테이블 생성
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "" +
				"CREATE TABLE if NOT EXISTS member ( " +
				"	uid VARCHAR(10) PRIMARY KEY, " +
				"	pwd VARCHAR(10), " +
				"	uname VARCHAR(10), " +
				"	birth DATE, " +
				"	email VARCHAR(50), " +
				"	gender VARCHAR(10), " +
				"	hobby VARCHAR(50) " +
				");";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DB에 member 등록
	public void insertMember(Member mem) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO member VALUES (?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getUid());
			pstmt.setString(2, mem.getPwd());
			pstmt.setString(3, mem.getUname());
			pstmt.setDate(4, mem.getBirth());
			pstmt.setString(5, mem.getEmail());
			pstmt.setString(6, mem.getGender());
			pstmt.setString(7, mem.getHobby());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 조회
	public void printAllMembers() {
		Connection conn = myGetConnection();
		try {
			String sql = "" +
					"SELECT uid, pwd, uname, birth, email, gender, hobby " + 
					"FROM member;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Member mem = new Member();
				mem.setUid(rs.getString("uid"));
				mem.setPwd(rs.getString("pwd"));
				mem.setUname(rs.getString("uname"));
				mem.setBirth(rs.getDate("birth"));
				mem.setEmail(rs.getString("email"));
				mem.setGender(rs.getString("gender"));
				mem.setHobby(rs.getString("hobby"));
				System.out.printf("%-6s%-12s%-16s%-40s \n",
						mem.getUid(),
						mem.getPwd(),
						mem.getUname(),
						mem.getBirth(),
						mem.getEmail(),
						mem.getGender(),
						mem.getHobby());
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

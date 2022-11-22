package mysql.bbs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReplyDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	//Constructor
	ReplyDAO() {
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

	public void insertReply(Reply r) {
		Connection conn = myGetConnection();
		String sql = "" +
				"INSERT INTO reply(rcontent, uid, bid) VALUES (?, ?, ?);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getRcontent());
			pstmt.setString(2, r.getUid());
			pstmt.setInt(3, r.getBid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Reply> listReply() {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM reply ORDER BY bid DESC;";
		List<Reply> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Reply r = new Reply();
				r.setBid(rs.getInt(1));
				r.setRcontent(rs.getString(2));
				r.setRegTime(LocalDateTime.parse(rs.getString(3).replace(" ", "T")));
				r.setIsMine(rs.getInt(4));
				r.setUid(rs.getString(5));
				r.setBid(rs.getInt(6));
				list.add(r);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Reply getReply(int rid) {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM reply WHERE rid=?;";
		Reply r = new Reply();
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateReply(Reply r) {
		
	}
	
	public void deleteReply(int rid) {
		
	}
}
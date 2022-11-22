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

public class BoardDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	//Constructor
	BoardDAO() {
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

/*
	//부가 기능 (조회수)
	public void incrementViewCount(int bid) {
		Connection conn = myGetConnection();
		String sql = "" +
				"UPDATE board SET viewCount=viewCount+1 " +
				"WHERE bid=?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//부가 기능 (카운트)
	public void getCount() {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT COUNT(*) FROM board;";
		int count = 0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				count = rs.getInt(1);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
*/
	
	//Method
	public void insertBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "" +
				"INSERT INTO board(btitle, bcontent, uid) VALUES (?, ?, ?);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBtitle());
			pstmt.setString(2, b.getBcontent());
			pstmt.setString(3, b.getUid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Board> listBoard() {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM board ORDER BY bid DESC;";
		List<Board> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board b = new Board();
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
				list.add(b);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Board getBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM board WHERE bid=?;";
		Board b = new Board();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public void updateBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "" +
				"UPDATE Board SET btitle=?, bcontent=?, uid=?, modTime=NOW(), viewCount=?, replyCount=?" +
				"WHERE bid=?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBtitle());
			pstmt.setString(2, b.getBcontent());
			pstmt.setString(3, b.getUid());
			pstmt.setInt(4, b.getViewCount());
			pstmt.setInt(5, b.getReplyCount());
			pstmt.setInt(6, b.getBid());
			
			//UPDATE 실행
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "" +
				"DELETE FROM board " +
				"WHERE bid=?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			
			//DELETE - UPDATE 실행
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
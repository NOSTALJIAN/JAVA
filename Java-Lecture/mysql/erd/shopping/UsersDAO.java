package mysql.erd.shopping;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mindrot.jbcrypt.BCrypt;

import mysql.erd.shopping.erd.Users;

public class UsersDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	//Constructor
	UsersDAO() {
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
	
	//Method
	public Users getUserInfo(String uid) {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM users WHERE uid=?";
		Users u = new Users();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				u.setUid(rs.getString(1));
				u.setUname(rs.getString(2));
				u.setTel(rs.getString(3));
				u.setAddr(rs.getString(4));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	//Method
	public List<Users> listUsers() {
		Connection conn = myGetConnection();
		String sql = "" +
				"SELECT * FROM users ORDER BY uid;";
		List<Users> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Users u = new Users();
				u.setUid(rs.getString(1));
				u.setUname(rs.getString(2));
				u.setTel(rs.getString(3));
				u.setAddr(rs.getString(4));
				list.add(u);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void registerUser(Users u) {
		Connection conn = myGetConnection();
		String sql = "" +
				"INSERT INTO users VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getUid());
			pstmt.setString(2, u.getUname());
			pstmt.setString(3, u.getTel());
			pstmt.setString(4, u.getAddr());
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
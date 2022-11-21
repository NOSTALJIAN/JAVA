package mysql.erd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
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
		
	}
	
	public List<Reply> listReply() {
		
	}
	
	public Reply getReply(int rid) {
		
	}
	
	public void updateReply(Reply r) {
		
	}
	
	public void deleteReply(int rid) {
		
	}
}
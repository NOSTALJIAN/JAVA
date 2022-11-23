package task;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class EmployeeDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	//Constructor
	EmployeeDAO() {
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
				"CREATE TABLE if NOT EXISTS employee ( " +
				"	id INT NOT NULL PRIMARY KEY, " +
				"	name VARCHAR(4) NOT NULL, " +
				"	position VARCHAR(4) NOT NULL, " +
				"	joinDate DATETIME " +
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
	
	//실습1에서 처음에 입력했던 5명을 DB에 등록
	public void insertEmployee(Employee emp) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO employee VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getPosition());
			pstmt.setString(4, emp.getJoinDate().toString());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//입력한 레코드를 조회하는 메소드를 만들어 출력 (입사일의 오름차순)
	public void printAllEmployee() {
		Connection conn = myGetConnection();
		try {
			String sql = "" +
					"SELECT id, name, position, joinDate " +
					"FROM employee " +
					"ORDER BY joinDate;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setPosition(rs.getString("position"));
				emp.setJoinDate(LocalDate.parse(rs.getString("joinDate"), stdFormat));
				System.out.printf("%-6s%-12s%-16s%-40s \n",
						emp.getId(),
						emp.getName(),
						emp.getPosition(),
						emp.getJoinDate());
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
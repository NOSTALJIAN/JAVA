package mysqll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class Ex03_Properties {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Users/NOSTALJIAN/Workspace/mysqll.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			String host = props.getProperty("127.0.0.1");
			String user = props.getProperty("nostal");
			String password = props.getProperty("dbsdud94");
			String database = props.getProperty("world");
			String port = props.getProperty("port", "3306");
			String connStr = "jdbc:mysqll://" + host + ":" + port + "/" + database;
			System.out.println(connStr);
//			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
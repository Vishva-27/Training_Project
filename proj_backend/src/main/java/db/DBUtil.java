package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	static String url = "jdbc:mysql://localhost:3306/project";
	static String username = "root";
	static String password = "root";

	private static Connection conn = null;

	private DBUtil() {
	}

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, username, password);
				return conn;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}

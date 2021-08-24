package Training_Frontend_Controller;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DataSourceUtil {

	
	public static DataSource dataSource() {
		try {
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/project");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
		} catch (Exception ex) {
			return null;
		}
	}
}

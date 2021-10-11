package co.micol.prj.comm;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource { //DAO Data Access Object
	private static DataSource dataSource = new DataSource();
	
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password; // db에서 다룰 매개변수들
	
	private DataSource() {config();}
	
	public static DataSource getInstance() {
		return dataSource;
		
		// singleton class의 기본
	}
	
	private void config() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath(); // 리소스를 읽기 위함
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
//		config();
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
		return conn;
	}
}

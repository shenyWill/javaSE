package cn.yuanwill.JDBC;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class JDBCUtilsConfig {
	private static Connection con;
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	private static void readConfig() throws IOException {
		InputStream is = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(is);

		// ��ȡproperties�е�����
		driver = pro.getProperty("driver");
		url = pro.getProperty("url");
		username = pro.getProperty("username");
		password = pro.getProperty("password");
	}

	static {
		try{
			readConfig();
			// ע�������
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch(Exception ex) {
			
		}
		
	}

	public static Connection getConnection() {
		return con;
	}
}

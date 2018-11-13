package cn.yuanwill.DBCP;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

import cn.yuanwill.JDBC.JDBCUtilsConfig;

public class DataSoruceDemo {

	public static void main(String[] args) throws IOException {
		BasicDataSource dataSource = new BasicDataSource();
		
		InputStream is = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(is);
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(pro.getProperty("url"));
		dataSource.setUsername(pro.getProperty("username"));
		dataSource.setPassword(pro.getProperty("password"));
		
		try {
			Connection con = dataSource.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

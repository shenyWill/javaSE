package cn.yuanwill.gjp.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;


public class JDBCUtils {
	private static BasicDataSource datasource= new BasicDataSource();
	
	public static DataSource getDataSource(){
		return datasource;
	}
	
	static{
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		try {
			pro.load(is);
			datasource.setDriverClassName("com.mysql.jdbc.Driver");
			datasource.setUrl(pro.getProperty("url"));
			datasource.setUsername(pro.getProperty("username"));
			datasource.setPassword(pro.getProperty("password"));
			
			// ���ӳ���������
			datasource.setInitialSize(10); // ��ʼ��������
			datasource.setMaxActive(8); // ���������
			datasource.setMaxIdle(5);
			datasource.setMinIdle(1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

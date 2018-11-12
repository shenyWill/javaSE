package cn.yuanwill.JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCDemo3 {

	public static void main(String[] args) throws IOException {
		// 加载properties配置文件
		InputStream fi = JDBCDemo3.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(fi);
		
		// 获取properties中的数据
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println(url);
	}

}

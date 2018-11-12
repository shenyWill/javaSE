package cn.yuanwill.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1.注册驱动 --> java.sql.DriverManager类静态方法 registerDriver(Driver driver)
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2.获取数据库连接
		String url = "jdbc:mysql://172.16.19.135:3306/shen";
		String username = "root",password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		
		// 3.获得语句执行平台，通过数据库连接对象，获取到SQL语句的执行对象
		Statement stat = con.createStatement();
		int row = stat.executeUpdate("insert into student(uname,uage,umoney) values ('haha', '99', 123.4)");
		System.out.println(row);
		 
		// 4.关闭资源
		stat.close();
		con.close();
	}

}

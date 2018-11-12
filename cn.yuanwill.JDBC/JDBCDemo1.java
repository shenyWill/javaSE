package cn.yuanwill.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.注册驱动 --> java.sql.DriverManager类静态方法 registerDriver(Driver driver)
		Class.forName("com.mysql.jdbc.Driver");

		// 2.获取数据库连接
		String url = "jdbc:mysql://172.16.19.135:3306/shen";
		String username = "root", password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);

		// 3.获得语句执行平台，通过数据库连接对象，获取到SQL语句的执行对象
		Statement stat = con.createStatement();
		
		/*
		 * 查询
		 */
		String select = "select * from student where umoney > 3000";
		ResultSet resultrow = stat.executeQuery(select);
//		System.out.println(resultrow.next());
		
		while(resultrow.next()) {
			System.out.println(
					resultrow.getInt("uid") + "..." + 
					resultrow.getString("uname") + "..." + 
					resultrow.getString("uage") + "..." + 
					resultrow.getDouble("umoney"));
		}
		
		
		// 4.关闭资源
		resultrow.close();
		stat.close();
		con.close();
	}

}

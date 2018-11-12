package cn.yuanwill.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.注册驱动 --> java.sql.DriverManager类静态方法 registerDriver(Driver driver)
		Class.forName("com.mysql.jdbc.Driver");

		// 2.获取数据库连接
		String url = "jdbc:mysql://172.16.19.135:3306/shen";
		String username = "root", password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);


		/*
		 * 查询
		 */
		String select = "select * from student where uname=? and uage=?";
		
		Scanner sc = new Scanner(System.in);
		String uname = sc.nextLine();
		String uage = sc.nextLine();
		
		// 3.使用preparedStatement
		PreparedStatement pstat = con.prepareStatement(select);
		
		pstat.setObject(1, uname);
		pstat.setObject(2, uage);
		
		ResultSet resultrow = pstat.executeQuery();

		while (resultrow.next()) {
			System.out.println(resultrow.getInt("uid") + "..." + resultrow.getString("uname") + "..."
					+ resultrow.getString("uage") + "..." + resultrow.getDouble("umoney"));
		}

		// 4.关闭资源
		resultrow.close();
		pstat.close();
		con.close();
	}

}

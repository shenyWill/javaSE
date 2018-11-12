package cn.yuanwill.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.ע������ --> java.sql.DriverManager�ྲ̬���� registerDriver(Driver driver)
		Class.forName("com.mysql.jdbc.Driver");

		// 2.��ȡ���ݿ�����
		String url = "jdbc:mysql://172.16.19.135:3306/shen";
		String username = "root", password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);

		// 3.������ִ��ƽ̨��ͨ�����ݿ����Ӷ��󣬻�ȡ��SQL����ִ�ж���
		Statement stat = con.createStatement();
		
		/*
		 * ��ѯ
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
		
		
		// 4.�ر���Դ
		resultrow.close();
		stat.close();
		con.close();
	}

}

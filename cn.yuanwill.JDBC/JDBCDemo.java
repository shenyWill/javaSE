package cn.yuanwill.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1.ע������ --> java.sql.DriverManager�ྲ̬���� registerDriver(Driver driver)
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2.��ȡ���ݿ�����
		String url = "jdbc:mysql://172.16.19.135:3306/shen";
		String username = "root",password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		
		// 3.������ִ��ƽ̨��ͨ�����ݿ����Ӷ��󣬻�ȡ��SQL����ִ�ж���
		Statement stat = con.createStatement();
		int row = stat.executeUpdate("insert into student(uname,uage,umoney) values ('haha', '99', 123.4)");
		System.out.println(row);
		 
		// 4.�ر���Դ
		stat.close();
		con.close();
	}

}

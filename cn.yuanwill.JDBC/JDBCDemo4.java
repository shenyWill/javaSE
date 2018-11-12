package cn.yuanwill.JDBC;

import java.sql.Connection;

public class JDBCDemo4 {

	public static void main(String[] args) {
		Connection col = JDBCUtilsConfig.getConnection();
		System.out.println(col);
	}

}

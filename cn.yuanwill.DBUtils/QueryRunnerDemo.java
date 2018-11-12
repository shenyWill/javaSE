package cn.yuanwill.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;

import cn.yuanwill.JDBC.JDBCUtilsConfig;

public class QueryRunnerDemo {
	private static QueryRunner qr =  new QueryRunner();
	private static Connection con = JDBCUtilsConfig.getConnection();
	public static void main(String[] args) throws SQLException {
		select();
		DbUtils.closeQuietly(con);
	}
	
	// �����ݿ���insert����
	public static void insert() throws SQLException{
		
		String sql = "insert into student (uname, uage, umoney) values (?,?,?)";
		Object[] params = {"yes", "55", 236.5};
		int row = qr.update(con, sql, params);
	}
	
	// �������������
	public static void update() throws SQLException{
		String sql = "update student set uname=?,uage=?,umoney=? where uid=?";
		Object[] params = {"wangermazi", "23", "123.456", "13"};
		int row = qr.update(con, sql, params);
	}
	
	// ɾ�����������
	public static void delete() throws SQLException{
		String sql = "delete from student where uid = ?";
		Object[] params = {15};
		int row = qr.update(con, sql, params);
		System.out.println(row);
	}
	
	// ��ѯ�����е�����
	public static void select() throws SQLException{
		String sql = "select * from student";
		Object[] obj = qr.query(con, sql, new ArrayHandler());
		for (Object object : obj) {
			System.out.print(object + "\t");
		}
	}

}

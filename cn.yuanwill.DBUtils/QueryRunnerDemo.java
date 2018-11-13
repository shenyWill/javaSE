package cn.yuanwill.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.yuanwill.JDBC.JDBCUtilsConfig;

public class QueryRunnerDemo {
	private static QueryRunner qr =  new QueryRunner();
	private static Connection con = JDBCUtilsConfig.getConnection();
	public static void main(String[] args) throws SQLException {
		mapListHandler();
		DbUtils.closeQuietly(con);
	}
	
	// 向数据库中insert数据
	public static void insert() throws SQLException{
		
		String sql = "insert into student (uname, uage, umoney) values (?,?,?)";
		Object[] params = {"yes", "55", 236.5};
		int row = qr.update(con, sql, params);
	}
	
	// 给数组更新数据
	public static void update() throws SQLException{
		String sql = "update student set uname=?,uage=?,umoney=? where uid=?";
		Object[] params = {"wangermazi", "23", "123.456", "13"};
		int row = qr.update(con, sql, params);
	}
	
	// 删除数组的数据
	public static void delete() throws SQLException{
		String sql = "delete from student where uid = ?";
		Object[] params = {15};
		int row = qr.update(con, sql, params);
		System.out.println(row);
	}
	
	// 1.查询数组中的数据
	public static void select() throws SQLException{
		String sql = "select * from student";
		Object[] obj = qr.query(con, sql, new ArrayHandler());
		for (Object object : obj) {
			System.out.print(object + "\t");
		}
	}
	
	// 2.查询数组中的数据 listHandler
	public static void arraylistHandler() throws SQLException{
		String sql = "select * from student";
		List<Object[]> result = qr.query(con, sql, new ArrayListHandler());
		for (Object[] objects : result) {
			for (Object object : objects) {
				System.out.print(object+ "\t");
			}
			System.out.println();
		}
	}
	
	// 3.查询数组中的数据到student对象--第一行
	public static void beanHandler() throws SQLException{
		String sql = "select * from student";
		Student s = qr.query(con, sql, new BeanHandler<Student>(Student.class));
		System.out.println(s);
	}
	
	// 4.查询数组中的数据到student对象--每一行 (用的最多)
	public static void beanListHandler() throws SQLException{
		String sql = "select * from student";
		List<Student> studentList = qr.query(con, sql, new BeanListHandler<Student>(Student.class));
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	// 5.查询数组中的数据到columnListHandler
	public static void columnListHandler() throws SQLException{
		String sql = "select * from student";
		List<Object>list = qr.query(con, sql, new ColumnListHandler<Object>("uname"));
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	// 6.查询数组中的数据到ScalarHandler 对于查询的只有一个结果集使用
	public static void scalarHandler() throws SQLException{
		String sql = "select count(*) from student";
		Object o = qr.query(con, sql, new ScalarHandler<Object>());
		System.out.println(o);
	}

	// 7.查询数组中的数据的第一行到map集合中
	public static void mapHandler() throws SQLException{
		String sql = "select * from student";
		Map<String, Object> map = qr.query(con, sql, new MapHandler());
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
	
	// 8.查询数组中的数据到map集合后list集合中
	public static void mapListHandler() throws SQLException{
		String sql = "select * from student";
		List<Map<String, Object>> list = qr.query(con, sql, new MapListHandler());
		for (Map<String, Object> map : list) {
			for (String key: map.keySet()) {
				System.out.print(key + "=" + map.get(key) + "...");
			}
			System.out.println();
		}
	}
}

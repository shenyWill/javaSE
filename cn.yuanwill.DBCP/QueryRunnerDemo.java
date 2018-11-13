package cn.yuanwill.DBCP;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.yuanwill.DBUtils.Student;

public class QueryRunnerDemo {
	private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public static void main(String[] args) {
		select();
	}
	
	// 添加数据
	public static void insert(){
		String sql = "insert into student (uname,uage,umoney) values(?,?,?)";
		Object[] params = {"aaa", "1", 12.5};
		try {
			int i = qr.update(sql, params);
			System.out.println(i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	// 查询数据
	public static void select() {
		String sql = "select * from student";
		try {
			List<Student> list = qr.query(sql, new BeanListHandler<Student>(Student.class));
			for (Student student : list) {
				System.out.println(student);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

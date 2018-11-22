package cn.yuanwill.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;


import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Test {

	public static void main(String[] args) {

	}
	
	@Test
	public void test() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ComboPooledDataSource dataSource = new ComboPooledDataSource(); // ¼ÓÔØÄ¬ÈÏÅäÖÃ
//		ComboPooledDataSource dataSource_name = new ComboPooledDataSource("yuanwill"); // ¼ÓÔØÓÐÃû×ÖµÄÅäÖÃ
		try {
			conn = dataSource.getConnection();
			String sql = "insert into student (uname,uage,umoney) values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "shenyuanwill");
			pstmt.setInt(2, 26);
			pstmt.setDouble(3, 17000.5);
			int row = pstmt.executeUpdate();
			if (row > 0) {
				System.out.println("success!");
			} else {
				System.out.println("error!");
			}
		} catch(Exception e) {
			System.out.println("´íÎó");
			throw new Exception(e);
		}finally {
			
		}
	}
	
	
	@Test
	public void test_1() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = C3P0Utils.getConnection();
			String sql = "insert into student (uname,uage,umoney) values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "shenyuanwill1");
			pstmt.setInt(2, 26);
			pstmt.setDouble(3, 17000.5);
			int row = pstmt.executeUpdate();
			if (row > 0) {
				System.out.println("success!");
			} else {
				System.out.println("error!");
			}
		} catch(Exception e) {
			System.out.println("´íÎó");
			throw new Exception(e);
		}finally {
			
		}
	}

}

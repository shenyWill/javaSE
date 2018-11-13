package cn.yuanwill.gjp.dao;
/*
 * 实现对数据表的增删改查操作
 */

import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.yuanwill.gjp.domain.Zhangwu;
import cn.yuanwill.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	// 查询所有
	public List<Zhangwu> selectAll(){
		try {
			String sql = "select * from gjp";
			List<Zhangwu> list = qr.query(sql, new BeanListHandler<Zhangwu>(Zhangwu.class));
			return list;
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
			throw new RuntimeException("异常");
		}
	}

	public List<Zhangwu> select(String start, String end) {
		String sql = "select * from gjp where createtime between ? and ?";
		Object[] params = {start,end};
		try {
			List<Zhangwu> list = qr.query(sql, new BeanListHandler<Zhangwu>(Zhangwu.class), params);
			return list;
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
			throw new RuntimeException("异常");
		}
	}

	public void addZhangWu(Zhangwu zhangwu) {
		String sql = "insert into gjp (flname,money,zhanghu,createtime,description) values (?,?,?,?,?)";
		Object[] params = {zhangwu.getFlname(), zhangwu.getMoney(), zhangwu.getZhangHu(), zhangwu.getCreatetime(), zhangwu.getDescription()};
		try {
			int i = qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
			throw new RuntimeException("异常");
		}
	}

	public void editZhangWu(Zhangwu zhangwu) {
		String sql = "update gjp set flname=?,money=?,zhanghu=?,createtime=?,description=? where zwid=?";
		Object[] params = {zhangwu.getFlname(), zhangwu.getMoney(), zhangwu.getZhangHu(), zhangwu.getCreatetime(), zhangwu.getDescription(), zhangwu.getZwid()};
		try {
			int i = qr.update(sql, params);
			System.out.println("编辑成功！！");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void deleteZhangwu(int zwid) {
		String sql = "delete from gjp where zwid = ?";
		Object[] params = {zwid};
		try {
			int i = qr.update(sql, params);
			System.out.println("删除成功！！");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

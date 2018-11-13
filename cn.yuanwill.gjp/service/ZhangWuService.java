package cn.yuanwill.gjp.service;
/*
 * 业务层
 * 接收控制层的数据
 */

import java.util.List;

import cn.yuanwill.gjp.dao.ZhangWuDao;
import cn.yuanwill.gjp.domain.Zhangwu;

public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();
	
	// 查询所有
	public List<Zhangwu> selectAll(){
		return dao.selectAll();
	}

	public List<Zhangwu> select(String start, String end) {
		
		return dao.select(start, end);
	}

	public void addZhangWu(Zhangwu zhangwu) {
		dao.addZhangWu(zhangwu);
	}

	public void editZhangWu(Zhangwu zhangwu) {
		dao.editZhangWu(zhangwu);
	}

	public void deleteZhangwu(int zwid) {
		dao.deleteZhangwu(zwid);
	}
}

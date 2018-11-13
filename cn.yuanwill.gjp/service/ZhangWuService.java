package cn.yuanwill.gjp.service;
/*
 * ҵ���
 * ���տ��Ʋ������
 */

import java.util.List;

import cn.yuanwill.gjp.dao.ZhangWuDao;
import cn.yuanwill.gjp.domain.Zhangwu;

public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();
	
	// ��ѯ����
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

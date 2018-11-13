package cn.yuanwill.gjp.controller;
/*
 * 控制器层
 * 接收视图层
 */

import java.util.List;

import cn.yuanwill.gjp.domain.Zhangwu;
import cn.yuanwill.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService zhangwuservice = new ZhangWuService();
	
	/*
	 * 查询所有
	 */
	public List<Zhangwu> selectAll(){
		return zhangwuservice.selectAll();
	}

	public List<Zhangwu> select(String start, String end) {
		
		return zhangwuservice.select(start,end);
	}

	public void addZhangWu(Zhangwu zhangwu) {
		zhangwuservice.addZhangWu(zhangwu);
	}

	public void editZhangWu(Zhangwu zhangwu) {
		zhangwuservice.editZhangWu(zhangwu);
	}

	public void deleteZhangwu(int zwid) {
		zhangwuservice.deleteZhangwu(zwid);
	}
}

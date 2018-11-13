package cn.yuanwill.gjp.view;
/*
 * 视图层
 */

import java.util.List;
import java.util.Scanner;

import cn.yuanwill.gjp.controller.ZhangWuController;
import cn.yuanwill.gjp.domain.Zhangwu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	
	/*
	 * 实现界面效果
	 * 接收用户输入
	 */
	public void run(){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag){
			System.out.println("------------------管家婆家庭记账软件--------------------------");
			System.out.println("1.添加账务  2.编辑账务  3.删除账务  4.查询账务  5.退出系统");
			System.out.println("请输入要操作的序号[1-5]");
			int choose = sc.nextInt();
			switch(choose){
			 case 1:
				 addZhangWu();
				 break;
			 case 2:
				 editZhangwu();
				 break;
			 case 3:
				 deleteZhangwu();
				 break;
			 case 4:
				 selectZhangWu();
				 break;
			 case 5:
				 System.exit(0);
				 break;
			}
		}
	}
	
	private void deleteZhangwu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("选择的删除账务功能，请输入一下信息：");
		System.out.println("请选择需要删除的ID");
		int zwid = sc.nextInt();
		controller.deleteZhangwu(zwid);
	}

	private void editZhangwu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("选择的编辑账务功能，请输入一下信息：");
		System.out.println("请选择需要编辑的ID");
		int zwid = sc.nextInt();
		System.out.println("请输入新分类名称");
		String flname = sc.next();
		System.out.println("请输入新金额");
		double money = sc.nextDouble();
		System.out.println("请输入新账户");
		String zhanghu = sc.next();
		System.out.println("请输入新日期");
		String createtime = sc.next();
		System.out.println("输入新具体描述");
		String description = sc.next();
		Zhangwu zhangwu = new Zhangwu(zwid, flname, money, zhanghu, createtime, description);
		controller.editZhangWu(zhangwu);
	}

	private void addZhangWu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("选择的添加账务功能，请输入一下信息：");
		System.out.println("请输入分类名称");
		String flname = sc.next();
		System.out.println("请输入金额");
		double money = sc.nextDouble();
		System.out.println("请输入账户");
		String zhanghu = sc.next();
		System.out.println("请输入日期");
		String createtime = sc.next();
		System.out.println("输入具体描述");
		String description = sc.next();
		Zhangwu zhangwu = new Zhangwu(0, flname, money, zhanghu, createtime, description);
		controller.addZhangWu(zhangwu);
	}

	// 查询
	public void selectZhangWu(){
		System.out.println("1.查询所有  2.条件查询");
		Scanner sc = new Scanner(System.in);
		int selectChooser = sc.nextInt();
		switch (selectChooser) {
		case 1:
			selectAll();
			break;

		default:
			select();
			break;
		}
	}
	// 查询所有
	public void selectAll(){
		List<Zhangwu> list = controller.selectAll();
		print(list);
	}

	private void print(List<Zhangwu> list) {
		if (list.size() == 0) {
			System.out.println("查询结果为空！");
		}else {
			System.out.println("ID\t类别\t账户\t金额\t时间\t说明");
			for (Zhangwu zhangwu : list) {
				System.out.println(zhangwu.getZwid() + "\t" + zhangwu.getFlname() + "\t" +zhangwu.getZhangHu() + "\t" +zhangwu.getMoney() + "\t" +zhangwu.getCreatetime() + "\t" + zhangwu.getDescription());
			}
		}
	}
	// 条件查询
	public void select(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始日期：");
		String start = sc.nextLine();
		System.out.println("请输入结束日期：");
		String end = sc.nextLine();
		List<Zhangwu> list = controller.select(start,end);
		print(list);
	}
}

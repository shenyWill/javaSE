package cn.yuanwill.gjp.view;
/*
 * ��ͼ��
 */

import java.util.List;
import java.util.Scanner;

import cn.yuanwill.gjp.controller.ZhangWuController;
import cn.yuanwill.gjp.domain.Zhangwu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	
	/*
	 * ʵ�ֽ���Ч��
	 * �����û�����
	 */
	public void run(){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag){
			System.out.println("------------------�ܼ��ż�ͥ�������--------------------------");
			System.out.println("1.�������  2.�༭����  3.ɾ������  4.��ѯ����  5.�˳�ϵͳ");
			System.out.println("������Ҫ���������[1-5]");
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
		System.out.println("ѡ���ɾ�������ܣ�������һ����Ϣ��");
		System.out.println("��ѡ����Ҫɾ����ID");
		int zwid = sc.nextInt();
		controller.deleteZhangwu(zwid);
	}

	private void editZhangwu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ѡ��ı༭�����ܣ�������һ����Ϣ��");
		System.out.println("��ѡ����Ҫ�༭��ID");
		int zwid = sc.nextInt();
		System.out.println("�������·�������");
		String flname = sc.next();
		System.out.println("�������½��");
		double money = sc.nextDouble();
		System.out.println("���������˻�");
		String zhanghu = sc.next();
		System.out.println("������������");
		String createtime = sc.next();
		System.out.println("�����¾�������");
		String description = sc.next();
		Zhangwu zhangwu = new Zhangwu(zwid, flname, money, zhanghu, createtime, description);
		controller.editZhangWu(zhangwu);
	}

	private void addZhangWu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ѡ�����������ܣ�������һ����Ϣ��");
		System.out.println("�������������");
		String flname = sc.next();
		System.out.println("��������");
		double money = sc.nextDouble();
		System.out.println("�������˻�");
		String zhanghu = sc.next();
		System.out.println("����������");
		String createtime = sc.next();
		System.out.println("�����������");
		String description = sc.next();
		Zhangwu zhangwu = new Zhangwu(0, flname, money, zhanghu, createtime, description);
		controller.addZhangWu(zhangwu);
	}

	// ��ѯ
	public void selectZhangWu(){
		System.out.println("1.��ѯ����  2.������ѯ");
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
	// ��ѯ����
	public void selectAll(){
		List<Zhangwu> list = controller.selectAll();
		print(list);
	}

	private void print(List<Zhangwu> list) {
		if (list.size() == 0) {
			System.out.println("��ѯ���Ϊ�գ�");
		}else {
			System.out.println("ID\t���\t�˻�\t���\tʱ��\t˵��");
			for (Zhangwu zhangwu : list) {
				System.out.println(zhangwu.getZwid() + "\t" + zhangwu.getFlname() + "\t" +zhangwu.getZhangHu() + "\t" +zhangwu.getMoney() + "\t" +zhangwu.getCreatetime() + "\t" + zhangwu.getDescription());
			}
		}
	}
	// ������ѯ
	public void select(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ���ڣ�");
		String start = sc.nextLine();
		System.out.println("������������ڣ�");
		String end = sc.nextLine();
		List<Zhangwu> list = controller.select(start,end);
		print(list);
	}
}

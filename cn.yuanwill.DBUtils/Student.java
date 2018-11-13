package cn.yuanwill.DBUtils;

public class Student {
	private int uid;
	private String uname;
	private String uage;
	private int umoney;
	public Student(int uid, String uname, String uage, int umoney) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
		this.umoney = umoney;
	}
	public Student() {
		super();
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUage() {
		return uage;
	}
	public void setUage(String uage) {
		this.uage = uage;
	}
	public int getUmoney() {
		return umoney;
	}
	public void setUmoney(int umoney) {
		this.umoney = umoney;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", uname=" + uname + ", uage=" + uage + ", umoney=" + umoney + "]";
	}
	
}

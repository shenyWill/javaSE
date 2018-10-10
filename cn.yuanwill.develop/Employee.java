package cn.yuanwill.develop;

public abstract class Employee {
	private String name;
	private String Id;

	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	
	
	

}

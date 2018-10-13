package cn.yuanwill.Rect;

public class Rectangle {
	private double w;
	private double h;
	public double getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public double getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	
	public double getArea(){
		return w*h;
	}
	
	public double getLong(){
		return (w+h)*2;
	}
	public Rectangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}
	

}

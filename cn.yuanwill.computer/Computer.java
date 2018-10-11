package cn.yuanwill.computer;

public class Computer {
	public void running(){
		System.out.println("computer is running");
	}
	public void openWindow(){
		System.out.println("computer is open window");
	}
	public void useUSB(Interface usb){
		usb.setIn();
		usb.setOut();
	}

}

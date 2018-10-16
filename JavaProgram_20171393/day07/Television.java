package day07;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	//미사용이더라도 기본생성자를 만들어놓아야 골치아프지 않을 것이다.
	public Television() {}
	
	public Television(int c, int v, boolean oF) {
		channel = c;
		volume = v;
		onOff = oF;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
}

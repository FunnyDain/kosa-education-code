package day9;

public class TV {
	private String model;
	private int size;
	private int channel;
	
	public TV(){}

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUP() {
		//먼저 증가하다가 10보다 커졌을 때 1
		channel += 1;
		if(channel>10) {
			channel = 1;
		}
	}

	
	public void channelDown() {
		//먼저 감소하다가 1보다 작을 때 10
		channel -= 1;
		if(channel<1) {
			channel = 10;
		}
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}

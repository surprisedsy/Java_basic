package java1.Day3;

public class TV {
	
	private int channel = 0;
	private int volume = 0;
	private boolean power = false;
	
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	void power(boolean on)
	{
		if(on)
		{
			on = true;
			this.power = on;	
		}
		else
		{
			on = false;
			this.power = on;
		}
	}
	
	void channel(int channel)
	{
		this.channel = channel;
	}
	
	void channel(boolean updown)
	{
		if(updown)
		{
			this.channel++;
		}
		else
		{
			this.channel--;
		}
	}
	
	void volume(int volume)
	{
		this.volume = volume;
	}
	
	void volume(boolean updown)
	{
		if(updown)
		{			
			this.volume++;
		}
		else
		{
			this.volume--;
		}
	}
	
	void status()
	{
		System.out.println("채널 번호 : " + channel);
		System.out.println("볼륨 크기 : " + volume);
		System.out.println("전원 ON/OFF : " + power);
	}
	

}	
	
	
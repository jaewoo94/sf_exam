package com.jaewoo.exam.tv;

public class SamsungTv extends Tv {
	@Override
	void channelUp() 
	{
		setChannel(channel + 5);
	}
	
	public  String toString()
	{
		return String.format("%s의 채널 : %d, 볼륨 : %d", "삼성",channel,volume);
	}
}

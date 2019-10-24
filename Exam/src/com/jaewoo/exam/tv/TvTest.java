package com.jaewoo.exam.tv;

public class TvTest {

	public static void main(String[] args)
	{
		Tv tv = new Tv(330,11); // 주소값(레퍼런스 변수)(참조 변수)
		
		Tv tv2 = new Tv();
		tv2.setChannel(0);
		tv2.setVolume(50);
		tv.setChannel(5);
		tv.showState();
		
		tv2.setVolume(50);
		tv2.showState();
		
		int volume = tv2.getVolume();
		
		System.out.println("tv1의 볼륨 : " + volume);
	}
}

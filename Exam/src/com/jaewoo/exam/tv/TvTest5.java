package com.jaewoo.exam.tv;

public class TvTest5 {
	public static void main(String[] args)
	{
		SamsungTv sstv = new SamsungTv();
		LGTv lgtv = new LGTv();
		
		mainShowState(sstv);
		mainShowState(lgtv);

	}
	static void mainShowState(Tv a)
	{
		a.showState();
	}
}

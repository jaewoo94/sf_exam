package com.jaewoo.exam.tv;

public class LGTv extends Tv {
	
	public static String model;
	
	public LGTv() {};
	
	public LGTv(String model)
	{
		this.model = model;
	}
	
	public static void record()
	{
		System.out.println("녹화를 하고 있습니다.");
	}
	
	@Override
	public String toString()
	{
		return "LGtv 임!!";
	}
	@Override
	void showState()
	{
		System.out.printf("!!!!!!");
	}
}

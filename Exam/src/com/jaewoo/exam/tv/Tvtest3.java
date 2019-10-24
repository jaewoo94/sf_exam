package com.jaewoo.exam.tv;

public class Tvtest3 {
	public static void main(String[] args)
	{
		LGTv lgtv1 = new LGTv("XE-123");
		System.out.println(lgtv1.model);
		
		LGTv lgtv2 = new LGTv("DD-DM");
		System.out.println(lgtv2.model);
		
		LGTv lgtv3 = new LGTv("HF-1113B");
		System.out.println(lgtv3.model);
	}
}
package com.jaewoo.exam.tv;

public class Tvtest2 {
	public static void main(String[] args)
	{
		/*
		LGTv lgtv1 = new LGTv();
		lgtv1.showState();
		lgtv1.setChannel(500);
		lgtv1.showState();
		lgtv1.record();
		
		SamsungTv smtv1 = new SamsungTv();
		smtv1.channelUp();
		smtv1.channelUp();
		smtv1.showState();
		*/
		
		LGTv lgtv2 = new LGTv();
		LGTv lgtv3 = new LGTv();
		SamsungTv smtv2 = new SamsungTv();
		
		System.out.println(lgtv2);
		System.out.println(lgtv3);
		System.out.println(lgtv2.equals(lgtv3));
		System.out.println(lgtv2 == lgtv3);
		System.out.println(smtv2);
	}
}

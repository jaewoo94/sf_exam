package com.jaewoo.exam;

public class ArrayTest {

	public static void main(String[] args)
	{
		int[] array = {4,5,10,22,80,11};
		
		printArrayValue(array);
		
		//int[] array2 = new int[10];
		
		
		String[] array3 = new String[5];
		
		String str1 = new String("하나");
		array3[0] = str1;
		array3[1] = "둘";
		
		printArrayValue(array3);
		
	}
	
	public static void printArrayValue(String[] array)
	{
		for(String str : array)
		{
			System.out.println(str);
		}
	}
	
	public static void printArrayValue(int[] array)
	{
		int sum = 0;
		
		for(int i : array)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}

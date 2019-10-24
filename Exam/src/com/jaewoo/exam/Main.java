package com.jaewoo.exam;

public class Main {
	public static void main(String[] args)
	{
		int line = 6;
		printStar(line);
	}
	
	public static void printStar(int line) 
	{	
		for(int i =0; i< line; i++)
		{
			for(int j =0; j < i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


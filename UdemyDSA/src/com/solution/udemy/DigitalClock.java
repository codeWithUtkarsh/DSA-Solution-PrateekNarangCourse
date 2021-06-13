package com.solution.udemy;

public class DigitalClock {

	public static void main(String[] args)
	{
		getOutPutInFormat(1180);
	}
	
	private static void getOutPutInFormat(int i) {
		int hr = 0;
		while(i >= 60)
		{
			hr++;
			i -=60;
		}
		System.out.printf("%d:%d", hr,i);
	}
}

package com.solution.udemy;

public class StringWindow {

	public static void main(String[] args)
	{
		String a = "hello_world";
		String smallString = "lol";
		System.out.println(getResult(a, smallString));
	}

	private static char[] getResult(String a, String smallString)
	{
		int lPoint = 0;
		int rPoint = 0;
		
		int[] fullString = new int[256];
		int[] patternString = new int[256];
		
		for (int i = 0; i < smallString.length(); i++) {
			patternString[smallString.charAt(i)]++;
		}
		
		while(lPoint < a.length() && rPoint < a.length())
		{
			fullString[a.charAt(rPoint)]++;
			
		}
		return null;
	}

}

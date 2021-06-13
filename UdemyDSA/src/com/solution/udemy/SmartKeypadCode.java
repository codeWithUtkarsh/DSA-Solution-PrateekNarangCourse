package com.solution.udemy;

public class SmartKeypadCode {

	private static final String[] KEYPAD = {"","","ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
	public static void main(String[] args)
	{
		int[] arr = {3,2};
		getResult(arr, new String(""), 0);
	}

	private static void getResult(int[] inp, String out, int pos)
	{
		//base class
		if(inp.length == pos)
			System.out.println(out);

		if(out.length() == inp.length)
			return;

		if(inp[pos] != 0 && inp[pos] != 1)
		{
			//recursive class
			for(Character key : KEYPAD[inp[pos]].toCharArray())
			{
				getResult(inp, out+key, pos+1);
			}
		}
	}
}

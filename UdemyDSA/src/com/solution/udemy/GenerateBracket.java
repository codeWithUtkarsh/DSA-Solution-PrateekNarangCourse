package com.solution.udemy;

public class GenerateBracket {

	public static void main(String[] args)
	{
		int inp = 5;
		generateBracket(inp, new String(), 0, 0, 0);
	}

	private static void generateBracket(int n, String res, int open, int close, int pos)
	{
		//base case
		if(pos == 2*n)
			System.out.println(res);
		
		//recursive case
		if(open < n)
			generateBracket(n, res + "(", open+1, close, pos+1);
		
		if(close < open)
			generateBracket(n, res + ")", open, close+1, pos+1);
		
	}

}

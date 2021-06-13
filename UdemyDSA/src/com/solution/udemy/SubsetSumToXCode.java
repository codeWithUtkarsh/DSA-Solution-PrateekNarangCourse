package com.solution.udemy;

import java.util.Arrays;

public class SubsetSumToXCode {

	public static void main(String[] args)
	{
		int[] inp = {1,2,3,4,5};
		int n = inp.length;
		int sum = 6;
		System.out.println(getResult(inp, n, sum)); //find no of all the subset that sum to a number
	}

	private static int getResult(int[] inp, int len, int sum)
	{
		if(sum == 0)
			return 1;
		
		if(len == 0 && sum!=0)
			return 0;
		
		int start = inp[0];
		int[] newArray = Arrays.copyOfRange(inp, 1, len);
		int a = getResult(newArray, len-1, sum-start);
		int b = getResult(newArray, len-1, sum);
		
		return a+b;
	}
	
}

package com.solution.udemy;

import java.util.Arrays;

public class SortedPermutations {

	public static void main(String[] args)
	{
		solution("abc");
	}

	public static void solution(String s)
	{
		char[] inp = s.toCharArray();
		getPermutation(inp, 0);
	}

	private static void getPermutation(char[] inp, int start)
	{
		//base case
		if(start == inp.length)
		{
			System.out.println(Arrays.toString(inp));
		}

		//recursive case
		for (int i = start; i < inp.length; i++)
		{
			swap(inp, start, i);
			getPermutation(inp, start+1);
			swap(inp, i, start);
		}
	}

	private static void swap(char[] inp, int from, int to)
	{
		char temp = inp[from];
		inp[from] = inp[to];
		inp[to] = temp;
	}
}

package com.solution.udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LadderCode {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokenizer.nextToken());
		System.out.println(getWays(n));
	}

	private static int getWays(int n)
	{
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		
		return getWays(n-1) + getWays(n-2) + getWays(n-3);
	}
}

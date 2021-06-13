package com.solution.udemy;

import java.util.HashMap;
import java.util.Map;

public class UniqueSubstring {

	public static void main(String[] args)
	{
		String a = "prateekbhaiya";
		System.out.println(getResult(a));
	}

	private static int getResult(String a)
	{
		int rPoint = 0;
		int lPoint = 0;
		
		int maxLen = 0;
		Map<Character, Integer> latestIndex = new HashMap<>();
		while(rPoint < a.length() && lPoint < a.length())
		{
			if(latestIndex.get(a.charAt(rPoint)) != null)
			{
				maxLen = Math.max(maxLen, rPoint - lPoint);
				lPoint = latestIndex.get(a.charAt(rPoint)) + 1;
				latestIndex.clear();
				latestIndex.put(a.charAt(rPoint), rPoint);
				rPoint++;
			}else
			{
				latestIndex.put(a.charAt(rPoint), rPoint);
				rPoint++;
			}
		}
		return maxLen;
	}
}

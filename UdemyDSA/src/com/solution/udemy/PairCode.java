package com.solution.udemy;

import java.util.ArrayList;
import java.util.List;

public class PairCode {

	public static void main(String[] args)
	{
		int[] input = {10, 5, 2, 3, -6, 9, 11};

		for(int n : getPairs(input, 4)) {
			System.out.println(n);
		}

	}

	private static int[] getPairs(int[] n, int s)
	{
		int[] res = new int[2];
		List<Integer> storedNum = new ArrayList<>();
		for(Integer num : n)
		{
			Integer numTobeFound = s - num;
			if(storedNum.contains(numTobeFound))
			{
				res[0] = num;
				res[1] = numTobeFound;
				break;
			}else
			{
				storedNum.add(num);
			}
		}
		return res;
	}

	//for two pointer approach the data should be sorted
	@SuppressWarnings("unused")
	private static int[] getPairsByTwoPointerApproach(int[] n, int s) 
	{
		int[] res = new int[2];
		int start = 0;
		int end = n.length-1;

		boolean isPresent = false;
		while(!isPresent && (start < end))
		{
			int total = n[start] + n[end];
			if(total > s)
			{
				end--;
			}else if(total < s)
			{
				start++;
			}else
			{
				res[0] = n[start];
				res[1] = n[end];
				isPresent = true;
			}
		}
		return res;
	}
}

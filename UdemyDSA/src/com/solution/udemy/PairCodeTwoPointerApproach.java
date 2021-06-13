package com.solution.udemy;

import java.util.Arrays;

public class PairCodeTwoPointerApproach {

	public static void main(String[] args)
	{
		int[] input = {10, 5, 2, 3, -6, 9, 11};
		Arrays.sort(input);
		
		for(int n : getPairsByTwoPointerApproach(input, 4)) {
			System.out.println(n);
		}
	}

	//for two pointer approach the data should be sorted
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


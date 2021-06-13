package com.solution.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

	public static void main(String[] args)
	{
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
		int sum = 18;
		Arrays.sort(input);

		List<List<Integer>> result = new ArrayList<>();
		for(int i=0; i<input.length - 2; i++)
		{
			List<Integer> elements = null;
			int start = i+1;
			int end = input.length -1;
			List<List<Integer>> res = getPairsByTwoPointerApproach(input, sum-input[i], start, end);

			if(!res.isEmpty())
			{
				for(List<Integer> resElem : res)
				{
					elements = new ArrayList<>();
					elements.add(input[i]);
					elements.add(resElem.get(0));
					elements.add(resElem.get(1));
					result.add(elements);
				}
			}
		}

		//printing result
		for(int i=0; i<result.size(); i++)
		{
			for(int num : result.get(i))
			{
				System.out.print(num);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	//for two pointer approach the data should be sorted
	private static List<List<Integer>> getPairsByTwoPointerApproach(int[] n, int s, int start, int end) 
	{
		List<List<Integer>> res = new ArrayList<>();
		while(start < end)
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
				res.add(Arrays.asList(n[start], n[end]));
				end--;
				start++;
			}
		}
		return res;
	}
}


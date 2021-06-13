package com.solution.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Housing {

	public static void main(String[] args) {
		
		
		List<List<Integer>> res = getResult(Arrays.asList(1,3,2,1,4,1,3,2,1,1,2), 8);
		for(List<Integer> elem: res)
		{
			System.out.println(elem.get(0)+", "+ elem.get(1));
		}
	}
	
	private static List<List<Integer>> getResult(List<Integer> list, int k)
	{
		List<List<Integer>> res = new ArrayList<>();
		
		int leftPointer = 0;
		int rightPointer = 1;
		
		int cSum = list.get(0);
		while(leftPointer < list.size() && rightPointer < list.size())
		{
			if(cSum > k)
			{
				cSum -= list.get(leftPointer);
				leftPointer++;
			}else if(cSum < k)
			{
				cSum += list.get(rightPointer);
				rightPointer++;
			}else
			{
				res.add(Arrays.asList(leftPointer, rightPointer-1));
				cSum -= list.get(leftPointer);
				leftPointer++;
			}
		}
		return res;
	}

}

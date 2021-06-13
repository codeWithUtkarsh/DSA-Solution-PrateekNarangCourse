package com.solution.udemy;

public class MinimumDifference {

	public static void main(String[] args)
	{
		int[] arr1 = {};
		int[] arr2 = {};
		
		int[] res = getMimDiffPair(arr1, arr2);
		for(int element: res)
		{
			System.out.println(element);
		}
	}

	private static int[] getMimDiffPair(int[] arr1, int[] arr2)
	{
		int[] diffIndex = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++)
		{
			int minDiff = Integer.MAX_VALUE;
			for (int j = 0; j < arr2.length; j++)
			{
				minDiff = Math.min(minDiff, Math.abs(arr1[i] - arr2[j]));
			}
			diffIndex[i] = minDiff;
		}
		
		return null;
	}
	
	

}

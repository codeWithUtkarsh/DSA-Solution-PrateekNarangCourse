package com.solution.udemy;

public class Rains {

	public static void main(String[] args)
	{
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(getTotalWaterTrapper(arr, arr.length));

	}

	private static int getTotalWaterTrapper(int[] arr, int N)
	{
		int[] left = new int[N];
		int[] right = new int[N];
		
		left[0] = arr[0];
		right[N-1] = arr[N-1];
		
		int i = 1;
		while ( i < N)
		{
			left[i] = Math.max(left[i-1], arr[i]);
			right[N-i-1] = Math.max(right[N-i], arr[N-i-1]);
			i++;
		}
		
		int waterTraped = 0;
		for (int j = 0; j < right.length; j++)
		{
			waterTraped += Math.min(left[j], right[j]) - arr[j];
		}
		return waterTraped;
	}

	
}

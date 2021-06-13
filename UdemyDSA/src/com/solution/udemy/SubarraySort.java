package com.solution.udemy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SubarraySort
{
	public static void main(String[] args) throws IOException
	{
		int[] arr = {1,2,3,4,5,8,6,7,9,10,11};
		for(int n: getIndexesToBeSorted(arr, arr.length))
		{
			System.out.println(n);
		}
	}

	private static List<Integer> getIndexesToBeSorted(int[] arr, int length)
	{
		int smallest  = Integer.MAX_VALUE;
		int largest  = Integer.MIN_VALUE;
		
		for (int i = 0; i < length; i++)
		{
			if(i == 0)
			{
				if(arr[i] > arr[i+1])
				{
					smallest = Math.min(arr[i], smallest);
					largest = Math.max(arr[i], largest);
				}
			}else if(i == length-1)
			{
				if(arr[i] < arr[i-1])
				{
					smallest = Math.min(arr[i], smallest);
					largest = Math.max(arr[i], largest);
				}
			}else
			{
				if(arr[i] < arr[i-1] || arr[i] > arr[i+1])
				{
					smallest = Math.min(arr[i], smallest);
					largest = Math.max(arr[i], largest);
				}
			}
		}
		
		//Corner case
		if(smallest == Integer.MAX_VALUE)
		{
			return Arrays.asList(-1, -1);
		}
		
		int left = 0;
		while (arr[left] <= smallest)
		{
			left++;
		}
		
		int right = arr.length -1;
		while(arr[right] >= largest)
		{
			right--;
		}
		return Arrays.asList(left, right);
	}
}

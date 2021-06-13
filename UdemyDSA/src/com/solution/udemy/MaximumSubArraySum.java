package com.solution.udemy;

import java.io.IOException;

public class MaximumSubArraySum {

	public static void main(String[] args) throws IOException
	{
		int[] arr = {-1,-2,-3,-4,-2,-6,-8,1};
		System.out.println(getMaxSubArraySum(arr));
	}

	private static int getMaxSubArraySum(int[] arr)
	{
		int[] leftPrefixSum = new int[arr.length];
		int[] rightPrefixSum = new int[arr.length];
		
		leftPrefixSum[0] = arr[0];
		rightPrefixSum[arr.length-1] = arr[arr.length-1];
		
		int rightEnd = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;
		int countOfNegativeNumber = 0;
		for (int i = 1; i < arr.length; i++)
		{
			if(arr[i] < 0)
			{
				countOfNegativeNumber++;
			}
			
			leftPrefixSum[i] = leftPrefixSum[i-1] + arr[i];
			
			if(leftPrefixSum[i] > sum)
			{
				sum = leftPrefixSum[i];
				rightEnd = i;
			}
		}
		
		//corner case
		if(countOfNegativeNumber == arr.length-1 && arr[0] < 0)
		{
			return 0;
		}
		
		int leftEnd = Integer.MIN_VALUE;
		sum = Integer.MIN_VALUE;
		for (int i = arr.length-2; i >= 0; i--)
		{
			rightPrefixSum[i] = rightPrefixSum[i+1] + arr[i];
			if(rightPrefixSum[i] > sum)
			{
				sum = rightPrefixSum[i];
				leftEnd = i;
			}
		}
		
		sum = 0;
		for (int j = leftEnd; j <= rightEnd; j++)
		{
			sum+=arr[j];
		}
		return sum;
	}
}

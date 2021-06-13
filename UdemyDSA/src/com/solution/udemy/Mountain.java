package com.solution.udemy;

public class Mountain {

	public static void main(String[] args)
	{
		int[] element = {5,6,1,2,3,-2,4,1,2,3,4,5,4,3,2,0};
		System.out.println(getMaxPeakWidth(element, element.length));
	}
	
	private static int getMaxPeakWidth(int[] element, int N)
	{
		int maxWidth = 0;
		for(int i=1; i<=N-2; i++)
		{
			
			if(element[i+1] < element[i] && element[i-1] < element[i]) //peak
			{
				int width = 1;
				int j=i;
				while(j >= 1 && element[j-1] < element[j])
				{
					j--;
					width++;
				}
				
				while(i <= N-2 && element[i+1] < element[i])
				{
					i++;
					width++;
				}
				
				if(width > maxWidth)
				{
					maxWidth = width;
				}
			}else
			{
				i++;
			}
		}
		return maxWidth;
	}
}

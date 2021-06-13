package com.solution.udemy;

import java.util.ArrayList;
import java.util.List;

public class LongestBand {

	public static void main(String[] args)
	{
		int[] elements = {1,9,3,0,18,5,2,4,10,7,12,6};
		 System.out.println(getlongestBand(elements));
	}

	private static int getlongestBand(int[] elements)
	{
		List<Integer> elemList = new ArrayList<>();
		for(int inp: elements){
			elemList.add(inp);
		}
		
		int len = 0;
		for(Integer element: elemList)
		{
			if(!elemList.contains(element-1)) //head
			{
				int internalLen = 0;
				int num = element;
				while(elemList.contains(num))
				{
					internalLen++;
					num++;
				}
				
				if(len < internalLen)
				{
					len = internalLen;
				}
			}
		}
		return len;
	}

}

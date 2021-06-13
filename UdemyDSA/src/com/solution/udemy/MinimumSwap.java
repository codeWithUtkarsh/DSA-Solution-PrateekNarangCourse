package com.solution.udemy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MinimumSwap {
	
	public static void main(String[] args) throws IOException
	{
		int[] arr = {2,4,5,1,3};
		System.out.println(getMinSwap(arr));
	}

	private static int getMinSwap(int[] arr)
	{
		Map<Integer, Integer> arrIndexMap = new TreeMap<>();
		for (int i = 0; i < arr.length; i++)
		{
			arrIndexMap.put(arr[i], i);
		}
		
		boolean[] visitedList = new boolean[arr.length]; 
		int ans = 0;
		for (int i = 0; i < arr.length; i++)
		{
			int corresInd = getCorresIndex(arrIndexMap, i);
			if(visitedList[i] == true || i == corresInd)
			{
				continue;
			}
			
			int node = i;
			int cycle = 0;
			while(!visitedList[node])
			{
				visitedList[node] = true;
				corresInd = getCorresIndex(arrIndexMap, node);
				node = corresInd;
				cycle++;
			}
			
			ans += (cycle -1);
		}
		return ans;
	}

	private static int getCorresIndex(Map<Integer, Integer> arrIndexMap, int i)
	{
		List<Integer> keyList = new ArrayList<>(arrIndexMap.keySet());
		return arrIndexMap.get(keyList.get(i));
	}

}

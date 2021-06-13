package com.solution.udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class StringKeySort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Integer len = Integer.parseInt(sc.nextLine());
		List<String> inpData = new ArrayList<>();
		for (int i = 0; i < len; i++)
		{
			inpData.add(sc.nextLine());
		}
		String additionalInfo = sc.nextLine();
		sc.close();

		System.out.println(getAnswer(len, inpData, additionalInfo));
	}

	private static List<String> getAnswer(Integer len, List<String> inpData, String additionalInfo)
	{
		List<String> result = new ArrayList<>();
		
		String[] splitInfo = additionalInfo.split("\\s+");
		Integer indexOfKeySort = Integer.parseInt(splitInfo[0]);
		Boolean isReverse = Boolean.parseBoolean(splitInfo[1]);
		String sortType = splitInfo[2];

		if(sortType.equals("numeric"))
		{
			Map<Integer, String> dataWithKeyMap = new TreeMap<>();
			for(String info: inpData) {
				String[] elements = info.split("\s+");
				dataWithKeyMap.put(Integer.parseInt(elements[indexOfKeySort-1]), info);
			}
			
			for(Entry<Integer, String> entry: dataWithKeyMap.entrySet()) {
				result.add(entry.getValue());
			}
		}else
		{
			Map<String, String> dataWithKeyMap = new TreeMap<>();
			for(String info: inpData) {
				String[] elements = info.split("\s+");
				dataWithKeyMap.put(elements[indexOfKeySort-1], info);
			}
			
			for(Entry<String, String> entry: dataWithKeyMap.entrySet()) {
				result.add(entry.getValue());
			}
		}
		
		if(isReverse)
			Collections.reverse(result);
		return result;
	}
}

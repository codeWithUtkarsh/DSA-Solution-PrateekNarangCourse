package com.solution.udemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BiggestNumberString {

	public static void main(String[] args)
	{
		List<Integer> lOfInt = Arrays.asList(10,11,20,30,3);
		System.out.println(getResult(lOfInt));
	}
	
	private static List<Integer> getResult(List<Integer> lOfInt)
	{
		Collections.sort(lOfInt, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2)
			{
				String o1s = o1.toString();
	            String o2s = o2.toString();
	 
	            if(o1s.length() == o2s.length()){
	                return o2s.compareTo(o1s);
	            }
	 
	            int mlen = Math.max(o1s.length(), o2s.length());
	            while(o1s.length() < mlen * 2) o1s += o1s;
	            while(o2s.length() < mlen * 2) o2s += o2s;
	 
	            return o2s.compareTo(o1s);
			}
		});
		return lOfInt;
	}

	
	
}

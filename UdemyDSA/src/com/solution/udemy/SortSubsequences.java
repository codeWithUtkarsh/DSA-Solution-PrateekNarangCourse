package com.solution.udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSubsequences {

	public static void main(String[] args)
	{
		List<String> res = new ArrayList<>();
		getResult("abcd", "", res);
		
		Collections.sort(res, new Comparator<String>(){
			public int compare(String a, String b)
			{
				return a.length()-b.length();
			}
		});

		System.out.println(res);
	}

	private static void getResult(String inp, String output, List<String> res)
	{
		if(inp.length() == 0)
		{
			res.add(output);
		}else
		{
			char extractedLetter = inp.charAt(0);
			String subString = inp.substring(1);
			getResult(subString, output + extractedLetter, res);
			getResult(subString, output , res);
		}
	}


}

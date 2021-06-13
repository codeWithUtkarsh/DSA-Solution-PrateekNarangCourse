package com.solution.udemy;

public class CheckSubset {

	public static void main(String[] args)
	{
		String a = "coding minutes";
		String b = "cines";
		System.out.println(isSubset(a, b));
	}
	
	private static boolean isSubset(String a, String b)
	{
		int aStrPointer = 0;
		int bStrPointer = 0;
		
		while(bStrPointer != b.length()-1 || aStrPointer != a.length()-1)
		{
			if(b.charAt(bStrPointer) == a.charAt(aStrPointer))
			{
				aStrPointer++;
				bStrPointer++;
			}else
			{
				aStrPointer++;
			}
		}
		
		if(bStrPointer == b.length()-1) {
			return true;
		}else {
			return false;
		}
	}
}

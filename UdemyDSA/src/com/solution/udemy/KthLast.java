package com.solution.udemy;

public class KthLast {

	public static void main(String[] args) {
		Node nodeA = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null))))));
		Integer res = solution(nodeA, 4);
		System.out.println(res);
	}

	private static int solution(Node nodeA, int k)
	{
		Node a = nodeA;
		Node b = nodeA;
		
		int c = 0;
		while(a != null)
		{
			if(c >= k)
			{
				a = a.next;
				b = b.next;
			}
			else
			{
				a = a.next;
				c++;
			}
		}
		
		return b.data;
	}

}

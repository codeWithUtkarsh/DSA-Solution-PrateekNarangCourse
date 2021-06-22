package com.solution.udemy;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		Node nodeA = new Node(1, new Node(5, new Node(7, new Node(10, null))));
		Node nodeB = new Node(2, new Node(3, new Node(6, null)));
		
		Node res = solution(nodeA, nodeB);
		while(res != null)
		{
			System.out.print(res.data);
			res = res.next;
			if(res != null)
			{
				System.out.print("-->");
			}
		}
	}

	private static Node solution(Node nodeA, Node nodeB)
	{
		//base case
		if(nodeA == null)
			return nodeB;
		else if(nodeB == null)
			return nodeA;
		
		//rec case
		Node nodeC = null;
		if(nodeA.data > nodeB.data)
		{
			nodeC = nodeB;
			nodeC.next = solution(nodeA, nodeB.next);
		}else
		{
			nodeC = nodeA;
			nodeC.next = solution(nodeA.next, nodeB);
		}
		
		return nodeC;
	}

}

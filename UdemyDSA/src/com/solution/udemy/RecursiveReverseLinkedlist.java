package com.solution.udemy;


/*class Node
{
	int data;
	Node next;
	public Node() {
	}
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
}*/

public class RecursiveReverseLinkedlist {

	public static void main(String[] args) {
		Node head = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null))))));
		printLL(head);
		System.out.println();
		Node revHead = solution(head);
		printLL(revHead);
	}

	private static Node solution(Node head)
	{
		//base case 
		if(head.next == null)
			return head;
		
		//recursive case
		Node reversed = solution(head.next);
		head.next.next = head;
		head.next = null;
		return reversed;
	}
	
	private static void printLL(Node head)
	{
		while (head != null) {
			System.out.print(head.data);
			
			head = head.next;
			if(head != null)
			{
				System.out.print("-->");
			}
		}
	}
}

package com.solution.udemy;

/*class Node
{
	Integer data;
	Node next;
	public Node() {
	}
	
	public Node(Integer data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
}*/

public class IterativeReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null))))));
		printLL(head);
		System.out.println();
		Node revHead = solution(head);
		printLL(revHead);
	}

	private static Node solution(Node head)
	{
		Node previous = null;
		Node current = head;
		Node temp = head.next;
		
		while(current != null)
		{
			current.next = previous;
			previous = current;
			current = temp;
			
			if(temp != null)
				temp = temp.next;
			else
				break;
		}
		return previous;
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

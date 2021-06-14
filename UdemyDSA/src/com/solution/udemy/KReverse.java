package com.solution.udemy;

class Node
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
}

public class KReverse {

	public static void main(String[] args) {
		Node head = new Node(0, new Node(1, new Node(2, new Node(3, 
				new Node(4, new Node(5, new Node(6, new Node(7, null))))))));
		printLL(head);
		System.out.println();
		Node revHead = kReverse(head, 5);
		printLL(revHead);
	}

	private static Node kReverse(Node head, int k)
	{
		//base case
		if(head == null)
			return head;
		
		//recursive case
		Node headRef = head;
		for (int i = 1; i < k; i++) {
			head = head.next;
			if(head == null)
				return reverse(headRef);
		}

		Node left = head.next;
		head.next = null;

		Node revSegment = reverse(headRef);
		Node leftover = kReverse(left, k);

		addLL(revSegment, leftover);
		return revSegment;
	}

	private static void addLL(Node revSegment, Node leftover)
	{
		if(revSegment != null) {
			while(revSegment.next != null)
			{
				revSegment = revSegment.next;
			}
			revSegment.next = leftover;
		}
	}

	//Utility methods
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

	private static Node reverse(Node head)
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

}

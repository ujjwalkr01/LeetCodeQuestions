package leetCodeProblems;

import java.io.Console;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedListBalance {

	public static void main(String[] args) {

		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(5);
		head1.next.next.next.next = new Node(6);
		head1.next.next.next.next.next = new Node(6);
		printhead(head1);
		if (findTheDiff(head1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean findTheDiff(Node head1) {

		int sum = 0;
		int length = printhead(head1);

		Node curr = head1;

		while (curr != null) {
			sum += curr.data;
			curr = curr.next;
		}
		// System.out.println(sum);
		if (sum % length == 0) {
			return true;
		}
		return false;
	}

	private static int printhead(Node head1) {
		Node curr = head1;
		int count = 0;
		while (curr != null) {
			// System.out.print(curr.data + " ");
			curr = curr.next;
			count++;
		}
		return count;

	}

}

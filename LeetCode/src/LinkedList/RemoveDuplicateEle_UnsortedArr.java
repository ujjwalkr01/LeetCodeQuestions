package LinkedList;

import java.util.HashSet;

class Node4 {
	int data;
	Node4 next;

	Node4(int data) {
		this.data = data;
		this.next = null;
	}
}

public class RemoveDuplicateEle_UnsortedArr {

	public static void main(String[] args) {

		Node4 head1 = new Node4(10);
		head1.next = new Node4(20);
		head1.next.next = new Node4(30);
		head1.next.next.next = new Node4(20);
		head1.next.next.next.next = new Node4(20);

		deleteDuplicateNode(head1);

		printNodes(head1);

	}

	private static void deleteDuplicateNode(Node4 head1) {
		Node4 curr = head1;

		HashSet<Integer> set = new HashSet<>();

		while (curr.next != null) {
			set.add(curr.data);

			if (set.contains(curr.next.data)) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

	}

	private static void printNodes(Node4 head1) {

		Node4 curr = head1;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}

	}

}

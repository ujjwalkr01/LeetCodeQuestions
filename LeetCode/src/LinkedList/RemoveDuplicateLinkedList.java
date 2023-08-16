package LinkedList;

class Node3 {
	int data;
	Node3 next;

	Node3(int data) {
		this.data = data;
		this.next = null;
	}
}

public class RemoveDuplicateLinkedList {

	public static void main(String[] args) {

		Node3 head1 = new Node3(20);
		head1.next = new Node3(20);
		head1.next.next = new Node3(20);
		head1.next.next.next = new Node3(20);
		head1.next.next.next.next = new Node3(20);

		deleteDuplicateNode(head1);

		printNodes(head1);
	}

	private static void deleteDuplicateNode(Node3 head1) {

		Node3 curr = head1;

		while (curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
	}

	private static void printNodes(Node3 head1) {

		Node3 curr = head1;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}

	}

}

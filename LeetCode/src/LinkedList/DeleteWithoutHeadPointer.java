package LinkedList;

class Node2 {
	int data;
	Node2 next;

	Node2(int data) {
		this.data = data;
		this.next = null;
	}
}

public class DeleteWithoutHeadPointer {

	public static void main(String[] args) {

		Node2 head1 = new Node2(10);
		head1.next = new Node2(20);
		head1.next.next = new Node2(40);
		head1.next.next.next = new Node2(50);
		head1.next.next.next.next = new Node2(60);

		deleteNode(head1.next);

		printNodes(head1);

	}

	private static void deleteNode(Node2 del) {

		del.data = del.next.data;
		del.next = del.next.next;
	}

	private static void printNodes(Node2 head) {

		Node2 curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}

package LinkedList;

class Node1 {
	int data;
	Node1 next;

	Node1(int data) {
		this.data = data;
		this.next = null;
	}
}

public class IdenticalLinkedList {

	public static void main(String[] args) {

		Node1 head1 = new Node1(10);
		head1.next = new Node1(20);
		head1.next.next = new Node1(40);
		head1.next.next.next = new Node1(50);
		head1.next.next.next.next = new Node1(60);

		Node1 head2 = new Node1(10);
		head2.next = new Node1(20);
		head2.next.next = new Node1(40);
		head2.next.next.next = new Node1(500);
		head2.next.next.next.next = new Node1(60);

		if (checkIdenticalLinkList(head1, head2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean checkIdenticalLinkList(Node1 head1, Node1 head2) {

		Node1 curr1 = head1, curr2 = head2;

		while (curr1 != null && curr2 != null) {
			if (curr1.data == curr2.data) {
				curr1 = curr1.next;
				curr2 = curr2.next;
			} else {
				break;
			}
		}

		return (curr1 == null && curr2 == null) ? true : false;
	}

}

package LinkedList;

class Node6 {
	int data;
	Node6 next;

	Node6(int data) {
		this.data = data;
		this.next = null;
	}
}

public class FindNthNodeFromEnd {

	public static void main(String[] args) {

		Node6 head1 = new Node6(1);
		head1.next = new Node6(2);
		head1.next.next = new Node6(3);
		head1.next.next.next = new Node6(4);
		head1.next.next.next.next = new Node6(5);
		head1.next.next.next.next.next = new Node6(6);
		head1.next.next.next.next.next.next = new Node6(7);
		head1.next.next.next.next.next.next.next = new Node6(8);

		int n = 3;

		int count = printNodes(head1);

		findNthNodeFromLast(count, n, head1);
	}

	private static void findNthNodeFromLast(int count, int n, Node6 head1) {

		if (n > count) {
			System.out.println(-1);
			return;
		}

		Node6 curr = head1;
		for (int i = 1; i <= count - n; i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);
	}

	private static int printNodes(Node6 head1) {

		Node6 curr = head1;
		int count = 0;
		while (curr != null) {
			count++;
			System.out.println(curr.data);
			curr = curr.next;
		}
		return count;
	}

}

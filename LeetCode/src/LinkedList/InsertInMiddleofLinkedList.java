package LinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class InsertInMiddleofLinkedList {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(40);
		head.next.next.next = new Node(50);
		head.next.next.next.next = new Node(60);

		int ele = 30;

		insertingElementInMiddle(head, ele);

		printNodes(head);
	}

	private static void insertingElementInMiddle(Node head, int ele) {

		Node temp = new Node(ele);

		Node slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
//		System.out.println(slow.data);
		temp.next = slow.next;
		slow.next = temp;
	}

	private static void printNodes(Node head) {

		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}

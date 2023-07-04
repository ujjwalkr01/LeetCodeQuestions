package leetCodeProblems;


class Nodes1 {
	int data;
	Nodes1 next;

	public Nodes1(int x) {
		this.data = x;
		next = null;
	}
}

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		Nodes1 head = new Nodes1(10);
		head.next = new Nodes1(20);
		head.next.next = new Nodes1(40);
		head.next.next.next = new Nodes1(30);
		head.next.next.next.next = new Nodes1(50);

		printList(head);
		System.out.println();

		head = deleteLastNode(head);
		printList(head);

	}

	private static Nodes1 deleteLastNode(Nodes1 head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Nodes1 curr = head;
		int pos = 0;
		while (curr != null) {
			pos++;
			curr = curr.next;
			;
		}
		Nodes1 temp = head;
		int mid = (pos / 2) + 1;
		System.out.println(mid);
		for (int i = 1; i < mid; i++) {
			temp = temp.next;
		}
		head = temp;
		return head;

	}

	private static void printList(Nodes1 head) {

		Nodes1 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}

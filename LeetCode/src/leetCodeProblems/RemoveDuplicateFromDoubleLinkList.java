package leetCodeProblems;

class Nods {
	int data;
	Nods prev;
	Nods next;

	public Nods(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
}

public class RemoveDuplicateFromDoubleLinkList {

	public static void main(String[] args) {

		Nods head = new Nods(10);
		Nods temp = new Nods(20);
		Nods temp1 = new Nods(20);
		Nods temp2 = new Nods(30);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp;
		temp1.next = temp2;
		temp2.prev = temp1;

		printList(head);
		System.out.println("after removing the duplicates");
		head = removeDuplicate(head);
		printList(head);
	}

	private static Nods removeDuplicate(Nods head) {
		Nods curr = head;
		if (curr == null) {
			return null;
		}
		while (curr.next.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
				curr.next.prev = curr;
			} else {
				curr = curr.next;
			}
		}
		if (curr.data == curr.next.data) {
			curr.next = curr.next.next;
		}
		return head;
	}

	private static void printList(Nods head) {

		Nods curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

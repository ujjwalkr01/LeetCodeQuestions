package leetCodeProblems;

class Nodes2 {
	int data;
	Nodes2 next;

	public Nodes2(int x) {
		this.data = x;
		next = null;
	}
}
public class RemoveLinkedListElement {

	public static void main(String[] args) {

		Nodes2 head = new Nodes2(10);
		head.next = new Nodes2(20);
		head.next.next = new Nodes2(40);
		head.next.next.next = new Nodes2(30);

		printList(head);
        System.out.println();
        int val=20;
		head = deleteLastNode(head,val);		
		printList(head);
	}
	private static Nodes2 deleteLastNode(Nodes2 head,int data) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Nodes2 curr=head;
		Nodes2 temp=new Nodes2(-1);
		temp.next=head;
		Nodes2 prev=temp;
		
		while(curr!=null) {
			if(curr.data==data) {
				System.out.println("i m running");
				prev.next=curr.next;
		
			}else {				
				prev=prev.next;
			}
			curr=curr.next;
		}
		
		return temp.next;

	}

	private static void printList(Nodes2 head) {

		Nodes2 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}

package Data_Structures.LinkedList;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
	}
}

public class ReverseALinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(6);
		head.next = a;
		a.next = b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next = null;
		
		print(head);
		
		System.out.println();
		
		head = reverse(head);
		
		print(head);

	}

	private static void print(Node head) {
		Node p=head;
		while(p!=null){
			System.out.print(p.data + " ");
			p=p.next;
		}
		
	}

	private static Node reverse(Node head) {
		if(head==null  || head.next==null){
			return head;
		}
		Node prev = null;
		Node current = head;
		
		while(current != null){
			
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
			
		}
		return prev;
		
	}

}
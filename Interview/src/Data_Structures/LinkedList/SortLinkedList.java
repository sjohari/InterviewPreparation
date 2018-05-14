package Data_Structures.LinkedList;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val = val;
	}
}

public class SortLinkedList {

	public static void main(String[] args) {
		
		ListNode a =  new ListNode(5);
		ListNode b =  new ListNode(7);
		ListNode c =  new ListNode(6);
		ListNode d =  new ListNode(9);
		ListNode e =  new ListNode(15);	
		ListNode f =  new ListNode(11);
		ListNode g =  new ListNode(8);
		ListNode h =  new ListNode(17);
		ListNode i =  new ListNode(13);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		h.next = i;
		i.next = null;
		ListNode head = mergeSort(a);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}

	private static ListNode mergeSort(ListNode a) {
		
		if(a==null || a.next==null){
			return a;
		}
		
		ListNode mid = findMiddle(a);
		ListNode temp = mid.next;
		mid.next = null;
		//System.out.println(mid.val);
		ListNode left = mergeSort(a);
		
		ListNode right = mergeSort(temp);
		return merge(left,right);
		//return null;
		
	}

	private static ListNode merge(ListNode a, ListNode b) {
		if(a==null)
			return b;
		if(b==null)
			return a;
		ListNode result;
		if(a.val <= b.val){
			result =a;
			result.next = merge(a.next , b);
		}else{
			result =b;
			result.next = merge(a , b.next);
		}
		return result;
	}

	private static ListNode findMiddle(ListNode a) {
		ListNode slow = a;
		ListNode fast = a;
		while(fast!=null && fast.next!=null&& fast.next.next!=null){
			slow= slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}

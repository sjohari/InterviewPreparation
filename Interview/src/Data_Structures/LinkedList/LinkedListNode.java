package Data_Structures.LinkedList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class LinkedListNode {
	int val;
	LinkedListNode next;

	static LinkedListNode sortedMerge(LinkedListNode a, LinkedListNode b){
		
		LinkedListNode result = null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a.val <= b.val){
			result = a;
			result.next = sortedMerge(a.next,b);
		}else{
			result=b;
			result.next = sortedMerge(a, b.next);
		}
		return result;

	}



	static LinkedListNode mergeSort(LinkedListNode start , LinkedListNode end){
		if(start == null || start.next==null){
			return start;
		}
		LinkedListNode temp  = start;
		int count =0;
		while(temp !=null ){
			temp= temp.next;
			count++ ;
		}
		//System.out.println(" count = " + count);
		count = count/2;
		temp = start;
		LinkedListNode prev = null;
		while(count>0){
			prev = temp;
			temp= temp.next;
			count-- ;
		}
		prev.next = null;
		end.next = null;
		LinkedListNode left = mergeSort(start , prev );
		LinkedListNode right = mergeSort(temp, end);
		
		//System.out.println(left.val + "  " + right.val );

		LinkedListNode sortedList = sortedMerge(left,right);
//		while(sortedList != null){
//			System.out.println(sortedList.val + " ");
//			sortedList = sortedList.next;
//		}
		return sortedList;
	}

	static LinkedListNode sortLinkedList(int k, LinkedListNode start, LinkedListNode end ){
		if(start==null || end ==null){
			return null;
		}
		
		int listSize = 0;
		LinkedListNode start1 = end.next;
		end.next = null;
		LinkedListNode sortedList = mergeSort(start, end);
		LinkedListNode x = sortedList;
		while(x.next!=null){
			x=x.next;
		}
		LinkedListNode temp = start1;
		LinkedListNode end1 = null;
		while(listSize < k && temp != null){
			end1 = temp;
			temp = temp.next;
			listSize++;
			if(listSize==k || temp==null){
				//System.out.println(start1.val + " --> " + end1.val );
				x.next = sortLinkedList(k, start1,end1);
			}
		}
		return sortedList;
	}

	static LinkedListNode sort(int k, LinkedListNode list) {
		if(k<=1){
			return list;
		}  
		int listSize = 0;
		LinkedListNode start = list;
		LinkedListNode end = null;
		LinkedListNode temp = start;
		while(listSize < k && temp != null){
			end = temp;
			temp = temp.next;
			listSize++;
		}
		//System.out.println(start.val + "-->  " + end.val );
		return sortLinkedList( k, start , end);
	}


	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		LinkedListNode head = new LinkedListNode();

		head.val = 5;
		

		
		LinkedListNode a =new LinkedListNode();
		a.val = 4;
		
		LinkedListNode b =new LinkedListNode();
		b.val = 9;
		
		LinkedListNode c =new LinkedListNode();
		c.val = 8;
		
		LinkedListNode d =new LinkedListNode();
		d.val = 3;
		
		LinkedListNode e =new LinkedListNode();
		e.val = 1;
		
		head.next = a;
		a.next =b;
		b.next = c;
		c.next =d;
		d.next = e;
		e.next = null;
		
//		while(head != null){
//			System.out.print(head.val + " -- > ");
//			head = head.next;
//		}
		
		LinkedListNode newhead = sort(5, head);
		
		while(newhead != null){
			System.out.print(newhead.val + " -- > "); 
			newhead = newhead.next;
		}
		
		
		
	}

}










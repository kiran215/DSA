package LinkedList;

public class InsertNodeInSortedLL {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		private ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		InsertNodeInSortedLL inll = new InsertNodeInSortedLL();

		inll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);

		inll.head.next = second;
		second.next = third;

		System.out.println("Before inserting ");
		inll.printLL();
		inll.insertNodeInSortedLL(15);
		inll.insertNodeInSortedLL(25);
		inll.insertNodeInSortedLL(35);
		inll.insertNodeInSortedLL(70);
		inll.insertNodeInSortedLL(11);
		System.out.println();
		System.out.println("After inserting ");
		inll.printLL();

	}

	private void insertNodeInSortedLL(int data) {

		ListNode newNode = new ListNode(data);

		ListNode current = head;
		ListNode temp = null;
		
		while(current!=null && current.data<newNode.data) {
			temp=current;
			current=current.next;
		}
		
		newNode.next=current;
		temp.next=newNode;

//		while (current != null) {
//			if (current.next == null && newNode.data > current.data) {
//				current.next = newNode;
//			} else if (newNode.data > current.data && newNode.data < current.next.data) {
//				newNode.next = current.next;
//				current.next = newNode;
//			} else {
//				current = current.next;
//			}
//		}

	}

	private void printLL() {

		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

}

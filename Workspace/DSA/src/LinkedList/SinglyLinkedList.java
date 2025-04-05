package LinkedList;

public class SinglyLinkedList {

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
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(11);
		ListNode third = new ListNode(12);
		ListNode fourth = new ListNode(13);

		// connect all nodes together
		sll.head.next = second;// 10->11
		second.next = third;// 10->11->12
		third.next = fourth;// 10->11->12->13->null
		fourth.next = null;
		sll.printLL();
		System.out.println("Length of Singly Linked list - " + sll.getLength());

	}

	private int getLength() {

		if (head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	private void printLL() {

		// point current to head node
		ListNode current = head;

		// if current node is not null then print and move current pointer to next node
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
}

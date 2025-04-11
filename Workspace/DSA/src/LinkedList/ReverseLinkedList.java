package LinkedList;

public class ReverseLinkedList {

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
		ReverseLinkedList rll = new ReverseLinkedList();

		rll.head = new ListNode(10);

		ListNode second = new ListNode(12);
		ListNode third = new ListNode(13);
		ListNode fourth = new ListNode(14);
		rll.head.next = second;
		second.next = third;
		third.next = fourth;
		rll.printLL();
		ListNode previous = rll.reverseLL();

		rll.printRLL(previous);

	}

	private void printRLL(ListNode previous) {
		ListNode current = previous;
		System.out.println("Reverse linked list");
		while (current != null) {

			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private ListNode reverseLL() {

		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		return previous;

	}

	private void printLL() {

		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("");
	}

}

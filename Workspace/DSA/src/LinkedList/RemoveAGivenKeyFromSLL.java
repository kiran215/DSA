package LinkedList;

public class RemoveAGivenKeyFromSLL {

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
		RemoveAGivenKeyFromSLL rll = new RemoveAGivenKeyFromSLL();

		rll.head = new ListNode(10);
		ListNode second = new ListNode(13);
		ListNode third = new ListNode(18);
		ListNode fourth = new ListNode(25);

		rll.head.next = second;
		second.next = third;
		third.next = fourth;

		rll.printLL();
		rll.removeKey(30);
		System.out.println();
		System.out.println("After removing key");
		rll.printLL();

	}

	private void removeKey(int key) {

		ListNode current = head;
		ListNode tmp = null;

		// edge case where key is present at head position
		if (current != null && current.data == key) {
			head = head.next;
			return;
		}
		while (current != null && current.data != key) {
			tmp = current;
			current = current.next;
		}
		// edge case where key is not present in singly linked list

		if (current == null) {
			return;
		}
		tmp.next = current.next;

	}

	private void printLL() {

		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

}

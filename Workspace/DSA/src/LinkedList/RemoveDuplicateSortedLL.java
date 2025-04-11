package LinkedList;

public class RemoveDuplicateSortedLL {

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
		RemoveDuplicateSortedLL rdll = new RemoveDuplicateSortedLL();

		rdll.head = new ListNode(15);
		ListNode second = new ListNode(16);
		ListNode third = new ListNode(16);
		ListNode fourth = new ListNode(19);
		ListNode fifth = new ListNode(20);

		rdll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		rdll.removeDuplicate();
		rdll.printLL();
		rdll.deleteFromGivenPosition(2);
		System.out.println();
		rdll.printLL();
	}

	private void deleteFromGivenPosition(int pos) {

		ListNode previous = head;
		int count = 1;
		while (count < pos - 1) {
			previous = previous.next;
			count++;

		}
		ListNode current = previous.next;
		previous.next = current.next;

	}

	private void printLL() {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private void removeDuplicate() {

		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

	}

}

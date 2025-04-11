package LinkedList;

public class FindMiddleNodeInSinglyLL {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next = null;

		private ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		FindMiddleNodeInSinglyLL fmll = new FindMiddleNodeInSinglyLL();

		fmll.head = new ListNode(10);
		ListNode second = new ListNode(21);
		ListNode third = new ListNode(23);
		ListNode fourth = new ListNode(25);
		ListNode fifth = new ListNode(27);

		fmll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		ListNode middleNode = fmll.findMiddleNode();
		System.out.println("Middle node is -" + middleNode.data);

		ListNode nthNodeFromLast = fmll.findNthNodeFromLast(3);
		System.out.println("nthNodeFromLast is -" + nthNodeFromLast.data);

	}

	private ListNode findNthNodeFromLast(int n) {
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;

		if (head == null) {
			return null;
		}

		if (n <= 0) {
			throw new IllegalArgumentException("Invalid value n = " + n);
		}
		while (count < n) {

			if (refPtr == null) {
				throw new IllegalArgumentException(
						"vaule n = " + n + " is greater than number of nodes in linked list");
			}
			refPtr = refPtr.next;
			count++;
		}

		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;

		}
		return mainPtr;
	}

	private ListNode findMiddleNode() {

		if (head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return slowPtr;
	}

}

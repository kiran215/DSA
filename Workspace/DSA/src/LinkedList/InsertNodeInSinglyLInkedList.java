package LinkedList;

public class InsertNodeInSinglyLInkedList {

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
		InsertNodeInSinglyLInkedList isll = new InsertNodeInSinglyLInkedList();
		isll.head = new ListNode(5);

		ListNode second = new ListNode(11);
		ListNode third = new ListNode(12);
		ListNode fourth = new ListNode(13);

		// connect all nodes together
		isll.head.next = second;// 10->11
		second.next = third;// 10->11->12
		third.next = fourth;// 10->11->12->13->null

		isll.printLL();
		System.out.println("Length of Singly Linked list - " + isll.getLength());
		isll.insertNodeAtTheBeginning(20);
		isll.insertNodeAtTheBeginning(25);
		isll.insertNodeAtTheBeginning(30);
		isll.printLL();
		System.out.println("Length of Singly Linked list after insertNodeAtTheBeginning - " + isll.getLength());

		isll.insertNodeAtTheEnd(90);

		isll.printLL();
		System.out.println("Length of Singly Linked list after insertNodeAtTheEnd - " + isll.getLength());
//		isll.insertNodeAtGivenPosition(75, 3);
		isll.insertNodeAtGivenPosition(95, 8);
		isll.printLL();

	}

	private void insertNodeAtGivenPosition(int data, int index) {

		ListNode newNode = new ListNode(data);

		if (index == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode previousNode = head;
			int count = 1;

			while (count < index - 1) {
				previousNode = previousNode.next;
				count++;

			}

			newNode.next = previousNode.next;
			previousNode.next=newNode;
		}

	}

	private void insertNodeAtTheEnd(int i) {
		ListNode newNode = new ListNode(i);
		if (head == null) {
			head = newNode;

		} else {
			ListNode current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	private void insertNodeAtTheBeginning(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;

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

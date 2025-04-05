package LinkedList;

public class SearchNodeInSinglyLinkedList {
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
		SearchNodeInSinglyLinkedList searchLL = new SearchNodeInSinglyLinkedList();

		searchLL.head = new ListNode(10);
		ListNode second = new ListNode(11);
		ListNode third = new ListNode(12);
		ListNode fourth = new ListNode(13);

		// connect all nodes together
		searchLL.head.next = second;// 10->11
		second.next = third;// 10->11->12
		third.next = fourth;// 10->11->12->13->null
		
		System.out.println("found node 11 - "+searchLL.searchNode(11));
		System.out.println("found node 19 - "+searchLL.searchNode(19));

	}

	private  boolean searchNode(int i) {
		
		ListNode current = head;
		
		while(current!=null) {
			if(current.data==i) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

}

package proj;

class Linkedlist {
	Node head;

	class Node {
		int data;
		Node next; // nxt pointer

		Node(int val) {
			data = val;
			next = null;
		}
	}

	public Linkedlist() {
		head = null;
	}

	public void insertAtBegin(int i) {
		Node newnode = new Node(i);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

public class Demaa {

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.insertAtBegin(3);
		l.insertAtBegin(5);
		l.display();
	}

}

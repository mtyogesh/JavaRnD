package com.edu;

public class MyLinkedList {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		list.print();
		list.reverse();
		list.print();
		list.head = list.reverseR(list.head, null);
		list.print();
		list.head = list.reverseR1(list.head);
		list.print();
		

		/*
		 * Node n1 = list.head; Node n2 = list.head.next; //list.head = null;
		 * list.reverse(n1, n2);
		 */
	}

	Node head;

	private void add(String value) {
		Node n = new Node();
		n.value = value;
		if (head == null) {
			head = n;
		} else {
			Node tn = head;
			tn.head = head;
			while (tn.next != null) {
				tn = tn.next;
			}
			tn.next = n;
		}
	}

	private void print() {
		StringBuilder res = new StringBuilder("[");
		Node n = head;
		while (n != null) {
			res.append(n.value);
			if(n.next != null) {
				res.append(", ");
			}
			n = n.next;
		}
		res.append("]");
		System.out.println(res);
	}

	private void reverse() {
		Node n = this.head;
		Node rn = null;
		while (n != null) {
			Node t = n.next;
			n.next = rn;
			rn = n;
			n = t;
		}
		this.head = rn;
	}
	
	private Node reverseR(Node c, Node p) {
		if(c == null) {
			return p;
		}
		Node t = c.next;
		c.next = p;
		p = c;
		c = t;
		return reverseR(c, p);
	}
	
	private Node reverseR1(Node c) {
		if(c == null || c.next == null) {
			return c;
		}
		Node t = c.next;
		c.next = null;
		Node p = reverseR1(t);
		t.next = c;
		return p;
	}

	private void reverseRec(Node n1, Node n2) {
		System.out.println("n1:" + n1.value + " n2:" + n2.value);
		if (n2.next == null) {
			this.head = n2;
			return;
		}
		Node t = n2.next;
		n2.next = n1;
		this.head.next = null;
		reverseRec(n2, t);
	}
}

class Node {
	String value;
	Node next;
	Node head;
}

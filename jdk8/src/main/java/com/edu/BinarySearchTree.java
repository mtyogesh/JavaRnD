package com.edu;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinaryTree<Integer> t = new BinaryTree<>();
		t.add(10);
		t.add(2);
		t.add(12);
		t.add(4);
		t.add(15);
		t.add(9);
		t.add(11);
		
		System.out.println(t.root);
	}

	static class BinaryTree<T extends Comparable<T>> {
		Node<T> root;

		void add(T data) {
			Node<T> n = new Node<>(data);
			if (root == null) {
				root = n;
			} else {
				insert(root, n);
			}
		}
		private void insert(Node<T> p, Node<T> n) {
			//if node is greater than root add node in right else add in left
			boolean addInRight = p.data.compareTo(n.data) < 0;
			if(addInRight) {
				if(p.right == null) {
					p.right = n;
				} else {
					insert(p.right, n);
				}
			} else {
				if(p.left == null) {
					p.left = n;
				} else {
					insert(p.left, n);
				}
			}
		}
		
	}

	static class Node<T> {
		T data;
		Node<T> left;
		Node<T> right;

		public Node(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "[d=" + data + ", l=" + left + ", r=" + right + "]";
		}
		
		
	}
}

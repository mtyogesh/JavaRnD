package com.edu;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinaryTree<Integer> t = new BinaryTree<>();
		t.add(40).add(25).add(78).add(10).add(3).add(17).add(32).add(30).add(38).add(78).add(50).add(93);

		System.out.println("------ In Order ------");
		t.printInOrderRec(t.root);
		System.out.println("\n------ Pre Order ------");
		t.printPreOrderRec(t.root);
		System.out.println("\n------ Post Order ------");
		t.printPostOrderRec(t.root);

	}

	static class BinaryTree<T extends Comparable<T>> {
		Node<T> root;

		BinaryTree<T> add(T data) {
			Node<T> n = new Node<>(data);
			if (root == null) {
				root = n;
			} else {
				insert(root, n);
			}
			return this;
		}

		private void insert(Node<T> p, Node<T> n) {
			// if node is greater than root add node in right else add in left
			boolean addInRight = p.data.compareTo(n.data) < 0;
			if (addInRight) {
				if (p.right == null) {
					p.right = n;
				} else {
					insert(p.right, n);
				}
			} else {
				if (p.left == null) {
					p.left = n;
				} else {
					insert(p.left, n);
				}
			}
		}

		/**
		 * Inorder (Left, Root, Right)
		 * 
		 * @param node
		 */
		void printInOrderRec(Node<T> node) {
			if (node == null) {
				return;
			}
			printInOrderRec(node.left);
			System.out.print(node.data + ", ");
			printInOrderRec(node.right);
		}

		/**
		 * Preorder (Root, Left, Right)
		 * 
		 * @param node
		 */
		void printPreOrderRec(Node<T> node) {
			if (node == null) {
				return;
			}
			System.out.print(node.data + ", ");
			printPreOrderRec(node.left);
			printPreOrderRec(node.right);
		}

		/**
		 * Postorder (Left, Right, Root)
		 * 
		 * @param node
		 */
		void printPostOrderRec(Node<T> node) {
			if (node == null) {
				return;
			}
			printPostOrderRec(node.left);
			printPostOrderRec(node.right);
			System.out.print(node.data + ", ");
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

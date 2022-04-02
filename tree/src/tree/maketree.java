package tree;

import tree.Tree.Node;

class Tree {
	
	class Node {
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
		public void addLeft(Node left) {
			this.left=left;
		}
		public void addRight(Node right) {
			this.right=right;
		}
		public void deleteLeft() {
			left=null;
		}
		public void deleteRight() {
			right=null;
		}
	}
	
	public Node addNode(int data) {
		return new Node(data);
	}
	
	public void preOrder(Node node) {//전위순회
		if(node!=null) {
			System.out.print(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public void inOrder(Node node) {//중위순회
		if(node!=null) {
			inOrder(node.left);
			System.out.print(node.data);
			inOrder(node.right);
		}
	}
	
	public void postOrder(Node node) {//후위순회
		if(node!=null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data);
		}
	}
	
}

public class maketree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree= new Tree();
		Node node1= tree.addNode(1);
		Node node2= tree.addNode(2);
		Node node3= tree.addNode(3);
		Node node4=tree.addNode(4);
		Node node5=tree.addNode(5);
		Node node6=tree.addNode(6);
		Node node7=tree.addNode(7);
		Node node8=tree.addNode(8);
		node1.addLeft(node2);
		node1.addRight(node3);
		node2.addLeft(node4);
		node2.addRight(node5);
		node3.addLeft(node6);
		node3.addRight(node7);
		node4.addLeft(node8);
		
		tree.preOrder(node1);
		System.out.println();
		tree.inOrder(node1);
		System.out.println();
		tree.postOrder(node1);
	}

}

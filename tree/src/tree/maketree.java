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
	
	public void search_node(int data, Node root, int count) {
		if(root.data>data) {
			search_node(data, root.left, ++count);
		}
		else if(root.data==data) {
			System.out.println(root.data + "가 있습니다 탐색수는=" + count);
			System.out.println();
		}
		else if(root.data<data) {
			search_node(data, root.right, ++count);
		}
		else { //null
			return;
		}
	}
	
	/*
	public Node make_inserted_node(int data) {
		System.out.println("노드가 등록 되었습니다");
		return new Node(data);
	}
	
	public Node insert_node(int data, Node root) {
		
		if(root==null) {
			return make_inserted_node(data);
		}
		else if(root.data>data) {
			root.left= insert_node(data, root.left);
		}
		else if(root.data<data) {
			root.right= insert_node(data, root.right);
		}
		return root;
	}
	
	*/
}

public class maketree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 				6
		 			4		7
		 		  2    5		8
		 		 1 3
		 */
		Tree tree= new Tree();
		Node node1= tree.addNode(1);
		Node node2= tree.addNode(2);
		Node node3= tree.addNode(3);
		Node node4=tree.addNode(4);
		Node node5=tree.addNode(5);
		Node node6=tree.addNode(6);
		Node node7=tree.addNode(7);
		Node node8=tree.addNode(8);
		node6.addLeft(node4);
		node6.addRight(node7);
		node4.addLeft(node2);
		node4.addRight(node5);
		node2.addLeft(node1);
		node2.addRight(node3);
		node7.addRight(node8);
		
		tree.preOrder(node6);//64213578
		System.out.println();
		tree.inOrder(node6);//12345678
		System.out.println();
		tree.postOrder(node6);//13254876
		System.out.println();
		
		
		int count=0;
		tree.search_node(2, node6, count); //2가 있습니다 탐색수는=2
		tree.search_node(5, node6, count); //5가 있습니다 탐색수는=2
		tree.search_node(3, node6, count); //3가 있습니다 탐색수는=3
		
		//tree.make_inserted_node(9);
		
	}

}

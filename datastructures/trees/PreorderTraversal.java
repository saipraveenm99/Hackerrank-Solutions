/**
 * 
 * Problem Statement-
 * [Preorder Traversal](https://www.hackerrank.com/challenges/tree-preorder-traversal)   
 * 
 */
/**
 * @author nagasai praveen
 *
 */
class PreorderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}
}
